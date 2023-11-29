
package models.countries

import models.Currency

data object Hungary: Country {
    override val name = "Hungary"
    override val capitalCities = listOf("Budapest")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Forint

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}