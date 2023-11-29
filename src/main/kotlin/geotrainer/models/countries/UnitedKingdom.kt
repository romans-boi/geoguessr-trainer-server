package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class UnitedKingdom(
    override val name: String = "United Kingdom",
    override val capitalCities: List<String> = listOf("London"),
    override val continent: Continent = Continent.Europe(isPartOfEuropeanUnion = false),
    override val drivingDirection: DrivingDirection = DrivingDirection.Left,
    override val currency: Currency = Currency.PoundSterling,
    override val domain: Domain = Domain.UnitedKingdom,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country
