package geotrainer.dataprovider.quiz.quiztype

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

interface ContinentQuizTypesProvider {
    val continent: Continent?
    fun getAllQuizTypes(): Set<QuizType>
}
