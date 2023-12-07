package geotrainer.models

enum class Continent {
    Africa,
    Asia,
    NorthAmerica,
    Oceania,
    SouthAmerica,
    Europe,
    ;

    companion object {
        fun valueOfOrNull(value: String?) = Continent.entries.find { it.name == value }
    }
}
