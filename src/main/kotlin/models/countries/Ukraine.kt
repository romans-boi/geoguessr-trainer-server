
package models.countries

import models.Currency
import models.Domain

data object Ukraine: Country {
    override val name = "Ukraine"
    override val capitalCities = listOf("Kiev")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Hryvnia
    override val domain = Domain.Ukraine

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}