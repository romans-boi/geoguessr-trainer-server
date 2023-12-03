package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.quizselector.*

interface QuizGenerator {

}

internal class QuizGeneratorImpl() : QuizGenerator {

    fun generateCapitalCitiesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuiz(
        numOfQuestions = numOfQuestions,
        numOfOptions = numOfOptions,
        continent = continent,
        filterOptionsByContinent = false,
        selectors = QuizTypeSelectors.capitalCitiesQuizSelectors()
    )

    fun generateDomainNamesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuiz(
        numOfQuestions = numOfQuestions,
        numOfOptions = numOfOptions,
        continent = continent,
        filterOptionsByContinent = false,
        selectors = QuizTypeSelectors.domainNamesQuizSelectors()
    )

    fun generateDrivingSideQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuiz(
        numOfQuestions = numOfQuestions,
        numOfOptions = numOfOptions,
        continent = continent,
        selectors = QuizTypeSelectors.drivingSideQuizSelectors()
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
            .apply {
                if (continent != null) {
                    filter { it.continent == continent }
                }
            }

        val allRelevantOtherOptionsCountries = Country.allCountries.filterIsInstance<OtherOptionsType>()
            // Filter by continent only if required
            .apply {
                if (continent != null && filterOptionsByContinent) {
                    filter { it.continent == continent }
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

            val question = selector.questionSelector(selectedCountry)
            val answer = selector.answerSelector(selectedCountry)

            if (
                question == null ||
                answer == null ||
                // If we care about a question already existing, want to avoid
                // having 2 of the same question + answer combination
                (careIfQuestionAlreadyExists &&
                        quizQuestions.any { it.question == question && it.correctAnswer == answer })
            ) {
                failedTries++
                continue
            }

            val otherOptions = allRelevantOtherOptionsCountries
                .mapNotNull { country ->
                    // Use the other options selector to get an option that's not the same as the answer
                    selector.otherOptionsSelector(country, answer).takeIf { option -> option != answer }
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
                    question = question,
                    options = (otherOptions + answer).shuffled(),
                    correctAnswer = answer
                )
            )
        }

        return quizQuestions
    }
}


fun main() {
}