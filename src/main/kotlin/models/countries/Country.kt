package models.countries

import models.Currency


sealed interface Country {
    val name: String?
    val capitalCities: List<String>?
    val continent: Continent

    val currency: Currency

    val drivingDirection: DrivingDirection

    val majorCities: List<String>

    // TODO change this to URL
    val carPlates: List<String>
    // TODO change this to URL
    val bollards: List<String>?
}

enum class DrivingDirection {
    Left,
    Right
}

sealed interface Continent {
    data object Africa: Continent
    data object Asia: Continent
    data object NorthAmerica: Continent
    data object Oceania: Continent
    data object SouthAmerica: Continent

    data class Europe(val isPartOfEuropeanUnion: Boolean): Continent
}