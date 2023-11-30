package geotrainer.models

import geotrainer.models.quiz.QuizSection
import geotrainer.models.quiz.Quiz

enum class Continent {
    Africa,
    Asia,
    NorthAmerica,
    Oceania,
    SouthAmerica,
    Europe
    ;

    fun getContinentalQuizzes(): List<QuizSection> = when(this) {
        Africa -> {
            setOf(
                Quiz.CapitalCities,
                Quiz.DomainNames,
                Quiz.DrivingSide,
            ).map { quiz -> QuizSection(quiz, continent = this) }
        }

        Asia -> {
            setOf(
                Quiz.CapitalCities,
                Quiz.DomainNames,
                Quiz.DrivingSide,

                Quiz.JapanesePrefecturesKanji
            ).map { quiz -> QuizSection(quiz, continent = this) }

        }

        NorthAmerica -> {
            setOf(
                Quiz.CapitalCities,
                Quiz.DomainNames,
                Quiz.DrivingSide,
            ).map { quiz -> QuizSection(quiz, continent = this) }
        }

        Oceania -> {
            setOf(
                Quiz.CapitalCities,
                Quiz.DomainNames,
                Quiz.DrivingSide,
            ).map { quiz -> QuizSection(quiz, continent = this) }
        }

        SouthAmerica -> {
            setOf(
                Quiz.CapitalCities,
                Quiz.DomainNames,
                Quiz.DrivingSide,
            ).map { quiz -> QuizSection(quiz, continent = this) }
        }

        Europe -> {
            setOf(
                Quiz.CapitalCities,
                Quiz.DomainNames,
                Quiz.DrivingSide,
            ).map { quiz -> QuizSection(quiz, continent = this) }
        }
    }
}