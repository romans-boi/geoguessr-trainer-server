package geotrainer.factories

import geotrainer.models.countries.Country
import geotrainer.models.countries.Germany
import geotrainer.models.countries.Guatemala
import geotrainer.models.countries.Latvia
import geotrainer.models.countries.Norway
import geotrainer.models.countries.Russia
import geotrainer.models.countries.Sweden
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.AsyncTest
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper
import geotrainer.utils.questionfactory.EuropeanUnionQuestionFactory
import geotrainer.utils.questionfactory.QuestionVariant
import io.mockk.every
import io.mockk.mockk
import org.junit.Test
import kotlin.test.assertEquals

class EuropeanUnionQuestionFactoryTests: AsyncTest() {
    private val numOfOptions = 4
    private val randomHelper: RandomHelper = mockk<RandomHelper>()
    private val countryProvider: CountryProvider = mockk<CountryProvider>()

    private fun getSut(): EuropeanUnionQuestionFactory =
        EuropeanUnionQuestionFactory(numOfOptions, randomHelper, countryProvider)

    override fun setup() {
        super.setup()

        // All shuffles should just return the list as it is without shuffling
        every { randomHelper.shuffle(any<List<Any>>()) } returnsArgument 0
    }

    // ========== Variant 1 - EU in Question ===========

    @Test
    fun euInQuestionVariantCorrectlyGeneratesQuizForNonEuCountry() {
        /* Set up */
        val norway = Norway()
        val latvia = Latvia()
        val sweden = Sweden()
        val germany = Germany()

        val testCountries = listOf(
            norway,
            latvia,
            sweden,
            germany,

            Guatemala()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut()

        val allRelevantQuestionCountries: List<Country> = testCountries.filterIsInstance<Country.EuropeanCountry>()

        val expectedOptions = listOf(
            latvia.name,
            sweden.name,
            germany.name
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns norway

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "Which country is NOT in the European Union?",
                options = expectedOptions + norway.name,
                correctAnswer = norway.name
            ),
            question
        )
    }

    @Test
    fun euInQuestionVariantCorrectlyGeneratesQuizForEuCountry() {
        /* Set up */
        val sweden = Sweden()
        val russia = Russia()
        val norway = Norway()

        val testCountries = listOf(
            sweden,
            russia,
            norway
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut()

        val allRelevantQuestionCountries: List<Country> = testCountries.filterIsInstance<Country.EuropeanCountry>()

        val expectedOptions = listOf(
            russia.name,
            norway.name,
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns sweden

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "Which country is in the European Union?",
                options = expectedOptions + sweden.name,
                correctAnswer = sweden.name
            ),
            question
        )
    }

    @Test
    fun euInQuestionVariantNoRelevantCountries() {
        /* Set up */
        val testCountries = listOf<Country>()

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut()

        val allRelevantQuestionCountries: List<Country> = testCountries.filterIsInstance<Country.EuropeanCountry>()

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    @Test
    fun euInQuestionVariantFiltersOutRepetitions() {
        /* Set up */
        val norway = Norway()
        val latvia = Latvia()

        val testCountries = listOf(
            norway,
            Norway(),
            latvia,
            Latvia(),

            Guatemala()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut()

        val allRelevantQuestionCountries: List<Country> = testCountries.filterIsInstance<Country.EuropeanCountry>()

        val expectedOptions = listOf(latvia.name,)

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns norway

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "Which country is NOT in the European Union?",
                options = expectedOptions + norway.name,
                correctAnswer = norway.name
            ),
            question
        )
    }

    // ========== Variant 2 - Country name in Question ===========

    @Test
    fun countryInQuestionVariantCorrectlyGeneratesQuestion() {
        /* Set up */
        val norway = Norway()

        val testCountries = listOf(
            norway,

            Guatemala()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut()

        val allRelevantQuestionCountries: List<Country> = testCountries.filterIsInstance<Country.EuropeanCountry>()

        val expectedOptions = listOf("True", "False")

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns norway

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                question = "${norway.name} is part of the European Union",
                options = expectedOptions,
                correctAnswer = "False"
            ),
            question
        )
    }

    @Test
    fun countryInQuestionVariantNoRelevantCountries() {
        /* Set up */
        val testCountries = listOf(Guatemala())

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut()

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(listOf<Country>()) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }
}
