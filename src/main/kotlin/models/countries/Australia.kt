
package models.countries

import models.Currency
import models.Domain

data object Australia: Country {
    override val name = "Australia"
    override val capitalCities = listOf("Canberra")
    override val continent = Continent.Oceania
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Dollar
    override val domain = Domain.Australia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}