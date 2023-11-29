package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Norway(
    override val name: String = "Norway",
    override val capitalCities: List<String> = listOf("Oslo"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = false),
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Krone,
    override val domain: Domain = Domain.Norway,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country