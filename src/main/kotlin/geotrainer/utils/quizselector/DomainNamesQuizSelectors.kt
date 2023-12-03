package geotrainer.utils.quizselector

import geotrainer.models.countries.Country

fun QuizTypeSelectors.domainNamesQuizSelectors() = listOf<QuestionAnswerSelector<Country, Country>>(
    QuestionAnswerSelector(
        questionSelector = { country ->
            "Which country has the domain '${country.domain.id}'"
        },
        answerSelector = { country -> country.name },
        // TODO for the future - maybe return null for non-similar-sounding countries
        otherOptionsSelector = { country, _ -> country.name }
    ),

    QuestionAnswerSelector(
        questionSelector = { country ->
            "Which domain is used for ${country.name}?"
        },
        answerSelector = { country -> country.domain.id },
        // TODO for the future - maybe return null for non-similar-sounding domains
        otherOptionsSelector = { country, _ -> country.domain.id }
    ),
)