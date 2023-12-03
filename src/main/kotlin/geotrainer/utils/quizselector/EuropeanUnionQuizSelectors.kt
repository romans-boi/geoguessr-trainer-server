package geotrainer.utils.quizselector

import geotrainer.models.countries.Country

fun QuizTypeSelectors.europeanUnionQuizSelectors() = listOf<QuestionAnswerSelector<Country.EuropeanCountry, Country.EuropeanCountry>>(
    QuestionAnswerSelector(
        questionCategorySelector = { country -> country.name },
        questionDisplayName = { "Is $it part of the European Union?" },
        answerSelector = { country -> if (country.isPartOfEuropeanUnion) "Yes" else "No" },
        otherOptionsSelector = { country -> if (country.isPartOfEuropeanUnion) "Yes" else "No" },
    ),

    QuestionAnswerSelector(
        questionCategorySelector = { country -> "".takeIf { country.isPartOfEuropeanUnion } },
        questionDisplayName = { "Which country is part of the EU?" },
        answerSelector = { country -> country.name },
        otherOptionsSelector = { country -> country.name }
    ),

    QuestionAnswerSelector(
        questionCategorySelector = { country -> country.name },
        questionDisplayName = { "$it is part of the European Union" },
        answerSelector = { country -> if (country.isPartOfEuropeanUnion) "True" else "False" },
        otherOptionsSelector = { country -> if (country.isPartOfEuropeanUnion) "True" else "False" }
    ),
)