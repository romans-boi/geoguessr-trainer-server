
package models.countries

import models.Currency
import models.Domain

data object Bangladesh: Country {
    override val name = "Bangladesh"
    override val capitalCities = listOf("Dhaka")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Taka
    override val domain = Domain.Bangladesh

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}