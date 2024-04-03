package geotrainer.dataprovider.quiz.quiztype

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

class NorthAmericaQuizTypesProvider : ContinentQuizTypesProvider {
    override val continent: Continent = Continent.NorthAmerica

    override fun getAllQuizTypes() = setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    )
}
