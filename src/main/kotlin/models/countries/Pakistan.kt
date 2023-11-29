package models.countries

import models.Currency

data object Pakistan: Country {
    override val name = "Pakistan"
    override val capitalCities = listOf("Islamabad")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.PakistaniRupee

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}