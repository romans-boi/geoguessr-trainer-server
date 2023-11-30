package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.quiz.Quiz
import geotrainer.models.quiz.QuizQuestion

fun Quiz.generateDataForQuiz(continent: Continent?, numOfQuestions: Int): List<QuizQuestion> = when (this) {
    Quiz.Everything -> TODO()
    Quiz.CapitalCities -> TODO()
    Quiz.DomainNames -> TODO()
    Quiz.DrivingSide -> TODO()
    Quiz.CountryInContinent -> TODO()
    Quiz.JapanesePrefecturesKanji -> TODO()
}


private fun generateCapitalCitiesData(continent: Continent?): List<QuizQuestion> {
    val variants = listOf(
        { city: String -> "$city is the capital city of..."},
        { countryName: String -> "What is the capital city of $countryName?" }
    )

    TODO()
}
