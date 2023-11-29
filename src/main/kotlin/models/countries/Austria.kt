
package models.countries

import models.Currency
import models.Domain

data object Austria: Country {
    override val name = "Austria"
    override val capitalCities = listOf("Vienna")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.Austria

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}