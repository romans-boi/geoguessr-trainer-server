package geotrainer.dataprovider.quiz.quizType

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

class OceaniaQuizTypesProvider : ContinentQuizTypesProvider {
    override val continent: Continent = Continent.Oceania

    override fun getAllQuizTypes() = setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    )
}
