package geotrainer.feature.quiz.domain.questionfactory

import geotrainer.models.Continent
import geotrainer.models.quiz.QuestionData
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper

class CapitalCitiesQuestionFactory(
    continent: Continent?,
    override val numOfOptions: Int,
    override val randomHelper: RandomHelper,
    countryProvider: CountryProvider
) : QuestionFactory(
    continent,
    numOfOptions,
    randomHelper,
    countryProvider
) {
    override val allRelevantQuestionCountries =
        super.allRelevantQuestionCountries.filter { it.capitalCities != null }

    override val allRemainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

    override val questionVariants: List<QuestionVariant> = listOf(
        CapitalCityInQuestionVariant(),
        CountryNameInQuestionVariant()
    )

    private inner class CapitalCityInQuestionVariant : QuestionVariant(numOfOptions, randomHelper) {
        override fun getQuestion(): QuizQuestion? {
            val country = chooseSimpleCountry() ?: return null

            val questionSubject = randomHelper.randomOrNull(country.capitalCities) ?: return null
            val answerSubject = country.name

            val possibleOptions = chooseSimpleOptions(
                selectedCountry = country,
                answer = answerSubject,
                selector = { it.name }
            )

            return finaliseQuestion(
                QuestionData(question = "$questionSubject is the capital of..."),
                possibleOptions,
                answerSubject
            )
        }
    }

    private inner class CountryNameInQuestionVariant : QuestionVariant(numOfOptions, randomHelper) {
        override fun getQuestion(): QuizQuestion? {
            val country = chooseSimpleCountry() ?: return null

            val questionSubject = country.name
            val answerSubject = randomHelper.randomOrNull(country.capitalCities) ?: return null

            val possibleOptions = chooseSimpleOptions(
                selectedCountry = country,
                answer = answerSubject,
                selector = { randomHelper.randomOrNull(it.capitalCities) }
            )

            return finaliseQuestion(
                QuestionData(question = "What is the capital of $questionSubject?"),
                possibleOptions,
                answerSubject
            )
        }
    }
}
