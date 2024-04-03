package geotrainer.dataprovider.quiz.quiztype

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

class AfricaQuizTypesProvider : ContinentQuizTypesProvider {
    override val continent: Continent = Continent.Africa

    override fun getAllQuizTypes() = setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    )
}
