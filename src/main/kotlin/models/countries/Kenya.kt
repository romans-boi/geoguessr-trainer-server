
package models.countries

import models.Currency

data object Kenya: Country {
    override val name = "Kenya"
    override val capitalCities = listOf("Nairobi")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.KenyanShilling

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}