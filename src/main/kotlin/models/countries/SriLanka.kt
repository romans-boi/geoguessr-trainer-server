
package models.countries

import models.Currency
import models.Domain

data object SriLanka: Country {
    override val name = "Sri Lanka"
    override val capitalCities = listOf("Colombo")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.SriLankanRupee
    override val domain = Domain.SriLanka

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}