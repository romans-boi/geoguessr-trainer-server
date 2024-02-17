package geotrainer.factories

import geotrainer.dataprovider.CountryProvider
import geotrainer.feature.quiz.domain.questionfactory.CapitalCitiesQuestionFactory
import geotrainer.feature.quiz.domain.questionfactory.QuestionVariant
import geotrainer.models.City
import geotrainer.models.Continent
import geotrainer.models.countries.Australia
import geotrainer.models.countries.Country
import geotrainer.models.countries.France
import geotrainer.models.countries.Indonesia
import geotrainer.models.countries.Malaysia
import geotrainer.models.countries.Nigeria
import geotrainer.models.countries.SouthAfrica
import geotrainer.models.quiz.OptionData
import geotrainer.models.quiz.QuestionData
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.AsyncTest
import geotrainer.utils.RandomHelper
import io.mockk.every
import io.mockk.mockk
import org.junit.Test

import kotlin.test.assertEquals

class CapitalCitiesQuestionFactoryTests : AsyncTest() {
    private val numOfOptions = 4
    private val randomHelper: RandomHelper = mockk<RandomHelper>()
    private val countryProvider: CountryProvider = mockk<CountryProvider>()

    private fun getSut(continent: Continent?): CapitalCitiesQuestionFactory =
        CapitalCitiesQuestionFactory(continent, numOfOptions, randomHelper, countryProvider)

    override fun setup() {
        super.setup()

        // All shuffles should just return the list as it is without shuffling
        every { randomHelper.shuffle(any<List<Any>>()) } returnsArgument 0
    }

    // ========== Variant 1 - Capital city in Question ===========

    @Test
    fun capitalCityInQuestionVariantCorrectlyGeneratesQuizAfrica() {
        /* Set up */
        val continent = Continent.Africa
        val southAfrica = SouthAfrica()
        val nigeria = Nigeria()
        val capitalCity = City("Pretoria (administrative)")

        val testCountries = listOf(
            southAfrica,
            nigeria,
            France(),
            Australia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        val countriesForOptions = (allRelevantQuestionCountries - southAfrica).map { it.name }
        val options = countriesForOptions.take(3)

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns southAfrica
        every { randomHelper.randomOrNull(southAfrica.capitalCities) } returns capitalCity

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "$capitalCity is the capital of..."),
                OptionData.Text(
                    options = options + southAfrica.name,
                    correctAnswer = southAfrica.name
                )
            ),
            question
        )
    }

    @Test
    fun capitalCityInQuestionVariantEmptyRemainingCountries() {
        /* Set up */
        val continent = Continent.Africa

        val testCountries: List<Country> = listOf()

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        // Testing edge case (that shouldn't happen) where remaining countries are empty
        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun capitalCityInQuestionVariantCapitalCitiesIsEmpty() {
        /* Set up */
        val continent = Continent.Africa
        val southAfrica = SouthAfrica().copy(capitalCities = listOf())
        val capitalCity = City("Pretoria (administrative)")

        val testCountries: List<Country> = listOf(
            southAfrica
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        // Testing edge case (that shouldn't happen) where capital cities are empty
        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns southAfrica
        every { randomHelper.randomOrNull(southAfrica.capitalCities) } returns capitalCity

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun capitalCityInQuestionVariantNoPossibleOtherOptions() {
        /* Set up */
        val continent = Continent.Africa
        val southAfrica = SouthAfrica()
        val capitalCity = City("Pretoria (administrative)")

        val testCountries: List<Country> = listOf(
            southAfrica
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns southAfrica
        every { randomHelper.randomOrNull(southAfrica.capitalCities) } returns capitalCity

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun capitalCityInQuestionVariantSameOptionsAreFilteredOut() {
        /* Set up */
        val continent = Continent.Africa
        val southAfrica = SouthAfrica()
        val capitalCity = City("Pretoria (administrative)")

        val testCountries: List<Country> = listOf(
            southAfrica,
            // Separate instant of SouthAfrica representing a country that may have same data as the answer
            SouthAfrica(),

            // Multiple of Nigeria represents 2 countries that aren't the answers that have the same data
            Nigeria(),
            Nigeria()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns southAfrica
        every { randomHelper.randomOrNull(southAfrica.capitalCities) } returns capitalCity

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "$capitalCity is the capital of..."),
                OptionData.Text(
                    options = listOf("Nigeria", "South Africa"),
                    correctAnswer = southAfrica.name
                )
            ),
            question
        )
    }

    // ========== Variant 2 - Country name in Question ===========

    @Test
    fun countryInQuestionVariantCorrectlyGeneratesQuizAsia() {
        /* Set up */
        val continent = Continent.Asia

        val indonesia = Indonesia()
        val malaysia = Malaysia()
        val france = France()
        val australia = Australia()

        val testCountries = listOf(
            indonesia,
            malaysia,
            france,
            australia
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }
        val answer = indonesia.capitalCities.first()

        val countriesForOptions = (allRelevantQuestionCountries - indonesia).map { it.capitalCities!!.first() }
        val options = countriesForOptions.take(3)

        every { randomHelper.randomOrNull(sut.questionVariants) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns indonesia
        every { randomHelper.randomOrNull(indonesia.capitalCities) } returns answer
        every { randomHelper.randomOrNull(malaysia.capitalCities) } returns malaysia.capitalCities.first()

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "What is the capital of ${indonesia.name}?"),
                OptionData.Text(
                    options = (options + answer).map { it.name },
                    correctAnswer = answer.name
                )
            ),
            question
        )
    }

    @Test
    fun countryInQuestionVariantRemainingCountriesIsNull() {
        /* Set up */
        val continent = Continent.Asia

        val testCountries: List<Country> = listOf()

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        every { randomHelper.randomOrNull(sut.questionVariants) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun countryInQuestionVariantCapitalCitiesIsNull() {
        /* Set up */
        val continent = Continent.Asia
        val indonesia = Indonesia()

        val testCountries: List<Country> = listOf(indonesia)

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }

        every { randomHelper.randomOrNull(sut.questionVariants) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns indonesia
        every { randomHelper.randomOrNull(indonesia.capitalCities) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun countryInQuestionVariantNoPossibleOtherOptions() {
        /* Set up */
        val continent = Continent.Asia

        val indonesia = Indonesia()
        val france = France()
        val australia = Australia()

        val testCountries = listOf(
            indonesia,
            france,
            australia
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }
        val answer = indonesia.capitalCities.first()

        every { randomHelper.randomOrNull(sut.questionVariants) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns indonesia
        every { randomHelper.randomOrNull(indonesia.capitalCities) } returns answer

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun countryInQuestionVariantNoMultipleOfSameOption() {
        /* Set up */
        val continent = Continent.Asia

        val indonesia = Indonesia()
        val malaysia = Malaysia()

        val testCountries = listOf(
            indonesia,
            Indonesia(),
            malaysia,
            Malaysia()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries = testCountries.filter {
            it.continent == continent
        }
        val answer = indonesia.capitalCities.first()

        every { randomHelper.randomOrNull(sut.questionVariants) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns indonesia
        every { randomHelper.randomOrNull(indonesia.capitalCities) } returns answer
        every { randomHelper.randomOrNull(malaysia.capitalCities) } returns malaysia.capitalCities.first()

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "What is the capital of ${indonesia.name}?"),
                OptionData.Text(
                    options = listOf(malaysia.capitalCities.first().name, answer.name),
                    correctAnswer = answer.name
                )
            ),
            question
        )
    }
}
