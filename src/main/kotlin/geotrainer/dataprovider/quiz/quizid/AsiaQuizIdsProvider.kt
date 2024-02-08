package geotrainer.dataprovider.quiz.quizid

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizId

class AsiaQuizIdsProvider : ContinentQuizIdsProvider {
    override val continent: Continent = Continent.Asia

    override fun getAllQuizIds() = setOf(
        QuizId.CapitalCities,
        QuizId.DomainNames,
        QuizId.DrivingSide,

        QuizId.JapanesePrefecturesKanji
    )
}
