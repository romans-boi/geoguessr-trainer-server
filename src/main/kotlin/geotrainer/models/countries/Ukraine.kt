package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Ukraine(
    override val name: String = "Ukraine",
    override val capitalCities: List<String> = listOf("Kiev"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = false),
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Hryvnia,
    override val domain: Domain = Domain.Ukraine,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country