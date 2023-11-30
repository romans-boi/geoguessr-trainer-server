package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Thailand(
    override val name: String = "Thailand",
    override val capitalCities: List<String> = listOf("Bangkok"),
    override val continent: Continent = Continent.Asia,
    val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Baht,
    override val domain: Domain = Domain.Thailand,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country