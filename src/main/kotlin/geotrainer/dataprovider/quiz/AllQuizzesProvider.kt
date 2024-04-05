package geotrainer.dataprovider.quiz

import geotrainer.models.quiz.Quiz
import geotrainer.models.quiz.QuizType

interface AllQuizzesProvider {
    fun getAllQuizzes(): List<Quiz>
}

class AllQuizzesProviderImpl : AllQuizzesProvider {
    override fun getAllQuizzes() = listOf(
        Quiz(
            quizType = QuizType.Everything,
            title = "Everything combined",
            description = "TODO",
            continent = null
        ),

        Quiz(
            quizType = QuizType.CapitalCities,
            title = "Capital Cities",
            description = "TODO",
            continent = null
        ),

        Quiz(
            quizType = QuizType.DomainNames,
            title = "Domain Names",
            description = "TODO",
            continent = null
        ),

        Quiz(
            quizType = QuizType.DrivingSide,
            title = "Driving Side of the Road",
            description = "TODO",
            continent = null
        ),

        Quiz(
            quizType = QuizType.CountryInContinent,
            title = "What Continent is This Country In?",
            description = "TODO",
            continent = null
        ),

        Quiz(
            quizType = QuizType.JapanesePrefecturesKanji,
            title = "Prefectures in Kanji",
            description = "TODO",
            continent = null
        ),

        Quiz(
            quizType = QuizType.EuropeanUnionCountries,
            title = "Countries in the European Union",
            description = "TODO",
            continent = null
        ),
    )
}
