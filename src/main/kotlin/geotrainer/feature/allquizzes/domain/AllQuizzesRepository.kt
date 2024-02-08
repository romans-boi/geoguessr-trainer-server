package geotrainer.feature.allquizzes.domain

import geotrainer.dataprovider.quiz.AllQuizzesProvider
import geotrainer.dataprovider.quiz.quizid.ContinentQuizIdsProvider
import geotrainer.models.quiz.QuizWithContinent

interface AllQuizzesRepository {
    fun getAllQuizSections(): List<QuizWithContinent>
}

class AllQuizzesRepositoryImpl(
    allQuizzesProvider: AllQuizzesProvider,
    private val quizIdsProviders: Set<ContinentQuizIdsProvider>
) : AllQuizzesRepository {
    private val allQuizzes = allQuizzesProvider.getAllQuizzes()

    override fun getAllQuizSections(): List<QuizWithContinent> = quizIdsProviders.flatMap { provider ->
        val quizIds = provider.getAllQuizIds()

        val quizzes = allQuizzes.filter { quiz -> quiz.quizId in quizIds }
        quizzes.map { quiz ->
            QuizWithContinent(
                quizId = quiz.quizId,
                title = quiz.title,
                description = quiz.description,
                continent = provider.continent
            )
        }
    }
}
