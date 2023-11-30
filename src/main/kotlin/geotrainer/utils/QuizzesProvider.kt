package geotrainer.utils

import geotrainer.models.Continent
import geotrainer.models.quiz.QuizSection
import geotrainer.models.quiz.Quiz

fun Quiz.Companion.getSectionedQuizzes(): List<QuizSection> = getGenericSectionedQuizzes() + Continent.entries.flatMap {
    it.getContinentSectionedQuizzes()
}

private fun Quiz.Companion.getGenericSectionedQuizzes(): List<QuizSection> = setOf(
    Quiz.Everything,
    Quiz.CountryInContinent,
    Quiz.CapitalCities,
    Quiz.DomainNames,
    Quiz.DrivingSide
).map { quiz -> QuizSection(quiz, continent = null) }

private fun Continent.getContinentSectionedQuizzes(): List<QuizSection> = when(this) {
    Continent.Africa -> {
        setOf(
            Quiz.CapitalCities,
            Quiz.DomainNames,
            Quiz.DrivingSide,
        ).map { quiz -> QuizSection(quiz, continent = this) }
    }

    Continent.Asia -> {
        setOf(
            Quiz.CapitalCities,
            Quiz.DomainNames,
            Quiz.DrivingSide,

            Quiz.JapanesePrefecturesKanji
        ).map { quiz -> QuizSection(quiz, continent = this) }

    }

    Continent.NorthAmerica -> {
        setOf(
            Quiz.CapitalCities,
            Quiz.DomainNames,
            Quiz.DrivingSide,
        ).map { quiz -> QuizSection(quiz, continent = this) }
    }

    Continent.Oceania -> {
        setOf(
            Quiz.CapitalCities,
            Quiz.DomainNames,
            Quiz.DrivingSide,
        ).map { quiz -> QuizSection(quiz, continent = this) }
    }

    Continent.SouthAmerica -> {
        setOf(
            Quiz.CapitalCities,
            Quiz.DomainNames,
            Quiz.DrivingSide,
        ).map { quiz -> QuizSection(quiz, continent = this) }
    }

    Continent.Europe -> {
        setOf(
            Quiz.CapitalCities,
            Quiz.DomainNames,
            Quiz.DrivingSide,
        ).map { quiz -> QuizSection(quiz, continent = this) }
    }
}