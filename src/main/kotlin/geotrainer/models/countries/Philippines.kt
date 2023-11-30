package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Philippines(
    override val name: String = "Philippines",
    override val capitalCities: List<String> = listOf("Manila"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.PhilippinePeso,
    override val domain: Domain = Domain.Philippines,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AsianCountry()