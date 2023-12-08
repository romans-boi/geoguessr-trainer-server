package geotrainer.feature.quiz.domain.questionfactory

import geotrainer.models.Continent
import geotrainer.utils.CountryProvider
import geotrainer.utils.RandomHelper

interface QuestionFactoryProvider {
    fun getCapitalCitiesQuestionFactory(
        numOfOptions: Int,
        continent: Continent?,
    ): CapitalCitiesQuestionFactory

    fun getDomainNamesQuestionFactory(
        numOfOptions: Int,
        continent: Continent?,
    ): DomainNameQuestionFactory

    fun getDrivingSideQuestionFactory(
        numOfOptions: Int,
        continent: Continent?,
    ): DrivingSideQuestionFactory

    fun getEuropeanUnionQuestionFactory(
        numOfOptions: Int
    ): EuropeanUnionQuestionFactory
}
/**
 * Helper class mainly to make tests easier
 * */
class QuestionFactoryProviderImpl(
    private val randomHelper: RandomHelper,
    private val countryProvider: CountryProvider,
): QuestionFactoryProvider {
    override fun getCapitalCitiesQuestionFactory(
        numOfOptions: Int,
        continent: Continent?,
    ): CapitalCitiesQuestionFactory = CapitalCitiesQuestionFactory(
        continent,
        numOfOptions,
        randomHelper,
        countryProvider
    )

    override fun getDomainNamesQuestionFactory(
        numOfOptions: Int,
        continent: Continent?,
    ): DomainNameQuestionFactory = DomainNameQuestionFactory(continent, numOfOptions, randomHelper, countryProvider)

    override fun getDrivingSideQuestionFactory(
        numOfOptions: Int,
        continent: Continent?,
    ): DrivingSideQuestionFactory = DrivingSideQuestionFactory(continent, numOfOptions, randomHelper, countryProvider)

    override fun getEuropeanUnionQuestionFactory(
        numOfOptions: Int
    ): EuropeanUnionQuestionFactory = EuropeanUnionQuestionFactory(numOfOptions, randomHelper, countryProvider)
}
