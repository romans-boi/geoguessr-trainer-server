
package models.countries

import models.Currency
import models.Domain

data object Serbia: Country {
    override val name = "Serbia"
    override val capitalCities = listOf("Belgrade")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.SerbianDinar
    override val domain = Domain.Serbia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}