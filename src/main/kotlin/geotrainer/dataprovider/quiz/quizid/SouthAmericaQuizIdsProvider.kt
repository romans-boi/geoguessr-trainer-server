package geotrainer.dataprovider.quiz.quizid

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId

class SouthAmericaQuizIdsProvider : ContinentQuizIdsProvider {
    override val continent: Continent = Continent.SouthAmerica

    override fun getAllQuizIds() = setOf(
        QuizId.CapitalCities,
        QuizId.DomainNames,
        QuizId.DrivingSide,
    )
}
