
package models.countries

import models.Currency

data object Thailand: Country {
    override val name = "Thailand"
    override val capitalCities = listOf("Bangkok")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Baht

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}