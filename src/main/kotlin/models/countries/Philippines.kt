
package models.countries

import models.Currency

data object Philippines: Country {
    override val name = "Philippines"
    override val capitalCities = listOf("Manila")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.PhilippinePeso

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}