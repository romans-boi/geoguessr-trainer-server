package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Eswatini(
    override val name: String = "Eswatini",
    override val capitalCities: List<String> = listOf("Mbabane"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Lilangeli,
    override val domain: Domain = Domain.Eswatini,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AfricanCountry()