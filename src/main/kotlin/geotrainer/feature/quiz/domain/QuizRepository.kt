package geotrainer.feature.quiz.domain

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId
import geotrainer.models.quiz.QuizQuestion

interface QuizRepository {
    fun generateQuiz(
        quizId: QuizId,
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ): List<QuizQuestion>
}

class QuizRepositoryImpl(
    private val quizGenerator: QuizGenerator
): QuizRepository {
    override fun generateQuiz(
        quizId: QuizId,
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int
    ): List<QuizQuestion> = when (quizId) {
        QuizId.Everything -> TODO()
        QuizId.CapitalCities -> quizGenerator.generateCapitalCitiesQuiz(continent, numOfQuestions, numOfOptions)
        QuizId.DomainNames -> quizGenerator.generateDomainNamesQuiz(continent, numOfQuestions, numOfOptions)
        QuizId.DrivingSide -> quizGenerator.generateDrivingSideQuiz(continent, numOfQuestions, numOfOptions)
        QuizId.CountryInContinent -> TODO()
        QuizId.JapanesePrefecturesKanji -> TODO()
        QuizId.EuropeanUnionCountries -> quizGenerator.generateEuropeanUnionQuiz(numOfQuestions, numOfOptions)
    }
}
