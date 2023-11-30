package geotrainer.models.quiz

import kotlinx.serialization.Serializable

@Serializable
data class Quizzes(
    val generic: List<Quiz>,
    val continental: List<QuizSection>,
    val other: List<Quiz>,
)
