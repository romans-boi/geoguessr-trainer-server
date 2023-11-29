
package models.countries

import models.Currency
import models.Domain

data object Montenegro: Country {
    override val name = "Montenegro"
    override val capitalCities = listOf("Podgorica")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.Montenegro

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}