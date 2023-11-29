
package models.countries

import models.Currency
import models.Domain

data object France: Country {
    override val name = "France"
    override val capitalCities = listOf("Paris")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.France

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}