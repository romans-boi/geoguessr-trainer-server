
package models.countries

import models.Currency
import models.Domain

data object Finland: Country {
    override val name = "Finland"
    override val capitalCities = listOf("Helsinki")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.Finland

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}