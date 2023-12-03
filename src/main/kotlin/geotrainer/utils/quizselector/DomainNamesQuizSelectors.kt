package geotrainer.utils.quizselector

import geotrainer.models.countries.Country

fun QuizTypeSelectors.domainNamesQuizSelectors() = listOf<QuestionAnswerSelector<Country, Country>>(
    QuestionAnswerSelector(
        questionCategorySelector = { country -> country.domain.id },
        questionDisplayName = { "Which country has the domain '$it'" },
        answerSelector = { country -> country.name },
        // TODO for the future - maybe return null for non-similar-sounding countries
        otherOptionsSelector = { country -> country.name }
    ),

    QuestionAnswerSelector(
        questionCategorySelector = { country -> country.name },
        questionDisplayName = { "Which domain is used for $it?" },
        answerSelector = { country -> country.domain.id },
        // TODO for the future - maybe return null for non-similar-sounding domains
        otherOptionsSelector = { country -> country.domain.id }
    ),
)