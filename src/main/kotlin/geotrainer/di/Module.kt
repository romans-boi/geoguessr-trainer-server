package geotrainer.di

import geotrainer.domain.GenerateQuizUseCase
import geotrainer.domain.GenerateQuizUseCaseImpl
import geotrainer.feature.allquizzes.domain.AllQuizzesRepository
import geotrainer.feature.allquizzes.domain.AllQuizzesRepositoryImpl
import geotrainer.models.countries.Country
import geotrainer.utils.CountryProvider
import geotrainer.utils.QuizGenerator
import geotrainer.utils.QuizGeneratorImpl
import geotrainer.utils.RandomHelper
import geotrainer.utils.RandomHelperImpl
import geotrainer.utils.questionfactory.QuestionFactoryProvider
import geotrainer.utils.questionfactory.QuestionFactoryProviderImpl
import org.koin.dsl.module

val appModule = module {
    single<RandomHelper> { RandomHelperImpl() }
    single<CountryProvider> { CountryProvider { Country.allCountries } }
    single<QuestionFactoryProvider> { QuestionFactoryProviderImpl(get(), get()) }

    single<GenerateQuizUseCase> { GenerateQuizUseCaseImpl() }
    single<QuizGenerator> { QuizGeneratorImpl(get()) }

    single<AllQuizzesRepository> { AllQuizzesRepositoryImpl() }
}
