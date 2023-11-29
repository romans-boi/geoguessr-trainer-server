
package models.countries

import models.Currency
import models.Domain

data object Cambodia: Country {
    override val name = "Cambodia"
    override val capitalCities = listOf("Phnom Penh")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Riel
    override val domain = Domain.Cambodia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}