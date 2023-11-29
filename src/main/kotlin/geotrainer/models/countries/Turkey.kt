package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Turkey(
    override val name: String = "Turkey",
    override val capitalCities: List<String> = listOf("Ankara"),
    override val continent: Continent = Continent.Asia,
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Lira,
    override val domain: Domain = Domain.Turkey,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country