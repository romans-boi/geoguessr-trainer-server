package models.countries

import models.Currency
import models.Domain

data object Nepal: Country {
    override val name = "Nepal"
    override val capitalCities = listOf("Kathmandu")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.NepaleseRupee
    override val domain = Domain.Nepal

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}