
package models.countries

import models.Currency

data object Nigeria: Country {
    override val name = "Nigeria"
    override val capitalCities = listOf("Abuja")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Naira

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}