
package models.countries

import models.Currency
import models.Domain

data object SouthKorea: Country {
    override val name = "South Korea"
    override val capitalCities = listOf("Seoul")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Won
    override val domain = Domain.SouthKorea

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}