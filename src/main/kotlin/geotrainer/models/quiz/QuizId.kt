package geotrainer.models.quiz

enum class QuizId {
    Everything,

    CapitalCities,

    DomainNames,

    DrivingSide,

    CountryInContinent,

    JapanesePrefecturesKanji,

    EuropeanUnionCountries,
    ;

    companion object {
        fun valueOfOrNull(value: String) = entries.find { it.name == value }
    }
}
