package geotrainer.models.countries

import kotlinx.serialization.Serializable
import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide

@Serializable
data class Albania(
    override val name: String = "Albania",
    override val capitalCities: List<String> = listOf("Tirane"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = false),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Lek,
    override val domain: Domain = Domain.Albania,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
) : Country