
package models.countries

import models.Currency
import models.Domain

data object Lithuania: Country {
    override val name = "Lithuania"
    override val capitalCities = listOf("Vilnius")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.Lithuania

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}