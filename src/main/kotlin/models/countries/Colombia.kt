
package models.countries

import models.Currency
import models.Domain

data object Colombia: Country {
    override val name = "Colombia"
    override val capitalCities = listOf("Bogota")
    override val continent = Continent.SouthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Peso
    override val domain = Domain.Colombia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}