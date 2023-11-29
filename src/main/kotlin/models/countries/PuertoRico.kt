package models.countries

import models.Currency
import models.Domain

data object PuertoRico: Country {
    override val name = "Puerto Rico"
    override val capitalCities = listOf("San Juan")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dollar
    override val domain = Domain.PuertoRico

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}