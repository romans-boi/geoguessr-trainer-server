
package models.countries

import models.Currency

data object Indonesia: Country {
    override val name = "Indonesia"
    override val capitalCities = listOf("Jakarta")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Rupiah

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}