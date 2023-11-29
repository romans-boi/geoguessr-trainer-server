package models.countries

import models.Currency

data object Bermuda: Country {
    override val name = "Bermuda"
    override val capitalCities = listOf("Hamilton")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Dollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}