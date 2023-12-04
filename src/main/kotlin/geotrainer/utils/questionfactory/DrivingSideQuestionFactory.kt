package geotrainer.utils.questionfactory

import geotrainer.models.Continent
import geotrainer.models.DrivingSide
import geotrainer.models.quiz.QuizQuestion

class DrivingSideQuestionFactory(
    override val numOfOptions: Int,
    continent: Continent?
) : QuestionFactory(numOfOptions, continent) {
    override val allRelevantQuestionCountries = super.allRelevantQuestionCountries.filter { it.name != null }
    override val allRemainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

    override val questionVariants: List<QuestionVariant> = listOf(
        DrivingSideInQuestionVariant(),
        CountryInQuestionVariant()
    )

    private inner class DrivingSideInQuestionVariant : QuestionVariant(numOfOptions) {
        override fun getQuestion(): QuizQuestion? {
            val country = allRemainingRelevantQuestionCountries.randomOrNull() ?: return null
            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = country.drivingSide
            val answerSubject = country.name ?: return null

            val possibleOptions = (allRelevantQuestionCountries - country)
                .filter { it.drivingSide != questionSubject }
                .mapNotNull { it.name }
                .processOptions(answerSubject)

            return finaliseQuestion(
                question = "Which country drives on the ${questionSubject.name.lowercase()}?",
                possibleOptions = possibleOptions,
                correctAnswer = answerSubject,
            )
        }
    }

    private inner class CountryInQuestionVariant : QuestionVariant(numOfOptions = 2) {
        override fun getQuestion(): QuizQuestion? {
            val country = allRemainingRelevantQuestionCountries.randomOrNull() ?: return null
            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = country.name ?: return null
            val answerSubject = country.drivingSide.name

            val possibleOptions = DrivingSide.entries.map { it.name }

            return finaliseQuestion(
                "What driving side of the road is used in $questionSubject?",
                possibleOptions,
                answerSubject,
                combineAnswerWithOptions = false,
                shuffleOptions = false,
            )
        }
    }

}