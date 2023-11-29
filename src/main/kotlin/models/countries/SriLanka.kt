
package models.countries

import models.Currency

data object SriLanka: Country {
    override val name = "Sri Lanka"
    override val capitalCities = listOf("Colombo")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.SriLankanRupee


    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}