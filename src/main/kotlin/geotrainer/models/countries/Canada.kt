package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Canada(
    override val name: String = "Canada",
    override val capitalCities: List<String> = listOf("Ottawa"),
    override val continent: Continent = Continent.NorthAmerica,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Canada,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country