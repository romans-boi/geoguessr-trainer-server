
package models.countries

import models.Currency

data object Germany: Country {
    override val name = "Germany"
    override val capitalCities = listOf("Berlin")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = true)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Euro

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}