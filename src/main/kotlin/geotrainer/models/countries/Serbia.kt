package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Serbia(
    override val name: String = "Serbia",
    override val capitalCities: List<String> = listOf("Belgrade"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = false),
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.SerbianDinar,
    override val domain: Domain = Domain.Serbia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country