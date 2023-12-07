package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class SouthAfrica(
    override val name: String = "South Africa",
    override val capitalCities: List<String> = listOf(
        "Pretoria (administrative)",
        "Cape Town (legislative)",
        "Bloemfontein (judiciary)"
    ),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Rand,
    override val domain: Domain = Domain.SouthAfrica,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AfricanCountry()
