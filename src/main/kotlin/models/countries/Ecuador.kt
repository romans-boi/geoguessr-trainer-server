
package models.countries

import models.Currency

data object Ecuador: Country {
    override val name = "Ecuador"
    override val capitalCities = listOf("Quito")
    override val continent = Continent.SouthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}