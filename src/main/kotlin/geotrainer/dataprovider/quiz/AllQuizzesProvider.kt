package geotrainer.dataprovider.quiz

import geotrainer.models.quiz.Quiz
import geotrainer.models.quiz.QuizId

interface AllQuizzesProvider {
    fun getAllQuizzes(): List<Quiz>
}

class AllQuizzesProviderImpl : AllQuizzesProvider {
    override fun getAllQuizzes() = listOf(
        Quiz(
            quizId = QuizId.Everything,
            title = "Everything combined",
            description = "TODO"
        ),

        Quiz(
            quizId = QuizId.CapitalCities,
            title = "Capital Cities",
            description = "TODO"
        ),

        Quiz(
            quizId = QuizId.DomainNames,
            title = "Domain Names",
            description = "TODO"
        ),

        Quiz(
            quizId = QuizId.DrivingSide,
            title = "Driving Side of the Road",
            description = "TODO"
        ),

        Quiz(
            quizId = QuizId.CountryInContinent,
            title = "What Continent is This Country In?",
            description = "TODO"
        ),

        Quiz(
            quizId = QuizId.JapanesePrefecturesKanji,
            title = "Prefectures in Kanji",
            description = "TODO"
        ),

        Quiz(
            quizId = QuizId.EuropeanUnionCountries,
            title = "Countries in the European Union",
            description = "TODO"
        ),
    )
}
