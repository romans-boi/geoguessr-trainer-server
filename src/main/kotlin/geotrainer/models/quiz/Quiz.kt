package geotrainer.models.quiz

import geotrainer.models.Continent
import kotlinx.serialization.Serializable

@Serializable
data class Quiz(
    val quizType: QuizType,
    val title: String,
    val description: String,
    val continent: Continent?,
    val id: String = quizType + continent,
)

private operator fun QuizType.plus(continent: Continent?): String = this.name + (continent?.name ?: "Generic")
