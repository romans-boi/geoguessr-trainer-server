
package models.countries

import models.Currency

data object Slovakia: Country {
    override val name = "Slovakia"
    override val capitalCities = listOf("Bratislava")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}