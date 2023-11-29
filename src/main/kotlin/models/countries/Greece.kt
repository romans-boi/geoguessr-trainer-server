
package models.countries

import models.Currency
import models.Domain

data object Greece: Country {
    override val name = "Greece"
    override val capitalCities = listOf("Athens")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.Greece

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}