package geotrainer.utils.questionfactory

import geotrainer.models.Continent
import geotrainer.models.Domain
import geotrainer.models.quiz.QuizQuestion

class DomainNameQuestionFactory(
    override val numOfOptions: Int,
    continent: Continent?
) : QuestionFactory(numOfOptions, continent) {
    override val allRelevantQuestionCountries = super.allRelevantQuestionCountries.filter { it.name != null }
    override val allRemainingRelevantQuestionCountries = allRelevantQuestionCountries.toMutableList()

    override val questionVariants: List<QuestionVariant> = listOf(
        DomainNameInQuestionVariant(),
        CountryNameInQuestionVariant()
    )

    private inner class DomainNameInQuestionVariant : QuestionVariant(numOfOptions) {
        override fun getQuestion(): QuizQuestion? {
            val country = allRemainingRelevantQuestionCountries.randomOrNull() ?: return null
            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = country.domain.id
            val answerSubject = country.name ?: return null

            val possibleOptions = (allRelevantQuestionCountries - country).mapNotNull { it.name }

            // Prioritise countries that start with the letter of the domain name
            val similarOptions = possibleOptions.filter { countryName ->
                val processedDomainInQuestion = questionSubject.replace(".", "")

                // Filter countries that are similar to the domain name, which can either be when
                //      - a country starts with same letter as the domain, or
                //      - a country that has all letters that are in the domain name
                processedDomainInQuestion.isNotBlank() &&
                        (countryName.startsWith(processedDomainInQuestion.first(), ignoreCase = true)
                                || processedDomainInQuestion.all { it in countryName })
            }
                .ifEmpty { possibleOptions }
                .shuffled()
                .take(numOfOptions - 1)

            // We now have all the similar-ish options - work out if more options are needed to fill the size.
            val numOfOptionsLeftToAdd = (numOfOptions - 1 - similarOptions.size).coerceAtLeast(minimumValue = 0)

            // If yes, then use the remaining options
            val additionalOptions = if (numOfOptionsLeftToAdd > 0) {
                (possibleOptions - similarOptions.toSet()).shuffled().take(numOfOptionsLeftToAdd)
            } else {
                emptyList()
            }

            return finaliseQuestion(
                "What country uses the domain '$questionSubject'?",
                (similarOptions + additionalOptions).shuffled(),
                answerSubject
            )
        }
    }

    private inner class CountryNameInQuestionVariant : QuestionVariant(numOfOptions) {
        override fun getQuestion(): QuizQuestion? {
            val country = allRemainingRelevantQuestionCountries.randomOrNull() ?: return null
            updateRemainingRelevantQuestionCountries(country)

            val questionSubject = country.name ?: return null
            val answerSubject = country.domain.id

            val questionSubjectLettersOnly = questionSubject.filter { it.isLetter() }

            // Use the country name to generate domains
            val similarOptions = questionSubjectLettersOnly
                .mapNotNull { letter ->
                    val processedDomainInAnswer = answerSubject.replace(".", "")

                    // Can either use:
                    //  - Domain name's first letter followed by some letter in the name
                    //  - The country-in-question's first letter followed by another random letter
                    val possibleOptions = listOf(
                        ".${processedDomainInAnswer.first()}${letter.lowercase()}",
                        ".${questionSubjectLettersOnly.first().lowercase()}${questionSubjectLettersOnly.random().lowercase()}",
                    )

                    // Need to make sure we didn't generate the same option as the answer
                    possibleOptions.randomOrNull()?.takeIf { it != answerSubject }
                }
                .distinct()
                .shuffled()
                .take(numOfOptions - 1)

            // Check if we need to add more options
            val numOfOptionsLeftToAdd = (numOfOptions - 1 - similarOptions.size).coerceAtLeast(minimumValue = 0)

            // If yes, then use any available domain names in the Domain class
            val additionalOptions = if (numOfOptionsLeftToAdd > 0) {
                (Domain.entries.map { it.id } - similarOptions.toSet() - answerSubject)
                    .shuffled()
                    .take(numOfOptionsLeftToAdd)
            } else {
                emptyList()
            }

            return finaliseQuestion(
                "What domain is used in $questionSubject?",
                (similarOptions + additionalOptions).shuffled(),
                answerSubject
            )
        }
    }
}