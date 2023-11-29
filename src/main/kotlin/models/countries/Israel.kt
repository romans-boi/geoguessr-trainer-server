
package models.countries

import models.Currency
import models.Domain

data object Israel: Country {
    override val name = "Israel"
    override val capitalCities = listOf("Jerusalem")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.NewShekel
    override val domain = Domain.Israel

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}