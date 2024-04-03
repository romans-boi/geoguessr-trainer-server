package geotrainer.dataprovider.quiz.quiztype

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

class EuropeQuizTypesProvider : ContinentQuizTypesProvider {
    override val continent: Continent = Continent.Europe

    override fun getAllQuizTypes() = setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,

        QuizType.EuropeanUnionCountries
    )
}
