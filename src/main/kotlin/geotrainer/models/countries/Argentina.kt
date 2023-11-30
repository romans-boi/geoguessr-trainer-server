package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Argentina(
    override val name: String = "Argentina",
    override val capitalCities: List<String> = listOf("Buenos Aires"),
    override val continent: Continent = Continent.SouthAmerica,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Peso,
    override val domain: Domain = Domain.Argentina,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country