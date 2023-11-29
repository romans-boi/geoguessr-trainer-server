
package models.countries

import models.Currency
import models.Domain

data object Sweden: Country {
    override val name = "Sweden"
    override val capitalCities = listOf("Stockholm")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Krona
    override val domain = Domain.Sweden

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}