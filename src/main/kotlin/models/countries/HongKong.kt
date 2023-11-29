package models.countries

import models.Currency

data object HongKong: Country {
    override val name = "Hong Kong"
    override val capitalCities = null
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.HongKongDollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}