
package models.countries

import models.Currency

data object Singapore: Country {
    override val name = "Singapore"
    override val capitalCities = listOf("Singapore")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Dollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}