package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.quiz.QuizType
import geotrainer.models.quiz.QuizQuestion

fun QuizType.generateDataForQuiz(continent: Continent?, numOfQuestions: Int): List<QuizQuestion> = when (this) {
    QuizType.Everything -> TODO()
    QuizType.CapitalCities -> TODO()
    QuizType.DomainNames -> TODO()
    QuizType.DrivingSide -> TODO()
    QuizType.CountryInContinent -> TODO()
    QuizType.JapanesePrefecturesKanji -> TODO()
}


private fun generateCapitalCitiesData(continent: Continent?): List<QuizQuestion> {

    return generateQuiz<Country>(
        numOfQuestions = 5,
        numOfOptions = 4,
        selectors = listOf(
            QuestionAnswerSelector(
                questionSelector = { country -> country.capitalCities?.random() },
                answerSelector = { country -> country.name },
                otherOptionsSelector = { country, _ -> country.name }
            ),
            QuestionAnswerSelector(
                questionSelector = { country -> country.name },
                answerSelector = { country -> country.capitalCities?.random() },
                otherOptionsSelector = { country, _ -> country.name }
            )
        )
    )
}

data class QuestionAnswerSelector<QuestionAnswerType : Country, OtherOptionsType : Country>(
    val questionSelector: (QuestionAnswerType) -> String?,
    val answerSelector: (QuestionAnswerType) -> String?,
    // The answer can be used to decide whether the option should be selected or not.
    val otherOptionsSelector: (OtherOptionsType, answer: String) -> String?
)

@JvmName("generateQuizSameType")
inline fun <reified QuestionAnswerOptionsType : Country> generateQuiz(
    numOfQuestions: Int,
    numOfOptions: Int,
    selectors: List<QuestionAnswerSelector<QuestionAnswerOptionsType, QuestionAnswerOptionsType>>,
): List<QuizQuestion> {
    val allRelevantCountries = Country.allCountries.filterIsInstance<QuestionAnswerOptionsType>()

    return generateQuiz(
        numOfQuestions = numOfQuestions,
        numOfOptions = numOfOptions,
        selectors = selectors,
        allRelevantQuestionCountries = allRelevantCountries,
        allRelevantOtherOptionsCountries = allRelevantCountries
    )
}

@JvmName("generateQuizDifferentTypes")
inline fun <reified QuestionAnswerType : Country, reified OtherOptionsType : Country> generateQuiz(
    numOfQuestions: Int,
    numOfOptions: Int,
    selectors: List<QuestionAnswerSelector<QuestionAnswerType, OtherOptionsType>>
): List<QuizQuestion> {
    val allRelevantQuestionCountries = Country.allCountries.filterIsInstance<QuestionAnswerType>()
    val allRelevantOtherOptionsCountries = Country.allCountries.filterIsInstance<OtherOptionsType>()

    return generateQuiz(
        numOfQuestions = numOfQuestions,
        numOfOptions = numOfOptions,
        selectors = selectors,
        allRelevantQuestionCountries = allRelevantQuestionCountries,
        allRelevantOtherOptionsCountries = allRelevantOtherOptionsCountries
    )
}

inline fun <reified QuestionAnswerType : Country, reified OtherOptionsType : Country> generateQuiz(
    numOfQuestions: Int,
    numOfOptions: Int,
    selectors: List<QuestionAnswerSelector<QuestionAnswerType, OtherOptionsType>>,
    // All the countries that the questions/answers/options can be selected from
    allRelevantQuestionCountries: List<QuestionAnswerType>,
    allRelevantOtherOptionsCountries: List<OtherOptionsType>,
): List<QuizQuestion> {
    // Keeps track of countries that haven't been selected yet to make sure we don't waste a while loop cycle
    // when we know the QuizQuestion will likely end up being rejected
    val remainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

    // true = yes we care, so don't add a question that already exists
    // false = no we don't care, so add a question that already exists
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

        println("DEBUG: $otherOptions")

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

fun main() {
//    val quizQuestions = generateQuiz<Country>(
//        numOfQuestions = 20,
//        numOfOptions = 4,
//        selectors = listOf(
//            QuestionAnswerSelector(
//                questionSelector = { country ->
//                    "${country.capitalCities?.random()} is the capital of..."
//                },
//                answerSelector = { country -> country.name },
//                otherOptionsSelector = { country, _ -> country.name }
//            ),
//
//            QuestionAnswerSelector(
//                questionSelector = { country ->
//                    "What is the capital of ${country.name}?"
//                },
//                answerSelector = { country -> country.capitalCities?.random() },
//                otherOptionsSelector = { country, _ -> country.capitalCities?.random() }
//            )
//        )
//    )

    val quizQuestions = generateQuiz<Country.EuropeanCountry>(
        numOfQuestions = 300,
        numOfOptions = 2,
        selectors = listOf(
            QuestionAnswerSelector(
                questionSelector = { country ->
                    "Is ${country.name} part of the European Union?"
                },
                answerSelector = { country -> if (country.isPartOfEuropeanUnion) "Yes" else "No" },
                otherOptionsSelector = { country, _ -> if (country.isPartOfEuropeanUnion) "Yes" else "No" }
            ),

            QuestionAnswerSelector(
                questionSelector = { "Which country is part of the EU?" },
                answerSelector = { country -> country.name.takeIf { country.isPartOfEuropeanUnion } },
                otherOptionsSelector = { country, _ -> country.name.takeIf { !country.isPartOfEuropeanUnion } }
            ),

            QuestionAnswerSelector(
                questionSelector = { country ->
                    "${country.name} is part of the European Union"
                },
                answerSelector = { country -> if (country.isPartOfEuropeanUnion) "True" else "False" },
                otherOptionsSelector = { country, _ -> if (country.isPartOfEuropeanUnion) "True" else "False" }
            ),
        )
    )


    quizQuestions.map {
        println("==========")
        println("Question: ${it.question}")
        println("Correct answer: ${it.correctAnswer}")
        println("All options: ${it.options}")
        println("==========")
        println()
    }

    println("Total questions: ${quizQuestions.size}")
}