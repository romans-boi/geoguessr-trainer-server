package geotrainer.models.quiz

import geotrainer.models.Url
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
data class QuestionType(
    val question: String,
    @Contextual
    val image: Url? = null,
    val supportingText: String? = null,
)
