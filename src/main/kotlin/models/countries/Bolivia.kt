
package models.countries

import models.Currency

data object Bolivia: Country {
    override val name = "Bolivia"
    override val capitalCities = listOf("La Paz (administrative)", "Sucre (judicial)")
    override val continent = Continent.SouthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Boliviano

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}