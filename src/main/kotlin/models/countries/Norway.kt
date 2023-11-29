
package models.countries

import models.Currency
import models.Domain

data object Norway: Country {
    override val name = "Norway"
    override val capitalCities = listOf("Oslo")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Krone
    override val domain = Domain.Norway

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}