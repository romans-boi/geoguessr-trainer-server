package geotrainer.utils.quizselector

import geotrainer.models.countries.Country

fun QuizTypeSelectors.europeanUnionQuizSelectors() = listOf<QuestionAnswerSelector<Country.EuropeanCountry, Country.EuropeanCountry>>(
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