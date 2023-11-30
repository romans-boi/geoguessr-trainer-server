package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Tunisia(
    override val name: String = "Tunisia",
    override val capitalCities: List<String> = listOf("Tunis"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.TunisianDinar,
    override val domain: Domain = Domain.Tunisia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AfricanCountry()