
package models.countries

import models.Currency
import models.Domain

data object Guatemala: Country {
    override val name = "Guatemala"
    override val capitalCities = listOf("Guatemala City")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Quetzal
    override val domain = Domain.Guatemala

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}