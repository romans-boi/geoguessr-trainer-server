package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class France(
    override val name: String = "France",
    override val capitalCities: List<String> = listOf("Paris"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = true),
    val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.France,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country