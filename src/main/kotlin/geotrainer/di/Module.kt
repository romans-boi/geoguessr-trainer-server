package geotrainer.di

import geotrainer.domain.GenerateQuizUseCase
import geotrainer.domain.GenerateQuizUseCaseImpl
import geotrainer.models.countries.Country
import geotrainer.utils.CountryProvider
import geotrainer.utils.QuizGenerator
import geotrainer.utils.QuizGeneratorImpl
import geotrainer.utils.RandomHelper
import geotrainer.utils.RandomHelperImpl
import geotrainer.utils.questionfactory.QuestionFactory
import geotrainer.utils.questionfactory.QuestionFactoryProvider
import geotrainer.utils.questionfactory.QuestionFactoryProviderImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
    single<RandomHelper> { RandomHelperImpl() }
    single<CountryProvider> { CountryProvider { Country.allCountries } }
    single<QuestionFactoryProvider> { QuestionFactoryProviderImpl(get(), get()) }

    single<GenerateQuizUseCase> { GenerateQuizUseCaseImpl() }
    single<QuizGenerator> { QuizGeneratorImpl(get()) }

}