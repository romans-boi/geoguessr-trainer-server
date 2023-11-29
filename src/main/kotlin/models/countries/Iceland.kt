
package models.countries

import models.Currency
import models.Domain

data object Iceland: Country {
    override val name = "Iceland"
    override val capitalCities = listOf("Reykjavik")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Krona
    override val domain = Domain.Iceland

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}