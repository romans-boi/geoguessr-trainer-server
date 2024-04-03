package geotrainer.dataprovider.quiz.quiztype

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType

class AsiaQuizTypesProvider : ContinentQuizTypesProvider {
    override val continent: Continent = Continent.Asia

    override fun getAllQuizTypes() = setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,

        QuizType.JapanesePrefecturesKanji
    )
}
