package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Bolivia(
    override val name: String = "Bolivia",
    override val capitalCities: List<String> = listOf("La Paz (administrative)", "Sucre (judicial)"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Boliviano,
    override val domain: Domain = Domain.Bolivia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.SouthAmericanCountry()