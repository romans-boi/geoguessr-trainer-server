package geotrainer.dataprovider.quiz.quizType

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

interface ContinentQuizTypesProvider {
    val continent: Continent?
    fun getAllQuizTypes(): Set<QuizType>
}
