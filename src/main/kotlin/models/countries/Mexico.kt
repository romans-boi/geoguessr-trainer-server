
package models.countries

import models.Currency
import models.Domain

data object Mexico: Country {
    override val name = "Mexico"
    override val capitalCities = listOf("Mexico City")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Peso
    override val domain = Domain.Mexico

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}