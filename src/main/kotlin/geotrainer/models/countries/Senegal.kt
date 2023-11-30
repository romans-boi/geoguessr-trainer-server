package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Senegal(
    override val name: String = "Senegal",
    override val capitalCities: List<String> = listOf("Dakar"),
    override val continent: Continent = Continent.Africa,
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.CfaFranc,
    override val domain: Domain = Domain.Senegal,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country