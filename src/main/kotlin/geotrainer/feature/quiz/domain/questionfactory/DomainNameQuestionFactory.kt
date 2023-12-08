package geotrainer.feature.quiz.domain.questionfactory

import geotrainer.models.Continent
import geotrainer.models.Domain
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper

class DomainNameQuestionFactory(
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
        DomainNameInQuestionVariant(),
        CountryNameInQuestionVariant()
    )

    private inner class DomainNameInQuestionVariant : QuestionVariant(numOfOptions, randomHelper) {
        override fun getQuestion(): QuizQuestion? {
            val country = chooseSimpleCountry() ?: return null

            val questionSubject = country.domain.id
            val answerSubject = country.name

            val possibleOptions = (allRelevantQuestionCountries - country).map { it.name }

            // Prioritise countries that start with the letter of the domain name
            var similarOptions = possibleOptions.filter { countryName ->
                val processedDomainInQuestion = questionSubject.replace(".", "")

                // Filter countries that are similar to the domain name, which can either be when
                //      - a country starts with same letter as the domain, or
                //      - a country that has all letters that are in the domain name
                processedDomainInQuestion.isNotBlank() &&
                    (countryName.startsWith(processedDomainInQuestion.first(), ignoreCase = true)||
                        processedDomainInQuestion.all { it in countryName })
            }.distinct().ifEmpty { possibleOptions }

            similarOptions = randomHelper.shuffle(similarOptions).take(numOfOptions - 1)

            // We now have all the similar-ish options - work out if more options are needed to fill the size.
            val numOfOptionsLeftToAdd = (numOfOptions - 1 - similarOptions.size).coerceAtLeast(minimumValue = 0)

            // If yes, then use the remaining options
            val additionalOptions = if (numOfOptionsLeftToAdd > 0) {
                randomHelper.shuffle(
                    possibleOptions - similarOptions.toSet()
                ).take(numOfOptionsLeftToAdd)
            } else {
                emptyList()
            }

            // Filter anything that is the answer, or repeating
            val allOptions = (similarOptions + additionalOptions).filter {
                it != country.name
            }.distinct()

            if (allOptions.isEmpty()) {
                return null
            }

            return finaliseQuestion(
                question = "What country uses the domain '$questionSubject'?",
                possibleOptions = allOptions,
                correctAnswer = answerSubject
            )
        }
    }

    private inner class CountryNameInQuestionVariant : QuestionVariant(numOfOptions, randomHelper) {
        override fun getQuestion(): QuizQuestion? {
            val country = chooseSimpleCountry() ?: return null

            val questionSubject = country.name
            val answerSubject = country.domain.id

            val questionSubjectLettersOnly = questionSubject.filter { it.isLetter() }

            // Use the country name to generate domains
            var similarOptions = questionSubjectLettersOnly
                .mapNotNull { currentLetter ->
                    val processedDomainInAnswer = answerSubject.replace(".", "")

                    val firstLetterOfDomain = processedDomainInAnswer.first()
                    val firstLetterOfCountryInQuestion = questionSubjectLettersOnly.first().lowercase()
                    val randomLetterFromCountryInQuestion = randomHelper.random(
                        questionSubjectLettersOnly.toList()
                    ).lowercase()

                    // Can either use:
                    //  - Domain name's first letter followed by some letter in the name
                    //  - The country-in-question's first letter followed by another random letter
                    val possibleOptions = listOf(
                        ".$firstLetterOfDomain${currentLetter.lowercase()}",
                        ".$firstLetterOfCountryInQuestion$randomLetterFromCountryInQuestion",
                    )

                    // Need to make sure we didn't generate the same option as the answer
                    randomHelper.randomOrNull(possibleOptions)?.takeIf { it != answerSubject }
                }
                .distinct()

            similarOptions = randomHelper.shuffle(similarOptions).take(numOfOptions - 1)

            // Check if we need to add more options
            val numOfOptionsLeftToAdd = (numOfOptions - 1 - similarOptions.size).coerceAtLeast(minimumValue = 0)

            // If yes, then use any available domain names in the Domain class
            val additionalOptions = if (numOfOptionsLeftToAdd > 0) {
                randomHelper.shuffle(
                    (Domain.entries.map { it.id } - similarOptions.toSet() - answerSubject)
                ).distinct().take(numOfOptionsLeftToAdd)
            } else {
                emptyList()
            }

            val allOptions = (similarOptions + additionalOptions).filter {
                it != country.domain.id
            }.distinct()

            if (allOptions.isEmpty()) {
                return null
            }

            return finaliseQuestion(
                question = "What domain is used in $questionSubject?",
                possibleOptions = allOptions,
                correctAnswer = answerSubject
            )
        }
    }
}
