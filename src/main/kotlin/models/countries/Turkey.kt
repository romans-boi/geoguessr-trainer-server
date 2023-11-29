
package models.countries

import models.Currency

data object Turkey: Country {
    override val name = "Turkey"
    override val capitalCities = listOf("Ankara")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Lira

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}