
package models.countries

import models.Currency

data object Argentina: Country {
    override val name = "Argentina"
    override val capitalCities = listOf("Buenos Aires")
    override val continent = Continent.SouthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Peso

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}