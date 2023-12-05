package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.questionfactory.CapitalCitiesQuestionFactory
import geotrainer.utils.questionfactory.DomainNameQuestionFactory
import geotrainer.utils.questionfactory.DrivingSideQuestionFactory
import geotrainer.utils.questionfactory.EuropeanUnionQuestionFactory
import geotrainer.utils.questionfactory.QuestionFactory


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

internal class QuizGeneratorImpl() : QuizGenerator {

    override fun generateCapitalCitiesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = CapitalCitiesQuestionFactory(numOfOptions, continent)
    )

    override fun generateDomainNamesQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = DomainNameQuestionFactory(numOfOptions, continent)
    )

    override fun generateDrivingSideQuiz(
        continent: Continent?,
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = DrivingSideQuestionFactory(numOfOptions, continent)
    )

    override fun generateEuropeanUnionQuiz(
        numOfQuestions: Int,
        numOfOptions: Int,
    ) = generateQuizNew(
        numOfQuestions = numOfQuestions,
        questionFactory = EuropeanUnionQuestionFactory(numOfOptions)
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


fun main() {
    val quizGen = QuizGeneratorImpl()

    //listOf(null).forEach { continent ->
        //println("================ Quiz for $continent ================")
        val quiz = quizGen.generateEuropeanUnionQuiz(
            numOfQuestions = 100,
            numOfOptions = 4
        )

        quiz.map {
            println("============")
            println("Question: ${it.question}")
            println("Options: ${it.options}")
            println("Answer: ${it.correctAnswer}")
            println("===========")
            println()
        }
        println()
    //}
}