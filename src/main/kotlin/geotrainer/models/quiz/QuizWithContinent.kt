package geotrainer.models.quiz

import geotrainer.models.Continent
import kotlinx.serialization.Serializable

@Serializable
data class QuizWithContinent(
    val id: String,
    val quizType: QuizType,
    val title: String,
    val description: String,
    val continent: Continent?
)
