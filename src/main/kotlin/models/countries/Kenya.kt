
package models.countries

import models.Currency
import models.Domain

data object Kenya: Country {
    override val name = "Kenya"
    override val capitalCities = listOf("Nairobi")
    override val continent = Continent.Africa
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.KenyanShilling
    override val domain = Domain.Kenya

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}