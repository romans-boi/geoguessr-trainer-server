
package models.countries

import models.Currency
import models.Domain

data object Mongolia: Country {
    override val name = "Mongolia"
    override val capitalCities = listOf("Ulaanbaatar")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Togrog
    override val domain = Domain.Mongolia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}