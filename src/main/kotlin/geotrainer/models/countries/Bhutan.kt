package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Bhutan(
    override val name: String = "Bhutan",
    override val capitalCities: List<String> = listOf("Thimphu"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Ngultrum,
    override val domain: Domain = Domain.Bhutan,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AsianCountry()
