
package models.countries

import models.Currency
import models.Domain

data object Jordan: Country {
    override val name = "Jordan"
    override val capitalCities = listOf("Amman")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.JordanianDinar
    override val domain = Domain.Jordan

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}