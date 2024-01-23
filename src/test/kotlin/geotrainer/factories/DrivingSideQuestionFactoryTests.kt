package geotrainer.factories

import geotrainer.feature.quiz.domain.questionfactory.DrivingSideQuestionFactory
import geotrainer.feature.quiz.domain.questionfactory.QuestionVariant
import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.countries.France
import geotrainer.models.countries.Indonesia
import geotrainer.models.countries.Japan
import geotrainer.models.countries.Malaysia
import geotrainer.models.countries.Sweden
import geotrainer.models.countries.UnitedStates
import geotrainer.models.quiz.OptionData
import geotrainer.models.quiz.QuestionData
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.AsyncTest
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper
import io.mockk.every
import io.mockk.mockk
import org.junit.Test

import kotlin.test.assertEquals

class DrivingSideQuestionFactoryTests : AsyncTest() {
    private val numOfOptions = 4
    private val randomHelper: RandomHelper = mockk<RandomHelper>()
    private val countryProvider: CountryProvider = mockk<CountryProvider>()

    private fun getSut(continent: Continent?): DrivingSideQuestionFactory =
        DrivingSideQuestionFactory(continent, numOfOptions, randomHelper, countryProvider)

    override fun setup() {
        super.setup()

        // All shuffles should just return the list as it is without shuffling
        every { randomHelper.shuffle(any<List<Any>>()) } returnsArgument 0
    }

    // ========== Variant 1 - driving side in Question ===========

    @Test
    fun drivingSideInQuestionVariantCorrectlyGeneratesQuizAllContinentsLeft() {
        /* Set up */
        val indonesia = Indonesia()
        val france = France()
        val sweden = Sweden()
        val usa = UnitedStates()

        val testCountries = listOf(
            indonesia,
            france,
            sweden,
            usa,
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(null)

        val allRelevantQuestionCountries: List<Country> = testCountries

        val expectedOptions = listOf(
            france.name,
            sweden.name,
            usa.name
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns indonesia

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "Which country drives on the left?"),
                OptionData.Text(
                    options = expectedOptions + indonesia.name,
                    correctAnswer = indonesia.name
                )
            ),
            question
        )
    }

    @Test
    fun drivingSideInQuestionVariantCorrectlyGeneratesQuizAllContinentsRight() {
        /* Set up */
        val sweden = Sweden()
        val malaysia = Malaysia()
        val indonesia = Indonesia()
        val japan = Japan()

        val testCountries = listOf(
            indonesia,
            malaysia,
            sweden,
            japan,
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(null)

        val allRelevantQuestionCountries: List<Country> = testCountries

        val expectedOptions = listOf(
            indonesia.name,
            malaysia.name,
            japan.name
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns sweden

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "Which country drives on the right?"),
                OptionData.Text(
                    options = expectedOptions + sweden.name,
                    correctAnswer = sweden.name
                )
            ),
            question
        )
    }

    @Test
    fun drivingSideInQuestionVariantFiltersOutSameSideCountries() {
        /* Set up */
        val indonesia = Indonesia()
        val malaysia = Malaysia()
        val sweden = Sweden()
        val usa = UnitedStates()

        val testCountries = listOf(
            indonesia,
            malaysia,
            sweden,
            usa,
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(null)

        val allRelevantQuestionCountries: List<Country> = testCountries

        val expectedOptions = listOf(
            sweden.name,
            usa.name
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns indonesia

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "Which country drives on the left?"),
                OptionData.Text(
                    options = expectedOptions + indonesia.name,
                    correctAnswer = indonesia.name
                )
            ),
            question
        )
    }

    @Test
    fun drivingSideInQuestionVariantOptionsAreDistinct() {
        /* Set up */
        val indonesia = Indonesia()
        val sweden = Sweden()

        val testCountries = listOf(
            indonesia,
            Indonesia(),
            sweden,
            Sweden()
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(null)

        val allRelevantQuestionCountries: List<Country> = testCountries

        val expectedOptions = listOf(
            sweden.name
        )

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns indonesia

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "Which country drives on the left?"),
                OptionData.Text(
                    options = expectedOptions + indonesia.name,
                    correctAnswer = indonesia.name
                )
            ),
            question
        )
    }

    @Test
    fun drivingSideInQuestionVariantRemainingCountriesIsEmpty() {
        /* Set up */

        val testCountries = listOf<Country>()

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(null)

        val allRelevantQuestionCountries: List<Country> = testCountries

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }

    // ========== Variant 2 - country in Question ===========

    @Test
    fun countryInQuestionVariantCorrectlyGeneratesQuizAsiaLeft() {
        /* Set up */
        val continent = Continent.Asia

        val indonesia = Indonesia()

        val testCountries = listOf(
            indonesia,
            France(),
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries: List<Country> = testCountries.filter { it.continent == continent }

        val expectedOptions = listOf("Left", "Right")

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns indonesia

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "What driving side of the road is used in ${indonesia.name}?"),
                OptionData.Text(
                    options = expectedOptions,
                    correctAnswer = "Left"
                )
            ),
            question
        )
    }

    @Test
    fun countryInQuestionVariantCorrectlyGeneratesQuizNorthAmericaRight() {
        /* Set up */
        val continent = Continent.NorthAmerica

        val usa = UnitedStates()

        val testCountries = listOf(
            usa,
            France(),
        )

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries: List<Country> = testCountries.filter { it.continent == continent }

        val expectedOptions = listOf("Left", "Right")

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns usa

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(
            QuizQuestion(
                QuestionData(question = "What driving side of the road is used in ${usa.name}?"),
                OptionData.Text(
                    options = expectedOptions,
                    correctAnswer = "Right"
                )
            ),
            question
        )
    }

    @Test
    fun countryInQuestionVariantRemainingCountriesEmpty() {
        /* Set up */
        val continent = Continent.NorthAmerica

        val testCountries = listOf<Country>()

        every { countryProvider.getAllCountries() } returns testCountries

        val sut = getSut(continent)

        val allRelevantQuestionCountries: List<Country> = testCountries.filter { it.continent == continent }

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[1]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries) } returns null

        /* Run test */
        val question = sut.getQuestion()

        /* Verify */
        assertEquals(null, question)
    }
}
