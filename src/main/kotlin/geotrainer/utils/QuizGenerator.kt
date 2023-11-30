package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType
import geotrainer.models.quiz.QuizQuestion

fun QuizType.generateDataForQuiz(continent: Continent?, numOfQuestions: Int): List<QuizQuestion> = when (this) {
    QuizType.Everything -> TODO()
    QuizType.CapitalCities -> TODO()
    QuizType.DomainNames -> TODO()
    QuizType.DrivingSide -> TODO()
    QuizType.CountryInContinent -> TODO()
    QuizType.JapanesePrefecturesKanji -> TODO()
}


private fun generateCapitalCitiesData(continent: Continent?): List<QuizQuestion> {
    val variants = listOf(
        { city: String -> "$city is the capital city of..."},
        { countryName: String -> "What is the capital city of $countryName?" }
    )

    TODO()
}
