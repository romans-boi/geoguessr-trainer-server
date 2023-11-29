
package models.countries

import models.Currency

data object Mongolia: Country {
    override val name = "Mongolia"
    override val capitalCities = listOf("Ulaanbaatar")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Togrog

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}