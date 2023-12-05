package geotrainer.utils.questionfactory

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper

class CapitalCitiesQuestionFactory(
    continent: Continent?,
    override val numOfOptions: Int,
    override val randomHelper: RandomHelper,
    countryProvider: CountryProvider
) : QuestionFactory(continent, numOfOptions, randomHelper, countryProvider) {
    override val allRelevantQuestionCountries =
        super.allRelevantQuestionCountries.filter { it.capitalCities != null }

    override val allRemainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

    override val questionVariants: List<QuestionVariant> = listOf(
        CapitalCityInQuestionVariant(),
        CountryNameInQuestionVariant()
    )

    private inner class CapitalCityInQuestionVariant : QuestionVariant(numOfOptions, randomHelper) {
        override fun getQuestion(): QuizQuestion? {
            val country = randomHelper.randomOrNull(allRemainingRelevantQuestionCountries) ?: return null
            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = randomHelper.randomOrNull(country.capitalCities) ?: return null
            val answerSubject = country.name

            val possibleOptions = (allRelevantQuestionCountries - country)
                .map { it.name }
                .processOptions(answerSubject)

            return finaliseQuestion(
                "$questionSubject is the capital of...",
                possibleOptions,
                answerSubject
            )
        }
    }

    private inner class CountryNameInQuestionVariant : QuestionVariant(numOfOptions, randomHelper) {
        override fun getQuestion(): QuizQuestion? {
            val country = randomHelper.randomOrNull(allRemainingRelevantQuestionCountries) ?: return null
            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = country.name
            val answerSubject = randomHelper.randomOrNull(country.capitalCities) ?: return null

            val possibleOptions = (allRelevantQuestionCountries - country)
                .mapNotNull { randomHelper.randomOrNull(it.capitalCities) }
                .processOptions(answerSubject)

            return finaliseQuestion("What is the capital of $questionSubject?", possibleOptions, answerSubject)
        }
    }
}