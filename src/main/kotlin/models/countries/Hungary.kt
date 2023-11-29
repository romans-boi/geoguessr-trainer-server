
package models.countries

import models.Currency
import models.Domain

data object Hungary: Country {
    override val name = "Hungary"
    override val capitalCities = listOf("Budapest")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Forint
    override val domain = Domain.Hungary

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}