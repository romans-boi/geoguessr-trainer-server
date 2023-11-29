package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Croatia(
    override val name: String = "Croatia",
    override val capitalCities: List<String> = listOf("Zagreb"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = true),
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Kuna,
    override val domain: Domain = Domain.Croatia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country