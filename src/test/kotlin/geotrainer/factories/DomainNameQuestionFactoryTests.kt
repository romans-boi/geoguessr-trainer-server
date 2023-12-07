package geotrainer.factories

import geotrainer.models.Continent
import geotrainer.models.Domain
import geotrainer.models.countries.Country
import geotrainer.models.countries.Croatia
import geotrainer.models.countries.Hungary
import geotrainer.models.countries.Indonesia
import geotrainer.models.countries.Luxembourg
import geotrainer.models.countries.Netherlands
import geotrainer.models.countries.Serbia
import geotrainer.models.countries.Slovenia
import geotrainer.models.countries.Sweden
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.AsyncTest
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper
import geotrainer.utils.questionfactory.DomainNameQuestionFactory
import geotrainer.utils.questionfactory.QuestionVariant
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test
import kotlin.test.assertEquals

class DomainNameQuestionFactoryTests: AsyncTest() {
    private val numOfOptions = 4
    private val randomHelper: RandomHelper = mockk<RandomHelper>()
    private val countryProvider: CountryProvider = mockk<CountryProvider>()

    private fun getSut(continent: Continent?): DomainNameQuestionFactory =
        DomainNameQuestionFactory(continent, numOfOptions, randomHelper, countryProvider)

    override fun setup() {
        super.setup()

        // All shuffles should just return the list as it is without shuffling
        every { randomHelper.shuffle(any<List<Any>>()) } returnsArgument 0
    }

    // ========== Variant 1 - Domain in Question ===========

    @Test
    fun domainInQuestionVariantCorrectlyGeneratesQuizEurope() {
        /* Set up */
        val continent = Continent.Europe

        val sweden = Sweden()
        val slovenia = Slovenia()
        val serbia = Serbia()
        val netherlands = Netherlands()

        val testCountries = listOf(
            sweden,
            // Country that has "s" as the starting letter
            slovenia,
            serbia,

            // Country that has both "e" and "s" but doesn't necessarily start with "s"
            netherlands,

            // Non-european for test
            Indonesia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        val expectedOptions = listOf(
            slovenia.name,
            serbia.name,
            netherlands.name
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns sweden

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "What country uses the domain '${sweden.domain.id}'?",
                options = expectedOptions + sweden.name,
                correctAnswer = sweden.name
            ),
            question
        )
    }

    @Test
    fun domainInQuestionVariantRemainingCountriesIsNull() {
        /* Set up */
        val continent = Continent.Europe
        val testCountries: List<Country> = listOf()

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun domainInQuestionVariantPrioritisesSimilarCountries() {
        /* Set up */
        val continent = Continent.Europe

        val sweden = Sweden()
        val slovenia = Slovenia()
        val serbia = Serbia()
        val netherlands = Netherlands()

        val testCountries = listOf(
            sweden,

            // These are high up in the list, but don't match the similar criteria
            Luxembourg(),
            Hungary(),

            // Country that has "s" as the starting letter
            slovenia,
            serbia,

            // Country that has both "e" and "s" but doesn't necessarily start with "s"
            netherlands,

            // Non-european for test
            Indonesia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        val expectedOptions = listOf(
            slovenia.name,
            serbia.name,
            netherlands.name
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns sweden

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "What country uses the domain '${sweden.domain.id}'?",
                options = expectedOptions + sweden.name,
                correctAnswer = sweden.name
            ),
            question
        )
    }

    @Test
    fun domainInQuestionVariantResortsToNonSimilarCountriesIfNoMore() {
        /* Set up */
        val continent = Continent.Europe

        val sweden = Sweden()
        val slovenia = Slovenia()
        val luxembourg = Luxembourg()
        val hungary = Hungary()

        val testCountries = listOf(
            sweden,

            // Don't match the similar criteria, but will resort to these because no more similar options
            luxembourg,
            hungary,

            // Similar country
            slovenia,

            // Non-european for test
            Indonesia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        val expectedOptions = listOf(
            slovenia.name,
            luxembourg.name,
            hungary.name
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns sweden

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "What country uses the domain '${sweden.domain.id}'?",
                options = expectedOptions + sweden.name,
                correctAnswer = sweden.name
            ),
            question
        )
    }

    @Test
    fun domainInQuestionVariantNotEnoughOptions() {
        /* Set up */
        val continent = Continent.Europe

        val sweden = Sweden()

        val testCountries = listOf(
            sweden,
            // Non-european for test
            Indonesia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns sweden

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null ,question)
    }

    @Test
    fun domainInQuestionVariantAllOptionsAreDistinct() {
        /* Set up */
        val continent = Continent.Europe

        val sweden = Sweden()
        val serbia = Serbia()

        val testCountries = listOf(
            sweden,
            Sweden(),

            serbia,
            Serbia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        // No duplications
        val expectedOptions = listOf(serbia.name,)

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns sweden

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "What country uses the domain '${sweden.domain.id}'?",
                options = expectedOptions + sweden.name,
                correctAnswer = sweden.name
            ),
            question
        )
    }

    // ========== Variant 2 - Country name in Question ===========

