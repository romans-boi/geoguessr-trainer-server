package models.countries

import models.Currency

data object PuertoRico: Country {
    override val name = "Puerto Rico"
    override val capitalCities = listOf("San Juan")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}