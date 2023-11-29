
package models.countries

import models.Currency

data object NewZealand: Country {
    override val name = "New Zealand"
    override val capitalCities = listOf("Wellington")
    override val continent = Continent.Oceania
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Dollar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}