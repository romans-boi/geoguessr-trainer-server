
package models.countries

import models.Currency
import models.Domain

data object Russia: Country {
    override val name = "Russia"
    override val capitalCities = listOf("Moscow")

    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Ruble
    override val domain = Domain.Russia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}