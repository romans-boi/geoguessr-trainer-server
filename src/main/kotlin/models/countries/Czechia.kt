
package models.countries

import models.Currency

data object Czechia: Country {
    override val name = "Czechia"
    override val capitalCities = listOf("Prague")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Koruna

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}