
package models.countries

import models.Currency

data object Andorra: Country {
    override val name = "Andorra"
    override val capitalCities = listOf("Andorra la Vella")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro


    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}