package models.countries

import models.Currency
import models.Domain

data object Tunisia: Country {
    override val name = "Tunisia"
    override val capitalCities = listOf("Tunis")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.TunisianDinar
    override val domain = Domain.Tunisia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}