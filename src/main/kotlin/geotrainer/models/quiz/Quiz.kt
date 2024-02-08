package geotrainer.models.quiz

import kotlinx.serialization.Serializable

@Serializable
data class Quiz(
    val quizId: QuizId,
    val title: String,
    val description: String
)
