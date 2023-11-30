package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Belgium(
    override val name: String = "Belgium",
    override val capitalCities: List<String> = listOf("Brussels"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = true),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Belgium,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country