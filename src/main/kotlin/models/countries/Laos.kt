package models.countries

import models.Currency

data object Laos: Country {
    override val name = "Laos"
    override val capitalCities = listOf("Vientiane")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Kip

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}