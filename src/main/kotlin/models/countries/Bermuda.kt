package models.countries

import models.Currency
import models.Domain

data object Bermuda: Country {
    override val name = "Bermuda"
    override val capitalCities = listOf("Hamilton")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Dollar
    override val domain = Domain.Bermuda

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}