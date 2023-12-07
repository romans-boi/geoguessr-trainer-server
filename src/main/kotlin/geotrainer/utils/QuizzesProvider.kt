package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizSection
import geotrainer.models.quiz.QuizType

fun QuizType.Companion.getSectionedQuizzes(): List<QuizSection> = getGenericSectionedQuizzes() +
    Continent.entries.flatMap {
        it.getContinentSectionedQuizzes()
    }

private fun QuizType.Companion.getGenericSectionedQuizzes(): List<QuizSection> = setOf(
    QuizType.Everything,
    QuizType.CountryInContinent,
    QuizType.CapitalCities,
    QuizType.DomainNames,
    QuizType.DrivingSide
).map { quiz -> QuizSection(quiz, continent = null) }

private fun Continent.getContinentSectionedQuizzes(): List<QuizSection> = when(this) {
    Continent.Africa -> setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    ).map { quiz -> QuizSection(quiz, continent = this) }

    Continent.Asia -> setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,

        QuizType.JapanesePrefecturesKanji
    ).map { quiz -> QuizSection(quiz, continent = this) }

    Continent.NorthAmerica -> setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    ).map { quiz -> QuizSection(quiz, continent = this) }

    Continent.Oceania -> setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    ).map { quiz -> QuizSection(quiz, continent = this) }

    Continent.SouthAmerica -> setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    ).map { quiz -> QuizSection(quiz, continent = this) }

    Continent.Europe -> setOf(
        QuizType.CapitalCities,
        QuizType.DomainNames,
        QuizType.DrivingSide,
    ).map { quiz -> QuizSection(quiz, continent = this) }
}
