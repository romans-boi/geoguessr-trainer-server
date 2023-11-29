
package models.countries

import models.Currency
import models.Domain

data object NewZealand: Country {
    override val name = "New Zealand"
    override val capitalCities = listOf("Wellington")
    override val continent = Continent.Oceania
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Dollar
    override val domain = Domain.NewZealand

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}