package geotrainer.utils.quizselector

import geotrainer.models.countries.Country

fun QuizTypeSelectors.drivingSideQuizSelectors() = listOf<QuestionAnswerSelector<Country, Country>>(
    QuestionAnswerSelector(
        questionCategorySelector = { country -> country.drivingSide.name.lowercase() },
        questionDisplayName = { "Which country drives on the $it" },
        answerSelector = { country -> country.name },
        otherOptionsSelector = { country -> country.name },
    ),

    QuestionAnswerSelector(
        questionCategorySelector = { country -> country.name },
        questionDisplayName = { "What driving side of the road is used in $it" },
        answerSelector = { country -> country.drivingSide.name },
        otherOptionsSelector = { country -> country.drivingSide.name },
    ),
)