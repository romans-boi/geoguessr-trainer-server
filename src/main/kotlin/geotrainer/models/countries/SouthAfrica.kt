package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class SouthAfrica(
    override val name: String = "South Africa",
    override val capitalCities: List<String> = listOf(
        "Pretoria (administrative)",
        "Cape Town (legislative)",
        "Bloemfontein (judiciary)"
    ),
    override val continent: Continent = Continent.Africa,
    override val drivingDirection: DrivingDirection = DrivingDirection.Left,
    override val currency: Currency = Currency.Rand,
    override val domain: Domain = Domain.SouthAfrica,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country