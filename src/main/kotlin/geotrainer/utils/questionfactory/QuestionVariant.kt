package geotrainer.utils.questionfactory

import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.RandomHelper

sealed class QuestionVariant(private val numOfOptions: Int, private val randomHelper: RandomHelper) {
    abstract fun getQuestion(): QuizQuestion?

    protected fun List<String>.processOptions(answer: String) =
        randomHelper.shuffle(
            this.mapNotNull { option ->
                option.takeIf { it != answer }
            }.distinct()
        )
            .take(numOfOptions - 1)
            .takeIf { it.isNotEmpty() }
}
