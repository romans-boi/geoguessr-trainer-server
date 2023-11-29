
package models.countries

import models.Currency
import models.Domain

data object Thailand: Country {
    override val name = "Thailand"
    override val capitalCities = listOf("Bangkok")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Baht
    override val domain = Domain.Thailand

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}