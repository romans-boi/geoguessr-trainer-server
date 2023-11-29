
package models.countries

import models.Currency
import models.Domain

data object Switzerland: Country {
    override val name = "Switzerland"
    override val capitalCities = listOf("Bern")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Franc
    override val domain = Domain.Switzerland

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}