
package models.countries

import models.Currency
import models.Domain

data object Luxembourg: Country {
    override val name = "Luxembourg"
    override val capitalCities = listOf("Luxembourg")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.Luxembourg

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}