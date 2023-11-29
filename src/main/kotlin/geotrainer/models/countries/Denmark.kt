package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Denmark(
    override val name: String = "Denmark",
    override val capitalCities: List<String> = listOf("Copenhagen"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = true),
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Krone,
    override val domain: Domain = Domain.Denmark,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country