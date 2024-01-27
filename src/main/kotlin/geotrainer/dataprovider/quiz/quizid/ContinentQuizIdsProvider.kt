package geotrainer.dataprovider.quiz.quizid

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId

interface ContinentQuizIdsProvider {
    val continent: Continent?
    fun getAllQuizIds(): Set<QuizId>
}
