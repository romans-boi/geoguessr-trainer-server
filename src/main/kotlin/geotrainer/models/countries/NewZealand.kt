package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class NewZealand(
    override val name: String = "New Zealand",
    override val capitalCities: List<String> = listOf("Wellington"),
    override val continent: Continent = Continent.Oceania,
    override val drivingDirection: DrivingDirection = DrivingDirection.Left,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.NewZealand,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country