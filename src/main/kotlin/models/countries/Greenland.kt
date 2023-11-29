
package models.countries

import models.Currency
import models.Domain

data object Greenland: Country {
    override val name = "Greenland (Denmark)"
    override val capitalCities = listOf("Nuuk")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Krone
    override val domain = Domain.Greenland

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}