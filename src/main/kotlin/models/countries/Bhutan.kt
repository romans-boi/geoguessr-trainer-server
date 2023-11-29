
package models.countries

import models.Currency

data object Bhutan: Country {
    override val name = "Bhutan"
    override val capitalCities = listOf("Thimphu")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Ngultrum

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}