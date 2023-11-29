
package models.countries

import models.Currency

data object Lesotho: Country {
    override val name = "Lesotho"
    override val capitalCities = listOf("Maseru")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Loti

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}