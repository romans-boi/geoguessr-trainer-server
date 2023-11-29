package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Czechia(
    override val name: String = "Czechia",
    override val capitalCities: List<String> = listOf("Prague"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = true),
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Koruna,
    override val domain: Domain = Domain.Czechia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country