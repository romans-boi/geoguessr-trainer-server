package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Vietnam(
    override val name: String = "Vietnam",
    override val capitalCities: List<String> = listOf("Hanoi"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Dong,
    override val domain: Domain = Domain.Vietnam,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AsianCountry()
