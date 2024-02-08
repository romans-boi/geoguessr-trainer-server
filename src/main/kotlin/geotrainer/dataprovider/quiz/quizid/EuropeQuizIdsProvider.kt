package geotrainer.dataprovider.quiz.quizid

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId

class EuropeQuizIdsProvider : ContinentQuizIdsProvider {
    override val continent: Continent = Continent.Europe

    override fun getAllQuizIds() = setOf(
        QuizId.CapitalCities,
        QuizId.DomainNames,
        QuizId.DrivingSide,

        QuizId.EuropeanUnionCountries
    )
}
