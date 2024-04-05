package geotrainer.feature.allquizzes.domain

import geotrainer.dataprovider.quiz.AllQuizzesProvider
import geotrainer.dataprovider.quiz.quiztype.ContinentQuizTypesProvider
import geotrainer.models.quiz.Quiz

interface AllQuizzesRepository {
    fun getAllQuizSections(): List<Quiz>
}

class AllQuizzesRepositoryImpl(
    allQuizzesProvider: AllQuizzesProvider,
    private val quizTypesProviders: Set<ContinentQuizTypesProvider>
) : AllQuizzesRepository {
    private val allQuizzes = allQuizzesProvider.getAllQuizzes()

    override fun getAllQuizSections(): List<Quiz> = quizTypesProviders.flatMap { provider ->
        val quizTypes = provider.getAllQuizTypes()

        val quizzes = allQuizzes.filter { quiz -> quiz.quizType in quizTypes }
        quizzes.map { quiz ->
            Quiz(
                quizType = quiz.quizType,
                title = quiz.title,
                description = quiz.description,
                continent = provider.continent
            )
        }
    }
}
