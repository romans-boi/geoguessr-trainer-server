package geotrainer.models.countries

import geotrainer.models.*


sealed interface Country {
    val name: String?
    val capitalCities: List<String>?
    val continent: Continent
    val drivingSide: DrivingSide
    val currency: Currency
    val domain: Domain

    val majorCities: List<String>

    // TODO change this to URL
    val carPlates: List<String>
    // TODO change this to URL
    val bollards: List<String>?

    sealed class AfricanCountry: Country {
        final override val continent: Continent = Continent.Africa
    }

    sealed class AsianCountry: Country {
        final override val continent: Continent = Continent.Asia
    }

    sealed class NorthAmericanCountry: Country {
        final override val continent: Continent = Continent.NorthAmerica
    }

    sealed class SouthAmericanCountry: Country {
        final override val continent: Continent = Continent.SouthAmerica
    }

    sealed class OceanianCountry: Country {
        final override val continent: Continent = Continent.Oceania
    }

    sealed class EuropeanCountry: Country {
        abstract val isPartOfEuropeanUnion: Boolean
        final override val continent: Continent = Continent.Europe
    }
}

