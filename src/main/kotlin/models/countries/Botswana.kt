
package models.countries

import models.Currency

data object Botswana: Country {
    override val name = "Botswana"
    override val capitalCities = listOf("Gaborone")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Pula

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}