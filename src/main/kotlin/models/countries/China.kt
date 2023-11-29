package models.countries

import models.Currency

data object China: Country {
    override val name = "China"
    override val capitalCities = listOf("Beijing")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Renminbi

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}