
package models.countries

import models.Currency

data object Eswatini: Country {
    override val name = "Eswatini"
    override val capitalCities = listOf("Mbabane")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Lilangeli

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}