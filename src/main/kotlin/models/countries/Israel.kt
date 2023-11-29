
package models.countries

import models.Currency

data object Israel: Country {
    override val name = "Israel"
    override val capitalCities = listOf("Jerusalem")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.NewShekel

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}