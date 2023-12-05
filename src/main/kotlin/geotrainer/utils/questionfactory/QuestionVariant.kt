package geotrainer.utils.questionfactory

import geotrainer.models.quiz.QuizQuestion

sealed class QuestionVariant(private val numOfOptions: Int) {
    abstract fun getQuestion(): QuizQuestion?

    protected fun List<String>.processOptions(answer: String) =
        this.mapNotNull { option -> option.takeIf { it != answer } }
            .distinct()
            .shuffled()
            .take(numOfOptions - 1)
            .takeIf { it.isNotEmpty() }
}