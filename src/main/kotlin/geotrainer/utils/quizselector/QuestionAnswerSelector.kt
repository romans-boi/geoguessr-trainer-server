package geotrainer.utils.quizselector

import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.quiz.QuizQuestion

data class QuestionAnswerSelector<QuestionAnswerType : Country, OtherOptionsType : Country>(
    val questionCategorySelector: (countryForQuestion: QuestionAnswerType) -> String?,
    val answerSelector: (countryForAnswer: QuestionAnswerType) -> String?,
    val questionDisplayName: (String) -> String,
    val otherOptionsSelector: (countryForOption: OtherOptionsType) -> String?
)

