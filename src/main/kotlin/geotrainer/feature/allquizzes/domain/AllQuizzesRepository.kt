package geotrainer.feature.allquizzes.domain

import geotrainer.dataprovider.quiz.AllQuizzesProvider
import geotrainer.dataprovider.quiz.quizid.ContinentQuizIdsProvider
import geotrainer.models.Continent
import geotrainer.models.quiz.QuizSection

interface AllQuizzesRepository {
    fun getAllQuizSections(): List<QuizSection>
}

class AllQuizzesRepositoryImpl(
    allQuizzesProvider: AllQuizzesProvider,
    private val quizIdsProviders: Set<ContinentQuizIdsProvider>
) : AllQuizzesRepository {
    private val allQuizzes = allQuizzesProvider.getAllQuizzes()

    override fun getAllQuizSections(): List<QuizSection> = (listOf(null) + Continent.entries).map { continent ->
        val quizIdsProvider = quizIdsProviders.find { provider -> provider.continent == continent }

        checkNotNull(quizIdsProvider) { "No quiz ID provider for continent" }

        val quizzes = allQuizzes.filter { quiz -> quiz.quizId in quizIdsProvider.getAllQuizIds() }
        QuizSection(quizzes, continent)
    }
}
