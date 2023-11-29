
package models.countries

import models.Currency
import models.Domain

data object Taiwan: Country {
    override val name = "Taiwan"
    override val capitalCities = listOf("Taipei")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.NewTaiwanDollar
    override val domain = Domain.Taiwan

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}