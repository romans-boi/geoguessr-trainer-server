package models.countries

import models.Currency

data object FaroeIslands: Country {
    override val name = "Faroe Islands"
    override val capitalCities = listOf("Tórshavn")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Krone

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}