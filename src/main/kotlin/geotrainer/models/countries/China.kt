package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class China(
    override val name: String = "China",
    override val capitalCities: List<String> = listOf("Beijing"),
    override val continent: Continent = Continent.Asia,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Renminbi,
    override val domain: Domain = Domain.China,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country