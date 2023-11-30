package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Ghana(
    override val name: String = "Ghana",
    override val capitalCities: List<String> = listOf("Accra"),
    override val continent: Continent = Continent.Africa,
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Cedi,
    override val domain: Domain = Domain.Ghana,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country