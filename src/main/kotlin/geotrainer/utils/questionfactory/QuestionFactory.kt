package geotrainer.utils.questionfactory

import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.quiz.QuizQuestion

abstract class QuestionFactory(
    open val numOfOptions: Int,
    continent: Continent?
) {
    protected open val allRelevantQuestionCountries: List<Country> = Country.allCountries.filterByContinent(continent)
    protected abstract val allRemainingRelevantQuestionCountries: MutableList<Country>

    abstract val questionVariants: List<QuestionVariant>

    fun getQuestion(): QuizQuestion? = questionVariants.random().getQuestion()

    protected fun finaliseQuestion(
        question: String,
        possibleOptions: List<String>?,
        correctAnswer: String,
        shuffleOptions: Boolean = true,
    ): QuizQuestion? {
        return possibleOptions?.let {
            QuizQuestion(
                question = question,
                options = (it + correctAnswer).let { allOptions -> if (shuffleOptions) allOptions.shuffled() else allOptions},
                correctAnswer = correctAnswer
            )
        }
    }

    protected fun List<Country>.filterByContinent(continent: Continent?) = let { filteredList ->
        if (continent != null) {
            filteredList.filter { it.continent == continent }
        } else {
            filteredList
        }
    }

    protected fun updateRemainingRelevantQuestionCountries(country: Country) {
        allRemainingRelevantQuestionCountries -= country

        if (allRemainingRelevantQuestionCountries.isEmpty()) {
            allRemainingRelevantQuestionCountries += allRelevantQuestionCountries
        }
    }
}