package models.countries

import models.Currency
import models.Domain

data object Rwanda: Country {
    override val name = "Rwanda"
    override val capitalCities = listOf("Kigali")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.RwandanFranc
    override val domain = Domain.Rwanda

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}