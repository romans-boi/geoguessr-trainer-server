package geotrainer.utils.questionfactory

import geotrainer.models.countries.Country
import geotrainer.models.quiz.QuizQuestion

class EuropeanUnionQuestionFactory(
    override val numOfOptions: Int,
) : QuestionFactory(numOfOptions, continent = null) {
    override val allRelevantQuestionCountries: List<Country> = super.allRelevantQuestionCountries.filterIsInstance<Country.EuropeanCountry>()
    override val allRemainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

    override val questionVariants: List<QuestionVariant> = listOf(
        EuropeanUnionInQuestionVariant(),
        CountryNameInQuestionVariant()
    )

    private inner class EuropeanUnionInQuestionVariant : QuestionVariant(numOfOptions) {
        override fun getQuestion(): QuizQuestion? {
            val country = allRemainingRelevantQuestionCountries.randomOrNull() ?: return null

            updateRemainingRelevantQuestionCountries(country)

            val isPartOfEuQuestionSubject = (country as? Country.EuropeanCountry)?.isPartOfEuropeanUnion ?: return null
            val answerSubject = country.name

            val possibleOptions = (allRelevantQuestionCountries - country)
                .filter {
                    (it as? Country.EuropeanCountry)?.isPartOfEuropeanUnion != isPartOfEuQuestionSubject
                }
                .map { it.name }
                .processOptions(answerSubject)


            val prefix = if (isPartOfEuQuestionSubject) "" else " NOT"

            return finaliseQuestion(
                question = "Which country is$prefix in the European Union?",
                possibleOptions = possibleOptions,
                correctAnswer = answerSubject
            )
        }
    }

    private inner class CountryNameInQuestionVariant : QuestionVariant(numOfOptions = 2) {
        override fun getQuestion(): QuizQuestion? {
            val country = allRemainingRelevantQuestionCountries.randomOrNull() ?: return null

            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = country.name
            val isPartOfEuAnswerSubject = (country as? Country.EuropeanCountry)?.isPartOfEuropeanUnion ?: return null


            val trueString = "True"
            val falseString = "False"
            val possibleOptions = listOf(trueString, falseString)


            return finaliseQuestion(
                question = "$questionSubject is part of the European Union",
                possibleOptions = possibleOptions,
                correctAnswer = if (isPartOfEuAnswerSubject) trueString else falseString,
                combineAnswerWithOptions = false,
                shuffleOptions = false,
            )
        }
    }
}