package geotrainer.feature.quiz.domain.questionfactory

import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.quiz.OptionData
import geotrainer.models.quiz.QuestionData
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper

abstract class QuestionFactory(
    continent: Continent?,
    protected open val numOfOptions: Int,
    protected open val randomHelper: RandomHelper,
    countryProvider: CountryProvider
) {
    /**
     * The pool of all countries that the question factory can use to generate questions with
     * */
    protected open val allRelevantQuestionCountries: List<Country> = countryProvider
        .getAllCountries()
        .filterByContinent(continent)

    /**
     * The remaining countries that the question factory can select from (to try to avoid repetitions as much
     * as possible)
     * */
    protected abstract val allRemainingRelevantQuestionCountries: MutableList<Country>

    /**
     * Variants for a question. E.g.
     * Q: "What's the capital city of <country>?", A: <capital city>
     * vs
     * Q: "What  country is <capital city> the capital city of?", A: <country>
     * */
    abstract val questionVariants: List<QuestionVariant>

    /**
     * Picks a random variant of the question factory and uses that variant to generate a question.
     * */
    fun getQuestion(): QuizQuestion? = randomHelper.randomOrNull(questionVariants)?.getQuestion()

    /**
     * Picks out a country from available remaining countries and updates the list of remaining countries. Use this
     * helper when you don't need to do additional processing on the remaining countries. (But if you don't use this,
     * then don't forget to call `updateRemainingRelevantQuestionCountries` if needed)
     * */
    protected fun chooseSimpleCountry(): Country? {
        val country = randomHelper.randomOrNull(allRemainingRelevantQuestionCountries) ?: return null
        updateRemainingRelevantQuestionCountries(country)

        return country
    }

    /**
     * Picks out options from the relevant countries (minus the selected country) based on some selector, and then
     * processes them to ensure everything is distinct, and we have the right amount of options. Use this if you don't
     * need to do additional filtering on the options. (But if you don't use this, don't forget to do all the processing
     * yourself)
     * */
    protected fun chooseSimpleOptions(
        selectedCountry: Country,
        answer: String,
        selector: (Country) -> String?,
    ): List<String>? = (allRelevantQuestionCountries - selectedCountry)
        .mapNotNull { selector(it) }
        .processOptions(answer)

    /**
     * Performs simple processing on the options - makes sure that:
     *  - None of the options are the same as the answer
     *  - All options are distinct
     *  - We only have numOfOptions - 1 selected (-1 because this doesn't account for the answer being an option)
     *
     *  Can return null if there's no options.
     * */
    protected fun List<String>.processOptions(answer: String) =
        randomHelper.shuffle(
            this.mapNotNull { option ->
                option.takeIf { it != answer }
            }.distinct()
        )
            .take(numOfOptions - 1)
            .takeIf { it.isNotEmpty() }

    /**
     * Finalises a question into a format that can be returned. This processing includes:
     *  - Adding the answer to the options (if desired)
     *  - Shuffling all the combined options (if desired)
     *
     * Returns null if the possible options are null.
     * */
    protected fun finaliseQuestion(
        question: QuestionData,
        possibleOptions: List<String>?,
        correctAnswer: String,
        combineAnswerWithOptions: Boolean = true,
        shuffleOptions: Boolean = true,
    ): QuizQuestion? = possibleOptions?.let { options ->
        val processedOptions = if (combineAnswerWithOptions) {
            options + correctAnswer
        } else {
            options
        }.let {
            if (shuffleOptions) randomHelper.shuffle(it) else it
        }

        QuizQuestion(
            questionData = question,
            OptionData.Text(
                options = processedOptions,
                correctAnswer = correctAnswer
            )
        )
    }

    /**
     * Filters a list of  countries by Continent
     * */
    protected fun List<Country>.filterByContinent(continent: Continent?) = let { filteredList ->
        if (continent != null) {
            filteredList.filter { it.continent == continent }
        } else {
            filteredList
        }
    }

    /**
     * Internally updates remaining countries to not have a country that's just been selected, so that we don't have
     * a country popping up more than one time in a set of questions. However, if we go through all available countries,
     * we reset the remaining countries back to all countries, so after that point we can get repetitions.
     * */
    protected fun updateRemainingRelevantQuestionCountries(country: Country) {
        allRemainingRelevantQuestionCountries -= country

        if (allRemainingRelevantQuestionCountries.isEmpty()) {
            allRemainingRelevantQuestionCountries += allRelevantQuestionCountries
        }
    }
}
