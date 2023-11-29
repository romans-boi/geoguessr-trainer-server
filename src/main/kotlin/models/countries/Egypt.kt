package models.countries

import models.Currency
import models.Domain

data object Egypt: Country {
    override val name = "Egypt"
    override val capitalCities = listOf("Cairo")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.EgyptianPound
    override val domain = Domain.Egypt

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}
