package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Rwanda(
    override val name: String = "Rwanda",
    override val capitalCities: List<String> = listOf("Kigali"),
    override val continent: Continent = Continent.Africa,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.RwandanFranc,
    override val domain: Domain = Domain.Rwanda,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country