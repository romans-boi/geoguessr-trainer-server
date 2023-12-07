package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class HongKong(
    override val name: String = "Hong Kong",
    override val capitalCities: List<String>? = null,
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.HongKongDollar,
    override val domain: Domain = Domain.HongKong,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AsianCountry()
