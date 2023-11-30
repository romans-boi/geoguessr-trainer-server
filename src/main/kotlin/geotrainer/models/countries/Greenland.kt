package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Greenland(
    override val name: String = "Greenland (Denmark)",
    override val capitalCities: List<String> = listOf("Nuuk"),
    override val continent: Continent = Continent.NorthAmerica,
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Krone,
    override val domain: Domain = Domain.Greenland,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country