package geotrainer.di

import geotrainer.dataprovider.CountriesWithNoCoverageProvider
import geotrainer.dataprovider.CountriesWithNoCoverageProviderImpl
import geotrainer.dataprovider.CountryProvider
import geotrainer.dataprovider.quiz.AllQuizzesProvider
import geotrainer.dataprovider.quiz.AllQuizzesProviderImpl
import geotrainer.dataprovider.quiz.quiztype.AfricaQuizTypesProvider
import geotrainer.dataprovider.quiz.quiztype.AsiaQuizTypesProvider
import geotrainer.dataprovider.quiz.quiztype.ContinentQuizTypesProvider
import geotrainer.dataprovider.quiz.quiztype.EuropeQuizTypesProvider
import geotrainer.dataprovider.quiz.quiztype.GenericQuizTypesProviderImpl
import geotrainer.dataprovider.quiz.quiztype.NorthAmericaQuizTypesProvider
import geotrainer.dataprovider.quiz.quiztype.OceaniaQuizTypesProvider
import geotrainer.dataprovider.quiz.quiztype.SouthAmericaQuizTypesProvider
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

    single<Set<ContinentQuizTypesProvider>> {
        setOf(
            AfricaQuizTypesProvider(),
            AsiaQuizTypesProvider(),
            EuropeQuizTypesProvider(),
            NorthAmericaQuizTypesProvider(),
            SouthAmericaQuizTypesProvider(),
            OceaniaQuizTypesProvider(),

            GenericQuizTypesProviderImpl()
        )
    }

    single<QuizGenerator> { QuizGeneratorImpl(get()) }

    single<AllQuizzesRepository> { AllQuizzesRepositoryImpl(get(), get()) }
    single<QuizRepository> { QuizRepositoryImpl(get()) }
}
