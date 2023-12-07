package geotrainer.models.countries

import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Kenya(
    override val name: String = "Kenya",
    override val capitalCities: List<String> = listOf("Nairobi"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.KenyanShilling,
    override val domain: Domain = Domain.Kenya,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country.AfricanCountry()
