package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Singapore(
    override val name: String = "Singapore",
    override val capitalCities: List<String> = listOf("Singapore"),
    override val continent: Continent = Continent.Asia,
    override val drivingDirection: DrivingDirection = DrivingDirection.Left,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Singapore,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country