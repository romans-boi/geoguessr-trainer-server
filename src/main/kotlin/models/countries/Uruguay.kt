
package models.countries

import models.Currency
import models.Domain

data object Uruguay: Country {
    override val name = "Uruguay"
    override val capitalCities = listOf("Montevideo")
    override val continent = Continent.SouthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Peso
    override val domain = Domain.Uruguay

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}