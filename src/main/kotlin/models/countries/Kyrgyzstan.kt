
package models.countries

import models.Currency

data object Kyrgyzstan: Country {
    override val name = "Kyrgyzstan"
    override val capitalCities = listOf("Bishkek")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Som

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}