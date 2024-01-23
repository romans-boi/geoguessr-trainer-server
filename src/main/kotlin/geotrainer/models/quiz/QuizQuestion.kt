package geotrainer.models.quiz

import kotlinx.serialization.Serializable

@Serializable
data class QuizQuestion(
    val question: QuestionType,
    val options: List<String>,
    val correctAnswer: String,
)
