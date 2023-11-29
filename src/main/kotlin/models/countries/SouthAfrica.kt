
package models.countries

import models.Currency
import models.Domain

data object SouthAfrica: Country {
    override val name = "South Africa"
    override val capitalCities = listOf("Pretoria (administrative)", "Cape Town (legislative)", "Bloemfontein (judiciary)")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Rand
    override val domain = Domain.SouthAfrica

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}