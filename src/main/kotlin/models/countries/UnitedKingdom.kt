package models.countries

import models.Currency
import models.Domain

data object UnitedKingdom: Country {
    override val name = "United Kingdom"
    override val capitalCities = listOf("London")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.PoundSterling
    override val domain = Domain.UnitedKingdom

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}
