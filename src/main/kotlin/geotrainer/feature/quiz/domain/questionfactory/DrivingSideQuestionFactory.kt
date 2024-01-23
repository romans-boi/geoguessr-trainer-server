package geotrainer.feature.quiz.domain.questionfactory

import geotrainer.models.Continent
import geotrainer.models.DrivingSide
import geotrainer.models.quiz.QuestionType
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper

class DrivingSideQuestionFactory(
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
    override val allRemainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

    override val questionVariants: List<QuestionVariant> = listOf(
        DrivingSideInQuestionVariant(),
        CountryInQuestionVariant()
    )

    private inner class DrivingSideInQuestionVariant : QuestionVariant(numOfOptions, randomHelper) {
        override fun getQuestion(): QuizQuestion? {
            val country = chooseSimpleCountry() ?: return null

            val questionSubject = country.drivingSide
            val answerSubject = country.name

            val possibleOptions = (allRelevantQuestionCountries - country)
                .filter { it.drivingSide != questionSubject }
                .map { it.name }
                .processOptions(answerSubject)

            return finaliseQuestion(
                QuestionType(question = "Which country drives on the ${questionSubject.name.lowercase()}?"),
                possibleOptions = possibleOptions,
                correctAnswer = answerSubject,
            )
        }
    }

    private inner class CountryInQuestionVariant : QuestionVariant(numOfOptions = 2, randomHelper) {
        override fun getQuestion(): QuizQuestion? {
            val country = chooseSimpleCountry() ?: return null

            val questionSubject = country.name
            val answerSubject = country.drivingSide.name

            val possibleOptions = DrivingSide.entries.map { it.name }

            return finaliseQuestion(
                QuestionType(question = "What driving side of the road is used in $questionSubject?"),
                possibleOptions,
                answerSubject,
                combineAnswerWithOptions = false,
                shuffleOptions = false,
            )
        }
    }
}
