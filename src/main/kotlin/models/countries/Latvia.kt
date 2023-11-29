
package models.countries

import models.Currency
import models.Domain

data object Latvia: Country {
    override val name = "Latvia"
    override val capitalCities = listOf("Riga")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro
    override val domain = Domain.Latvia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}