
package models.countries

import models.Currency
import models.Domain

data object Bulgaria: Country {
    override val name = "Bulgaria"
    override val capitalCities = listOf("Sofia")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Lev
    override val domain = Domain.Bulgaria

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}