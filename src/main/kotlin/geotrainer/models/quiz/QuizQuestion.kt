package geotrainer.models.quiz

import kotlinx.serialization.Serializable

@Serializable
data class QuizQuestion(
    val question: String,
    val answers: List<String>
)