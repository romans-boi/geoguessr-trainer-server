
package models.countries

import models.Currency
import models.Domain

data object Ireland: Country {
    override val name = "Ireland"
    override val capitalCities = listOf("Dublin")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Euro
    override val domain = Domain.Ireland

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}