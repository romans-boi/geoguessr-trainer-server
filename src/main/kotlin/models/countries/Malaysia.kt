
package models.countries

import models.Currency
import models.Domain

data object Malaysia: Country {
    override val name = "Malaysia"
    override val capitalCities = listOf("Kuala Lumpur")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.Ringgit
    override val domain = Domain.Malaysia

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}