package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Jordan(
    override val name: String = "Jordan",
    override val capitalCities: List<String> = listOf("Amman"),
    override val continent: Continent = Continent.Asia,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.JordanianDinar,
    override val domain: Domain = Domain.Jordan,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
) : Country