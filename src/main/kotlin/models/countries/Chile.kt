
package models.countries

import models.Currency
import models.Domain

data object Chile: Country {
    override val name = "Chile"
    override val capitalCities = listOf("Santiago")
    override val continent = Continent.SouthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Peso
    override val domain = Domain.Chile

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}