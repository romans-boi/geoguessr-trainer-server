package geotrainer.domain

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizQuestion
import geotrainer.models.quiz.QuizType

interface GenerateQuizUseCase {
    fun generateDataForQuiz(
        quizType: QuizType,
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ): List<QuizQuestion>
}

internal object GenerateQuizUseCaseImpl: GenerateQuizUseCase {
    override fun generateDataForQuiz(
        quizType: QuizType,
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ): List<QuizQuestion> = when (quizType) {
        QuizType.Everything -> TODO()
        QuizType.CapitalCities -> TODO()
        QuizType.DomainNames -> TODO()
        QuizType.DrivingSide -> TODO()
        QuizType.CountryInContinent -> TODO()
        QuizType.JapanesePrefecturesKanji -> TODO()
    }
}
