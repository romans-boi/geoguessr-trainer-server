package geotrainer.dataprovider.quiz.quizid

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId

class NorthAmericaQuizIdsProvider : ContinentQuizIdsProvider {
    override val continent: Continent = Continent.NorthAmerica

    override fun getAllQuizIds() = setOf(
        QuizId.CapitalCities,
        QuizId.DomainNames,
        QuizId.DrivingSide,
    )
}
