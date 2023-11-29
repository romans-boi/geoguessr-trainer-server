
package models.countries

import models.Currency
import models.Domain

data object Croatia: Country {
    override val name = "Croatia"
    override val capitalCities = listOf("Zagreb")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Kuna
    override val domain = Domain.Croatia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}