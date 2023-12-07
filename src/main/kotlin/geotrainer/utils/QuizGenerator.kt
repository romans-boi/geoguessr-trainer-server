package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.questionfactory.QuestionFactory
import geotrainer.utils.questionfactory.QuestionFactoryProvider

interface QuizGenerator {
    fun generateCapitalCitiesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ): List<QuizQuestion>

    fun generateDomainNamesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ): List<QuizQuestion>

    fun generateDrivingSideQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ): List<QuizQuestion>

    fun generateEuropeanUnionQuiz(
        numOfQuestions: Int,
        numOfOptions: Int,
    ): List<QuizQuestion>
}

internal class QuizGeneratorImpl(
    private val questionFactoryProvider: QuestionFactoryProvider
) : QuizGenerator {
    override fun generateCapitalCitiesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = questionFactoryProvider.getCapitalCitiesQuestionFactory(numOfOptions, continent)
    )

    override fun generateDomainNamesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = questionFactoryProvider.getDomainNamesQuestionFactory(numOfOptions, continent)
    )

    override fun generateDrivingSideQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = questionFactoryProvider.getDrivingSideQuestionFactory(numOfOptions, continent)
    )

    override fun generateEuropeanUnionQuiz(
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = questionFactoryProvider.getEuropeanUnionQuestionFactory(numOfOptions)
    )

    private fun generateQuizNew(
        numOfQuestions: Int,
        questionFactory: QuestionFactory,
    ): List<QuizQuestion> {
        val quizQuestions = mutableListOf<QuizQuestion>()

        val maxTries = numOfQuestions * 3
        var failedTries = 0
        while (quizQuestions.size < numOfQuestions && (failedTries <= maxTries)) {
            questionFactory.getQuestion()?.let {
                quizQuestions.add(it)
                failedTries = 0
            } ?: run {
                failedTries++
            }
        }

        return quizQuestions
    }
}
