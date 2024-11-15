package geotrainer.models.quiz

import geotrainer.models.Continent
import kotlinx.serialization.Serializable

@Serializable
data class QuizSection(
    val quizzes: List<Quiz>,
    val continent: Continent?,
)
