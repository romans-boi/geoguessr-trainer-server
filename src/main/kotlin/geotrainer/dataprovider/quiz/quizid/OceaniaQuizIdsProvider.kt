package geotrainer.dataprovider.quiz.quizid

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId

class OceaniaQuizIdsProvider : ContinentQuizIdsProvider {
    override val continent: Continent = Continent.Oceania

    override fun getAllQuizIds() = setOf(
        QuizId.CapitalCities,
        QuizId.DomainNames,
        QuizId.DrivingSide,
    )
}
