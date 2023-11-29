
package models.countries

import models.Currency
import models.Domain

data object Peru: Country {
    override val name = "Peru"
    override val capitalCities = listOf("Lima")
    override val continent = Continent.SouthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Sol
    override val domain = Domain.Peru

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}