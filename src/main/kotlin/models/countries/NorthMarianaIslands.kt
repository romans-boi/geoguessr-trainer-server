
package models.countries

import models.Currency

data object NorthMarianaIslands: Country {
    override val name = null
    override val capitalCities = listOf("TODO")
    override val continent = Continent.Oceania
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}