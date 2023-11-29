
package models.countries

import models.Currency

data object UnitedArabEmirates: Country {
    override val name = "United Arab Emirates"
    override val capitalCities = listOf("Abu Dhabi")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dirham

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}