package models.countries

import models.Currency
import models.Domain

data object Vietnam: Country {
    override val name = "Vietnam"
    override val capitalCities = listOf("Hanoi")
    override val continent = Continent.Asia
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Dong
    override val domain = Domain.Vietnam

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}