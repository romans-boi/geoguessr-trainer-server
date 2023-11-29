
package models.countries

import models.Currency

data object Canada: Country {
    override val name = "Canada"
    override val capitalCities = listOf("Ottawa")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}