package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Ireland(
    override val name: String = "Ireland",
    override val capitalCities: List<String> = listOf("Dublin"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Ireland,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.EuropeanCountry()