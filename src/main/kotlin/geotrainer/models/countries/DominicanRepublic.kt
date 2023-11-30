package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class DominicanRepublic(
    override val name: String = "Dominican Republic",
    override val capitalCities: List<String> = listOf("Santo Domingo"),
    override val continent: Continent = Continent.NorthAmerica,
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.DominicanPeso,
    override val domain: Domain = Domain.DominicanRepublic,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country