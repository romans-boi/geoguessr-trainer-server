package geotrainer.models.quiz

enum class QuizType(val title: String, val description: String) {
    Everything(
        title = "Everything Combined",
        description = "TODO"
    ),

    CapitalCities(
        title = "Capital Cities",
        description = "TODO"
    ),

    DomainNames(
        title = "Domain Names",
        description = "TODO"
    ),

    DrivingSide(
        title = "Driving Side of the Road",
        description = "TODO"
    ),

    CountryInContinent(
        title = "What Continent is This Country In?",
        description = "TODO"
    ),

    JapanesePrefecturesKanji(
        title = "Prefectures in Kanji",
        description = "TODO"
    ),

    EuropeanUnionCountries(
        title = "Countries in the European Union",
        description = "TODO"
    ),
    ;

    companion object {
        fun valueOfOrNull(value: String) = entries.find { it.name == value }
    }
}
