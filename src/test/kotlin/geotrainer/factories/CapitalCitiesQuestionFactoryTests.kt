package geotrainer.factories

import geotrainer.models.Continent
import geotrainer.models.countries.Country
import geotrainer.models.countries.SouthAfrica
import geotrainer.models.quiz.QuizQuestion
import geotrainer.utils.AsyncTest
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper
import geotrainer.utils.questionfactory.CapitalCitiesQuestionFactory
import geotrainer.utils.questionfactory.QuestionVariant
import io.mockk.every
import io.mockk.mockk
import org.junit.Test
import java.lang.IllegalStateException
import kotlin.test.assertEquals

class CapitalCitiesQuestionFactoryTests: AsyncTest() {
    private val numOfOptions = 4
    private val randomHelper: RandomHelper = mockk<RandomHelper>()
    private val countryProvider: CountryProvider = mockk<CountryProvider>()

    private fun getSut(continent: Continent?): CapitalCitiesQuestionFactory =
        CapitalCitiesQuestionFactory(continent, numOfOptions, randomHelper, countryProvider)

    @Test
    fun capitalCityInQuestionVariantCorrectlyGeneratesQuizAfrica() {
        val continent = Continent.Africa

        // TODO make better tests
        every { countryProvider.getAllCountries() } returns Country.allCountries

        val sut = getSut(continent)
        val allRelevantQuestionCountries = Country.allCountries.filter {
            it.continent == continent
        }
        val southAfrica = allRelevantQuestionCountries.find { it is SouthAfrica } ?: throw IllegalStateException("SA should be in list")
        val capitalCity = "Pretoria (administrative)"

        val countriesForOptions = (allRelevantQuestionCountries - southAfrica).map { it.name }
        val options = countriesForOptions.take(3)

        every { randomHelper.shuffle(any<List<Any>>()) } returnsArgument 0

        every { randomHelper.randomOrNull(any<List<QuestionVariant>>()) } returns sut.questionVariants[0]
        every { randomHelper.randomOrNull(allRelevantQuestionCountries)} returns southAfrica
        every { randomHelper.randomOrNull(southAfrica.capitalCities)} returns capitalCity
        every { randomHelper.randomOrNull(countriesForOptions) }

        val question = sut.getQuestion()

        assertEquals(
            QuizQuestion(
                question = "$capitalCity is the capital of...",
                options = options + southAfrica.name,
                correctAnswer = southAfrica.name
            ),
            question
        )
    }

}