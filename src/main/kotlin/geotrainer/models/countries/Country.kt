package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide


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
}

