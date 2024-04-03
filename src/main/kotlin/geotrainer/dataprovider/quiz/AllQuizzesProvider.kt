package geotrainer.dataprovider.quiz

import geotrainer.models.quiz.Quiz
import geotrainer.models.quiz.QuizType
import java.util.UUID

interface AllQuizzesProvider {
    fun getAllQuizzes(): List<Quiz>
}

class AllQuizzesProviderImpl : AllQuizzesProvider {
    override fun getAllQuizzes() = listOf(
        Quiz(
            id = UUID.randomUUID().toString(),
            quizType = QuizType.Everything,
            title = "Everything combined",
            description = "TODO"
        ),

        Quiz(
            id = UUID.randomUUID().toString(),
            quizType = QuizType.CapitalCities,
            title = "Capital Cities",
            description = "TODO"
        ),

        Quiz(
            id = UUID.randomUUID().toString(),
            quizType = QuizType.DomainNames,
            title = "Domain Names",
            description = "TODO"
        ),

        Quiz(
            id = UUID.randomUUID().toString(),
            quizType = QuizType.DrivingSide,
            title = "Driving Side of the Road",
            description = "TODO"
        ),

        Quiz(
            id = UUID.randomUUID().toString(),
            quizType = QuizType.CountryInContinent,
            title = "What Continent is This Country In?",
            description = "TODO"
        ),

        Quiz(
            id = UUID.randomUUID().toString(),
            quizType = QuizType.JapanesePrefecturesKanji,
            title = "Prefectures in Kanji",
            description = "TODO"
        ),

        Quiz(
            id = UUID.randomUUID().toString(),
            quizType = QuizType.EuropeanUnionCountries,
            title = "Countries in the European Union",
            description = "TODO"
        ),
    )
}
