
package models.countries

import models.Currency
import models.Domain

data object Brazil: Country {
    override val name = "Brazil"
    override val capitalCities = listOf("Brasilia")
    override val continent = Continent.SouthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Real
    override val domain = Domain.Brazil

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}