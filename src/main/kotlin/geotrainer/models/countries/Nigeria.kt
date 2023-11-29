package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Nigeria(
    override val name: String = "Nigeria",
    override val capitalCities: List<String> = listOf("Abuja"),
    override val continent: Continent = Continent.Africa,
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Naira,
    override val domain: Domain = Domain.Nigeria,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country