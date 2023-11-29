
package models.countries

import models.Currency

data object Russia: Country {
    override val name = "Russia"
    override val capitalCities = listOf("Moscow")

    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Ruble

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}