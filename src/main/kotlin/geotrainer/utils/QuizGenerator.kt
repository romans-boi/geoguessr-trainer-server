package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.questionfactory.CapitalCitiesQuestionFactory
import geotrainer.utils.questionfactory.DomainNameQuestionFactory
import geotrainer.utils.questionfactory.DrivingSideQuestionFactory
import geotrainer.utils.questionfactory.QuestionFactory
import geotrainer.utils.quizselector.*

interface QuizGenerator {

}

internal class QuizGeneratorImpl() : QuizGenerator {

    fun generateCapitalCitiesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = CapitalCitiesQuestionFactory(numOfOptions, continent)
    )

    fun generateDomainNamesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = DomainNameQuestionFactory(numOfOptions, continent)
    )

    fun generateDrivingSideQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = DrivingSideQuestionFactory(numOfOptions, continent)
    )

    fun generateEuropeanUnionQuiz(
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuiz(
        numOfQuestions = numOfQuestions,
        numOfOptions = numOfOptions,
        selectors = QuizTypeSelectors.europeanUnionQuizSelectors()
    )


    /**
     * Generates quiz where the Country type used to select the question/answer is the same Country type used
     * to select other options that aren't the answer.
     *
     * */
    @JvmName("generateQuizSameType")
    private inline fun <reified QuestionAnswerOptionsType : Country> generateQuiz(
        numOfQuestions: Int,
        numOfOptions: Int,
        continent: Continent? = null,
        filterOptionsByContinent: Boolean = false,
        selectors: List<QuestionAnswerSelector<QuestionAnswerOptionsType, QuestionAnswerOptionsType>>,
    ): List<QuizQuestion> = generateQuiz<QuestionAnswerOptionsType, QuestionAnswerOptionsType>(
        numOfQuestions = numOfQuestions,
        numOfOptions = numOfOptions,
        continent = continent,
        filterOptionsByContinent = filterOptionsByContinent,
        selectors = selectors
    )

    /**
     * Generates quiz where the Country type used to select the question/answer is different to the Country type used
     * to select other options that aren't the answer.
     *
     * The questions are always filtered by continent if not null. The options are only filtered by continent if
     * filterOptionsByContinent = true.
     * */
    @JvmName("generateQuizDifferentTypes")
    private inline fun <reified QuestionAnswerType : Country, reified OtherOptionsType : Country> generateQuiz(
        numOfQuestions: Int,
        numOfOptions: Int,
        continent: Continent? = null,
        filterOptionsByContinent: Boolean = false,
        selectors: List<QuestionAnswerSelector<QuestionAnswerType, OtherOptionsType>>,
    ): List<QuizQuestion> {
        val allRelevantQuestionCountries = Country.allCountries.filterIsInstance<QuestionAnswerType>()
            // Filter by continent
            .let { filteredList ->
                if (continent != null) {
                    filteredList.filter { it.continent == continent }
                } else {
                    filteredList
                }
            }

        println("DEBUG: ${allRelevantQuestionCountries.map { it::class }}")

        val allRelevantOtherOptionsCountries = Country.allCountries.filterIsInstance<OtherOptionsType>()
            // Filter by continent only if required
            .let { filteredList ->
                if (continent != null && filterOptionsByContinent) {
                    filteredList.filter { it.continent == continent }
                } else {
                    filteredList
                }
            }

        return generateQuiz(
            numOfQuestions = numOfQuestions,
            numOfOptions = numOfOptions,
            selectors = selectors,
            allRelevantQuestionCountries = allRelevantQuestionCountries,
            allRelevantOtherOptionsCountries = allRelevantOtherOptionsCountries
        )
    }

    private inline fun <reified QuestionAnswerType : Country, reified OtherOptionsType : Country> generateQuiz(
        numOfQuestions: Int,
        numOfOptions: Int,
        selectors: List<QuestionAnswerSelector<QuestionAnswerType, OtherOptionsType>>,
        // All the countries that the questions/answers/options can be selected from
        allRelevantQuestionCountries: List<QuestionAnswerType>,
        allRelevantOtherOptionsCountries: List<OtherOptionsType>
    ): List<QuizQuestion> {
        // Keeps track of countries that haven't been selected yet to make sure we don't waste a while loop cycle
        // when we know the QuizQuestion will likely end up being rejected
        val remainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

        // true = yes we care, so don't add a question that already exists
        // false = no we don't care, so add a question that already exists
        // This is needed for when we've run out of questions to ask and still need more questions
        var careIfQuestionAlreadyExists = true
        val quizQuestions = mutableListOf<QuizQuestion>()

        val maxTries = numOfQuestions * 3
        var failedTries = 0
        while (quizQuestions.size < numOfQuestions && (failedTries <= maxTries)) {
            val selector = selectors.random()
            val selectedCountry = remainingRelevantQuestionCountries.random()

            // Get rid of the country no matter if it's selected or not
            // selected = remove, we don't need to select it again
            // rejected = remove, it'll likely just get rejected again
            remainingRelevantQuestionCountries -= selectedCountry

            // Reset remaining relevant countries if we've used all countries.
            // Also, when we reach that point then we don't need to care if questions already exist.
            if (remainingRelevantQuestionCountries.isEmpty()) {
                careIfQuestionAlreadyExists = false
                remainingRelevantQuestionCountries += allRelevantQuestionCountries
            }

            val questionCategory = selector.questionCategorySelector(selectedCountry)
            val answer = selector.answerSelector(selectedCountry)

            if (
                questionCategory == null ||
                answer == null ||
                // If we care about a question already existing, want to avoid
                // having 2 of the same question + answer combination
                (careIfQuestionAlreadyExists &&
                        quizQuestions.any {
                            it.question == selector.questionDisplayName(questionCategory) && it.correctAnswer == answer
                        })
            ) {
                failedTries++
                continue
            }

            val otherOptions = allRelevantOtherOptionsCountries
                .mapNotNull { optionCountry ->
                    // Use the other options selector to get an option that's not the same as the answer
                    selector.otherOptionsSelector(optionCountry)
                        .takeIf { option ->
                            // Check whether the country selected for the option would generate the same output
                            // for the question category. If it does, we can't use it as an option. For example, if
                            // the category is DrivingSide, the answers would never be the same, but the question category
                            // for both the selected country and the option would be e.g. "Left"
                            val doesOptionMatchQuestionCategory = (optionCountry as? QuestionAnswerType)?.let {
                                selector.questionCategorySelector(it) == questionCategory
                            } ?: false

                            option != answer && !doesOptionMatchQuestionCategory
                        }
                }
                .distinct()
                .shuffled()
                .take(numOfOptions - 1)

            // If we couldn't get at least 1 other option, then skip this country as part of the question
            if (otherOptions.isEmpty()) {
                failedTries++
                continue
            }

            quizQuestions.add(
                QuizQuestion(
                    question = selector.questionDisplayName(questionCategory),
                    options = (otherOptions + answer).shuffled(),
                    correctAnswer = answer
                )
            )

            // Reset failed tries
            failedTries = 0
        }

        return quizQuestions
    }

    private fun generateQuizNew(
        numOfQuestions: Int,
        questionFactory: QuestionFactory,
    ): List<QuizQuestion> {
        val quizQuestions = mutableListOf<QuizQuestion>()

        val maxTries = numOfQuestions * 3
        var failedTries = 0
        while (quizQuestions.size < numOfQuestions && (failedTries <= maxTries)) {
            questionFactory.getQuestion()?.let {
                quizQuestions.add(it)
                failedTries = 0
            } ?: run {
                failedTries++
            }
        }

        return quizQuestions
    }
}


fun main() {
    val quizGen = QuizGeneratorImpl()

    listOf(null).forEach { continent ->
        println("================ Quiz for $continent ================")
        val quiz = quizGen.generateDomainNamesQuiz(
            continent = continent,
            numOfQuestions = 15,
            numOfOptions = 4
        )

        quiz.map {
            println("============")
            println("Question: ${it.question}")
            println("Options: ${it.options}")
            //println("Answer: ${it.correctAnswer}")
            println("===========")
            println()
        }
        println()
    }
}