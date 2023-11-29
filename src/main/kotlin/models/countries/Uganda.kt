
package models.countries

import models.Currency

data object Uganda: Country {
    override val name = "Uganda"
    override val capitalCities = listOf("Kampala")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.UgandanShilling

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}