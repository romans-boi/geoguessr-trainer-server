package geotrainer.feature.quiz.domain

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizQuestion
import geotrainer.models.quiz.QuizType

interface QuizRepository {
    fun generateQuiz(
        quizType: QuizType,
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ): List<QuizQuestion>
}

class QuizRepositoryImpl(
    private val quizGenerator: QuizGenerator
): QuizRepository {
    override fun generateQuiz(
        quizType: QuizType,
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int
    ): List<QuizQuestion> = when (quizType) {
        QuizType.Everything -> TODO()
        QuizType.CapitalCities -> quizGenerator.generateCapitalCitiesQuiz(continent, numOfQuestions, numOfOptions)
        QuizType.DomainNames -> quizGenerator.generateDomainNamesQuiz(continent, numOfQuestions, numOfOptions)
        QuizType.DrivingSide -> quizGenerator.generateDrivingSideQuiz(continent, numOfQuestions, numOfOptions)
        QuizType.CountryInContinent -> TODO()
        QuizType.JapanesePrefecturesKanji -> TODO()
        QuizType.EuropeanUnionCountries -> quizGenerator.generateEuropeanUnionQuiz(numOfQuestions, numOfOptions)
    }
}
