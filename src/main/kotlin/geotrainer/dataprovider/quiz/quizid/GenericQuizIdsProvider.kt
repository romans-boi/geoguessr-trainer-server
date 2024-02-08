package geotrainer.dataprovider.quiz.quizid

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId

class GenericQuizIdsProviderImpl : ContinentQuizIdsProvider {
    override val continent: Continent? = null

    override fun getAllQuizIds() = setOf(
        QuizId.Everything,
        QuizId.CountryInContinent,
        QuizId.CapitalCities,
        QuizId.DomainNames,
        QuizId.DrivingSide
    )
}
