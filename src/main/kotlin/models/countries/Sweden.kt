
package models.countries

import models.Currency

data object Sweden: Country {
    override val name = "Sweden"
    override val capitalCities = listOf("Stockholm")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Krona

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}