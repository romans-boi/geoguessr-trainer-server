
package models.countries

import models.Currency
import models.Domain

data object Turkey: Country {
    override val name = "Turkey"
    override val capitalCities = listOf("Ankara")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Lira
    override val domain = Domain.Turkey

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}