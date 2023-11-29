
package models.countries

import models.Currency

data object Portugal: Country {
    override val name = "Portugal"
    override val capitalCities = listOf("Lisbon")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}