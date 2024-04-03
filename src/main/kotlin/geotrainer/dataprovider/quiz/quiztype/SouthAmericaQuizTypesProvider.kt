package geotrainer.dataprovider.quiz.quiztype

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

class SouthAmericaQuizTypesProvider : ContinentQuizTypesProvider {
    override val continent: Continent = Continent.SouthAmerica

    override fun getAllQuizTypes() = setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    )
}
