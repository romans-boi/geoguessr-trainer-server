package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Poland(
    override val name: String = "Poland",
    override val capitalCities: List<String> = listOf("Warsaw"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = true),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Zloty,
    override val domain: Domain = Domain.Poland,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country