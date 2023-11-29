
package models.countries

import models.Currency
import models.Domain

data object Poland: Country {
    override val name = "Poland"
    override val capitalCities = listOf("Warsaw")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Zloty
    override val domain = Domain.Poland

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}