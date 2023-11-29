
package models.countries

import models.Currency
import models.Domain

data object Lesotho: Country {
    override val name = "Lesotho"
    override val capitalCities = listOf("Maseru")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Loti
    override val domain = Domain.Lesotho

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}