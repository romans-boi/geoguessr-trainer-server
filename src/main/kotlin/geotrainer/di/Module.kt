package geotrainer.di

import geotrainer.dataprovider.CountriesWithNoCoverageProvider
import geotrainer.dataprovider.CountriesWithNoCoverageProviderImpl
import geotrainer.dataprovider.CountryProvider
import geotrainer.dataprovider.quiz.AllQuizzesProvider
import geotrainer.dataprovider.quiz.AllQuizzesProviderImpl
import geotrainer.dataprovider.quiz.quizid.AfricaQuizIdsProvider
import geotrainer.dataprovider.quiz.quizid.AsiaQuizIdsProvider
import geotrainer.dataprovider.quiz.quizid.ContinentQuizIdsProvider
import geotrainer.dataprovider.quiz.quizid.EuropeQuizIdsProvider
import geotrainer.dataprovider.quiz.quizid.GenericQuizIdsProviderImpl
import geotrainer.dataprovider.quiz.quizid.NorthAmericaQuizIdsProvider
import geotrainer.dataprovider.quiz.quizid.OceaniaQuizIdsProvider
import geotrainer.dataprovider.quiz.quizid.SouthAmericaQuizIdsProvider
import geotrainer.feature.allquizzes.domain.AllQuizzesRepository
import geotrainer.feature.allquizzes.domain.AllQuizzesRepositoryImpl
import geotrainer.feature.quiz.domain.QuizGenerator
import geotrainer.feature.quiz.domain.QuizGeneratorImpl
import geotrainer.feature.quiz.domain.QuizRepository
import geotrainer.feature.quiz.domain.QuizRepositoryImpl
import geotrainer.feature.quiz.domain.questionfactory.QuestionFactoryProvider
import geotrainer.feature.quiz.domain.questionfactory.QuestionFactoryProviderImpl
import geotrainer.models.countries.Country
import geotrainer.utils.RandomHelper
import geotrainer.utils.RandomHelperImpl
import org.koin.dsl.module

val appModule = module {
    single<RandomHelper> { RandomHelperImpl() }
    single<CountryProvider> { CountryProvider { Country.allCountries } }
    single<QuestionFactoryProvider> { QuestionFactoryProviderImpl(get(), get()) }
    single<CountriesWithNoCoverageProvider> { CountriesWithNoCoverageProviderImpl() }
    single<AllQuizzesProvider> { AllQuizzesProviderImpl() }

    single<Set<ContinentQuizIdsProvider>> {
        setOf(
            AfricaQuizIdsProvider(),
            AsiaQuizIdsProvider(),
            EuropeQuizIdsProvider(),
            NorthAmericaQuizIdsProvider(),
            SouthAmericaQuizIdsProvider(),
            OceaniaQuizIdsProvider(),

            GenericQuizIdsProviderImpl()
        )
    }

    single<QuizGenerator> { QuizGeneratorImpl(get()) }

    single<AllQuizzesRepository> { AllQuizzesRepositoryImpl(get(), get()) }
    single<QuizRepository> { QuizRepositoryImpl(get()) }
}
