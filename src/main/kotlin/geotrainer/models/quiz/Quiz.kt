package geotrainer.models.quiz

import kotlinx.serialization.Serializable

@Serializable
data class Quiz(
    val id: String,
    val quizType: QuizType,
    val title: String,
    val description: String
)
