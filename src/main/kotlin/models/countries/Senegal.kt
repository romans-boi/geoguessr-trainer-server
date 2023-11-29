
package models.countries

import models.Currency

data object Senegal: Country {
    override val name = "Senegal"
    override val capitalCities = listOf("Dakar")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.CfaFranc

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}