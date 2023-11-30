package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Guatemala(
    override val name: String = "Guatemala",
    override val capitalCities: List<String> = listOf("Guatemala City"),
    override val continent: Continent = Continent.NorthAmerica,
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Quetzal,
    override val domain: Domain = Domain.Guatemala,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country