
package models.countries

import models.Currency

data object Croatia: Country {
    override val name = "Croatia"
    override val capitalCities = listOf("Zagreb")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Kuna

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}