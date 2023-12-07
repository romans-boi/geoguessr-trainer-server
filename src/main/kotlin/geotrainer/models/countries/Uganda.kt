package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Uganda(
    override val name: String = "Uganda",
    override val capitalCities: List<String> = listOf("Kampala"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.UgandanShilling,
    override val domain: Domain = Domain.Uganda,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AfricanCountry()
