package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Bermuda(
    override val name: String = "Bermuda",
    override val capitalCities: List<String> = listOf("Hamilton"),
    override val continent: Continent = Continent.NorthAmerica,
    override val drivingDirection: DrivingDirection = DrivingDirection.Left,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Bermuda,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country