
package models.countries

import models.Currency
import models.Domain

data object Ghana: Country {
    override val name = "Ghana"
    override val capitalCities = listOf("Accra")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Cedi
    override val domain = Domain.Ghana

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}