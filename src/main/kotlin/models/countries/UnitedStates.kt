
package models.countries

import models.Currency

data object UnitedStates: Country {
    override val name = "United States"
    override val capitalCities = listOf("Washington D.C.")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}