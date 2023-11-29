
package models.countries

import models.Currency

data object Japan: Country {
    override val name = "Japan"
    override val capitalCities = listOf("Tokyo")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Yen

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}