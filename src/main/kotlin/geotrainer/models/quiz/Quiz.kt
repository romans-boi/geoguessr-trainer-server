package geotrainer.models.quiz

import kotlinx.serialization.Serializable

@Serializable
data class Quiz(
    val quizType: QuizType,
    val title: String,
    val description: String
)