    @Test
    fun countryInQuestionVariantCorrectlyGeneratesQuizEurope() {
        /* Set up */
        val continent = Continent.Europe

        // For shorter tests
        val croatia = Croatia().copy(name = "Cro")

        val testCountries = listOf(
            croatia,

            // Non-european for test
            Indonesia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        // First in the list represents first letter of domain + current letter from country in the loop
        // Second in the list represents first letter of country + 'random' letter from the country (mocked as 'c' here)
        val possibleOptionVariant1 = listOf(".hc", ".cc")
        val possibleOptionVariant2 = listOf(".hr", ".cc")
        val possibleOptionVariant3 = listOf(".ho", ".cc")

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns croatia

        // This is a mock for the 'random' letter from the country
        every { randomHelper.random(croatia.name.toList()) } returns 'C'

        every { randomHelper.randomOrNull(possibleOptionVariant1) } returns ".hc"
        every { randomHelper.randomOrNull(possibleOptionVariant2) } returns ".cc"
        every { randomHelper.randomOrNull(possibleOptionVariant3) } returns ".ho"

        val possibleOptions = listOf(".hc", ".cc", ".ho")

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "What domain is used in ${croatia.name}?",
                options = possibleOptions + croatia.domain.id,
                correctAnswer = croatia.domain.id
            ),
            question
        )
    }

    @Test
    fun countryInQuestionVariantRemainingIsEmpty() {
        /* Set up */
        val continent = Continent.Europe

        val testCountries: List<Country> = listOf()

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun countryInQuestionVariantCorrectlyRemovesRepetitionsAndFillsUpRemainingOptions() {
        /* Set up */
        val continent = Continent.Europe

        // For shorter tests
        val croatia = Croatia().copy(name = "Cru")

        val testCountries = listOf(
            croatia,

            // Non-european for test
            Indonesia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        // First in the list represents first letter of domain + current letter from country in the loop
        // Second in the list represents first letter of country + 'random' letter from the country (mocked as 'c' here)
        val possibleOptionVariant1 = listOf(".hc", ".cc")
        val possibleOptionVariant2 = listOf(".hr", ".cc")
        val possibleOptionVariant3 = listOf(".hu", ".cc")

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns croatia

        // This is a mock for the 'random' letter from the country
        every { randomHelper.random(croatia.name.toList()) } returns 'C'

        // Testing repetitions
        every { randomHelper.randomOrNull(possibleOptionVariant1) } returns ".cc"
        every { randomHelper.randomOrNull(possibleOptionVariant2) } returns ".cc"
        every { randomHelper.randomOrNull(possibleOptionVariant3) } returns ".hu"

        val possibleOptions = listOf(".cc", ".hu")
        val possibleOtherOptions = (Domain.entries.map { it.id } - ".cc" - ".hu" - croatia.domain.id)

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "What domain is used in ${croatia.name}?",
                options = possibleOptions + possibleOtherOptions[0] + croatia.domain.id,
                correctAnswer = croatia.domain.id
            ),
            question
        )

        verify { randomHelper.shuffle(possibleOtherOptions) }
    }

    @Test
    fun countryInQuestionVariantAllOptionsDistinct() {
        /* Set up */
        val continent = Continent.Europe

        // For shorter tests
        val croatia = Croatia().copy(name = "Cru")

        val testCountries = listOf(
            croatia,
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        // First in the list represents first letter of domain + current letter from country in the loop
        // Second in the list represents first letter of country + 'random' letter from the country (mocked as 'c' here)
        val possibleOptionVariant1 = listOf(".hc", ".cc")
        val possibleOptionVariant2 = listOf(".hr", ".cc")
        val possibleOptionVariant3 = listOf(".hu", ".cc")

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns croatia

        // This is a mock for the 'random' letter from the country
        every { randomHelper.random(croatia.name.toList()) } returns 'C'

        // Testing repetitions
        every { randomHelper.randomOrNull(possibleOptionVariant1) } returns ".cc"
        every { randomHelper.randomOrNull(possibleOptionVariant2) } returns ".cc"
        every { randomHelper.randomOrNull(possibleOptionVariant3) } returns ".hu"

        val possibleOptions = listOf(".cc", ".hu")
        val possibleOtherOptions = (Domain.entries.map { it.id } - ".cc" - ".hu" - croatia.domain.id)

        // Override the shuffle to return options that already exist (whilst technically not possible, this is just
        // testing that the returned list is filtered out)
        every { randomHelper.shuffle(possibleOtherOptions) } returns possibleOptions

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "What domain is used in ${croatia.name}?",
                options = possibleOptions + croatia.domain.id,
                correctAnswer = croatia.domain.id
            ),
            question
        )

        verify { randomHelper.shuffle(possibleOtherOptions) }
    }

    @Test
    fun countryInQuestionVariantNullIfNoOptions() {
        /* Set up */
        val continent = Continent.Europe

        // For shorter tests
        val sweden = Sweden().copy(name = "Se")

        val testCountries = listOf(
            sweden,
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        // First in the list represents first letter of domain + current letter from country in the loop
        // Second in the list represents first letter of country + 'random' letter from the country (mocked as 'c' here)
        val possibleOptionVariant1 = listOf(".ss", ".se")
        val possibleOptionVariant2 = listOf(".se", ".se")

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns sweden

        // This is a mock for the 'random' letter from the country
        every { randomHelper.random(sweden.name.toList()) } returns 'e'

        // All options are the same as the answer, so shouldn't be able to use them as an option
        every { randomHelper.randomOrNull(possibleOptionVariant1) } returns ".se"
        every { randomHelper.randomOrNull(possibleOptionVariant2) } returns ".se"

        val possibleOptions: List<String> = listOf()
        val possibleOtherOptions = (Domain.entries.map { it.id } - sweden.domain.id)

        // Override the shuffle to return options that already exist (whilst technically not possible, this is just
        // testing that the returned list is filtered out)
        every { randomHelper.shuffle(possibleOtherOptions) } returns possibleOptions

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)

        verify { randomHelper.shuffle(possibleOtherOptions) }
    }
}
