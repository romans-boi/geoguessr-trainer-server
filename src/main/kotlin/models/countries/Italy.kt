
package models.countries

import models.Currency
import models.Domain

data object Italy: Country {
    override val name = "Italy"
    override val capitalCities = listOf("Rome")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.Italy

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}