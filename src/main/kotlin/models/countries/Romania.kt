
package models.countries

import models.Currency

data object Romania: Country {
    override val name = "Romania"
    override val capitalCities = listOf("Bucharest")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Leu

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}