package geotrainer.utils.quizselector

import geotrainer.models.countries.Country

fun QuizTypeSelectors.capitalCitiesQuizSelectors() = listOf<QuestionAnswerSelector<Country, Country>>(
    QuestionAnswerSelector(
        questionCategorySelector = { country -> country.capitalCities?.random() },
        questionDisplayName = { "$it is the capital of..." },
        answerSelector = { country -> country.name },
        otherOptionsSelector = { country -> country.name }
    ),

    QuestionAnswerSelector(
        questionCategorySelector = { country -> country.name },
        questionDisplayName = { "What is the capital of $it?" },
        answerSelector = { country -> country.capitalCities?.random() },
        otherOptionsSelector = { country -> country.capitalCities?.random() }
    )
)