package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Ireland(
    override val name: String = "Ireland",
    override val capitalCities: List<String> = listOf("Dublin"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = true),
    override val drivingDirection: DrivingDirection = DrivingDirection.Left,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Ireland,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country