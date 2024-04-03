package geotrainer.dataprovider.quiz.quizType

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
