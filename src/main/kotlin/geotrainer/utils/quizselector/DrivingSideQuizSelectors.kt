package geotrainer.utils.quizselector

import geotrainer.models.countries.Country

fun QuizTypeSelectors.drivingSideQuizSelectors() = listOf<QuestionAnswerSelector<Country, Country>>(
    QuestionAnswerSelector(
        questionSelector = { country ->
            "Which country drives on the ${country.drivingSide.name.lowercase()}"
        },
        answerSelector = { country -> country.name },
        // TODO fix this to make sure we don't get any options that also drive on the selected side
        otherOptionsSelector = { country, _ -> country.name }
    ),

    QuestionAnswerSelector(
        questionSelector = { country ->
            "What driving side of the road is used in ${country.name}?"
        },
        answerSelector = { country -> country.drivingSide.name },
        otherOptionsSelector = { country, _ -> country.drivingSide.name }
    ),
)