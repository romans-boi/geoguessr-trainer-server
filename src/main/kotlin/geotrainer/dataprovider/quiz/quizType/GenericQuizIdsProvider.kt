package geotrainer.dataprovider.quiz.quizType

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

class GenericQuizTypesProviderImpl : ContinentQuizTypesProvider {
    override val continent: Continent? = null

    override fun getAllQuizTypes() = setOf(
        QuizType.Everything,
        QuizType.CountryInContinent,
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide
    )
}
