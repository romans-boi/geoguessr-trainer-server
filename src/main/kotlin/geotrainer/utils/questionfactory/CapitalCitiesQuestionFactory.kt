package geotrainer.utils.questionfactory

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizQuestion

class CapitalCitiesQuestionFactory(
    override val numOfOptions: Int,
    continent: Continent?
) : QuestionFactory(numOfOptions, continent) {
    override val allRelevantQuestionCountries = super.allRelevantQuestionCountries.filter { it.capitalCities != null && it.name != null }
    override val allRemainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

    override val questionVariants: List<QuestionVariant> = listOf(
        CapitalCityInQuestionVariant(),
        CountryNameInQuestionVariant()
    )

    private inner class CapitalCityInQuestionVariant : QuestionVariant(numOfOptions) {
        override fun getQuestion(): QuizQuestion? {
            val country = allRemainingRelevantQuestionCountries.randomOrNull() ?: return null
            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = country.capitalCities?.randomOrNull() ?: return null
            val answerSubject = country.name ?: return null

            val possibleOptions = allRemainingRelevantQuestionCountries
                .mapNotNull { it.name }
                .processOptions(answerSubject)

            return finaliseQuestion("$questionSubject is the capital of...", possibleOptions, answerSubject)
        }
    }

    private inner class CountryNameInQuestionVariant : QuestionVariant(numOfOptions) {
        override fun getQuestion(): QuizQuestion? {
            val country = allRemainingRelevantQuestionCountries.randomOrNull() ?: return null
            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = country.name ?: return null
            val answerSubject = country.capitalCities?.randomOrNull() ?: return null

            val possibleOptions = (allRelevantQuestionCountries - country)
                .mapNotNull { it.capitalCities?.randomOrNull() }
                .processOptions(answerSubject)

            return finaliseQuestion("What is the capital of $questionSubject?", possibleOptions, answerSubject)
        }
    }
}