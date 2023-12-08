package geotrainer.di

import geotrainer.feature.allquizzes.domain.AllQuizzesRepository
import geotrainer.feature.allquizzes.domain.AllQuizzesRepositoryImpl
import geotrainer.feature.quiz.domain.QuizRepository
import geotrainer.feature.quiz.domain.QuizRepositoryImpl
import geotrainer.models.countries.Country
import geotrainer.utils.CountryProvider
import geotrainer.feature.quiz.domain.QuizGenerator
import geotrainer.feature.quiz.domain.QuizGeneratorImpl
import geotrainer.utils.RandomHelper
import geotrainer.utils.RandomHelperImpl
import geotrainer.feature.quiz.domain.questionfactory.QuestionFactoryProvider
import geotrainer.feature.quiz.domain.questionfactory.QuestionFactoryProviderImpl
import org.koin.dsl.module

val appModule = module {
    single<RandomHelper> { RandomHelperImpl() }
    single<CountryProvider> { CountryProvider { Country.allCountries } }
    single<QuestionFactoryProvider> { QuestionFactoryProviderImpl(get(), get()) }

    single<QuizGenerator> { QuizGeneratorImpl(get()) }

    single<AllQuizzesRepository> { AllQuizzesRepositoryImpl() }
    single<QuizRepository> { QuizRepositoryImpl(get()) }
}
