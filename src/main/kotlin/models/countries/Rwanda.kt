package models.countries

import models.Currency

data object Rwanda: Country {
    override val name = "Rwanda"
    override val capitalCities = listOf("Kigali")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.RwandanFranc

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}