package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Nepal(
    override val name: String = "Nepal",
    override val capitalCities: List<String> = listOf("Kathmandu"),
    override val continent: Continent = Continent.Asia,
    override val drivingDirection: DrivingDirection = DrivingDirection.Left,
    override val currency: Currency = Currency.NepaleseRupee,
    override val domain: Domain = Domain.Nepal,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country