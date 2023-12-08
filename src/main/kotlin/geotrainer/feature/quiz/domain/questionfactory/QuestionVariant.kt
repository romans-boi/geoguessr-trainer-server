package geotrainer.feature.quiz.domain.questionfactory

import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.RandomHelper

sealed class QuestionVariant(private val numOfOptions: Int, private val randomHelper: RandomHelper) {
    abstract fun getQuestion(): QuizQuestion?
}
