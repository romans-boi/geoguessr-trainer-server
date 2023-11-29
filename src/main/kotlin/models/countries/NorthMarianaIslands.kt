
package models.countries

import models.Currency
import models.Domain

data object NorthMarianaIslands: Country {
    override val name = null
    override val capitalCities = listOf("TODO")
    override val continent = Continent.Oceania
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dollar
    override val domain = Domain.NorthMarianaIslands

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}