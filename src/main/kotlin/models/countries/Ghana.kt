
package models.countries

import models.Currency

data object Ghana: Country {
    override val name = "Ghana"
    override val capitalCities = listOf("Accra")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Cedi

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}