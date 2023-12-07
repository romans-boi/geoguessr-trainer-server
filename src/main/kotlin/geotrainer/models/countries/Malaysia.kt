package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Malaysia(
    override val name: String = "Malaysia",
    override val capitalCities: List<String> = listOf("Kuala Lumpur"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Ringgit,
    override val domain: Domain = Domain.Malaysia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AsianCountry()
