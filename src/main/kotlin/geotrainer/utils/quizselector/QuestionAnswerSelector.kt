package geotrainer.utils.quizselector

import geotrainer.models.Continent
import geotrainer.models.countries.Country

data class QuestionAnswerSelector<QuestionAnswerType : Country, OtherOptionsType : Country>(
    val questionSelector: (QuestionAnswerType) -> String?,
    val answerSelector: (QuestionAnswerType) -> String?,
    // The answer can be used to decide whether the option should be selected or not.
    val otherOptionsSelector: (OtherOptionsType, answer: String) -> String?
)