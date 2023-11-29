
package models.countries

import models.Currency

data object NorthMacedonia: Country {
    override val name = "North Macedonia"
    override val capitalCities = listOf("Skopje")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Denar

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}