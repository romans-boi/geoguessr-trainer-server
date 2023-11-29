
package models.countries

import models.Currency

data object Denmark: Country {
    override val name = "Denmark"
    override val capitalCities = listOf("Copenhagen")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Krone

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}