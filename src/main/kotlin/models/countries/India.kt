package models.countries

import models.Currency
import models.Domain

data object India: Country {
    override val name = "India"
    override val capitalCities = listOf("New Delhi")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Left
    override val currency = Currency.SriLankanRupee
    override val domain = Domain.India

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}