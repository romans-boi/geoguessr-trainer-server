
package models.countries

import models.Currency

data object Norway: Country {
    override val name = "Norway"
    override val capitalCities = listOf("Oslo")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Krone

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}