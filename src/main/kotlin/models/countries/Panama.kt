
package models.countries

import models.Currency
import models.Domain

data object Panama: Country {
    override val name = "Panama"
    override val capitalCities = listOf("Panama City")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Balboa
    override val domain = Domain.Panama

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}