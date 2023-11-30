package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Mongolia(
    override val name: String = "Mongolia",
    override val capitalCities: List<String> = listOf("Ulaanbaatar"),
    override val continent: Continent = Continent.Asia,
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Togrog,
    override val domain: Domain = Domain.Mongolia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country