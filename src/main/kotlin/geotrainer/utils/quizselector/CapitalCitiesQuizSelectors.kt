package geotrainer.utils.quizselector

import geotrainer.models.countries.Country

fun QuizTypeSelectors.capitalCitiesQuizSelectors() = listOf<QuestionAnswerSelector<Country, Country>>(
    QuestionAnswerSelector(
        questionSelector = { country ->
            "${country.capitalCities?.random()} is the capital of..."
        },
        answerSelector = { country -> country.name },
        otherOptionsSelector = { country, _ -> country.name }
    ),

    QuestionAnswerSelector(
        questionSelector = { country ->
            "What is the capital of ${country.name}?"
        },
        answerSelector = { country -> country.capitalCities?.random() },
        otherOptionsSelector = { country, _ -> country.capitalCities?.random() }
    )
)