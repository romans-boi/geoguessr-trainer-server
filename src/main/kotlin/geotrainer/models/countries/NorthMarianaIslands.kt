package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class NorthMarianaIslands(
    override val name: String? = null,
    override val capitalCities: List<String> = listOf("TODO"),
    override val continent: Continent = Continent.Oceania,
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.NorthMarianaIslands,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country