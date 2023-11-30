package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Russia(
    override val name: String = "Russia",
    override val capitalCities: List<String> = listOf("Moscow"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = false),
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Ruble,
    override val domain: Domain = Domain.Russia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
) : Country