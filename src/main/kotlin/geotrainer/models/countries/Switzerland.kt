package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Switzerland(
    override val name: String = "Switzerland",
    override val capitalCities: List<String> = listOf("Bern"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = false),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Franc,
    override val domain: Domain = Domain.Switzerland,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country