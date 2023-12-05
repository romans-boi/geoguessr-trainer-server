package geotrainer.utils.questionfactory

import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper

abstract class QuestionFactory(
    continent: Continent?,
    protected open val numOfOptions: Int,
    protected open val randomHelper: RandomHelper,
    countryProvider: CountryProvider
) {
    protected open val allRelevantQuestionCountries: List<Country> = countryProvider
        .getAllCountries()
        .filterByContinent(continent)

    protected abstract val allRemainingRelevantQuestionCountries: MutableList<Country>

    abstract val questionVariants: List<QuestionVariant>

    fun getQuestion(): QuizQuestion? = randomHelper.randomOrNull(questionVariants)?.getQuestion()

    protected fun finaliseQuestion(
        question: String,
        possibleOptions: List<String>?,
        correctAnswer: String,
        combineAnswerWithOptions: Boolean = true,
        shuffleOptions: Boolean = true,
    ): QuizQuestion? {
        return possibleOptions?.let { options ->
            val processedOptions = if (combineAnswerWithOptions) {
                options + correctAnswer
            } else {
                options
            }.let {
                if (shuffleOptions) randomHelper.shuffle(it) else it
            }

            QuizQuestion(
                question = question,
                options = processedOptions,
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