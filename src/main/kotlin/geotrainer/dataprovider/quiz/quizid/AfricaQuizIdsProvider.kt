package geotrainer.dataprovider.quiz.quizid

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId

class AfricaQuizIdsProvider : ContinentQuizIdsProvider {
    override val continent: Continent = Continent.Africa

    override fun getAllQuizIds() = setOf(
        QuizId.CapitalCities,
        QuizId.DomainNames,
        QuizId.DrivingSide,
    )
}
