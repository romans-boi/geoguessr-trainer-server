package models.countries

import models.Currency

data object Egypt: Country {
    override val name = "Egypt"
    override val capitalCities = listOf("Cairo")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.EgyptianPound

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}
