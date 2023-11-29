package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Bolivia(
    override val name: String = "Bolivia",
    override val capitalCities: List<String> = listOf("La Paz (administrative)", "Sucre (judicial)"),
    override val continent: Continent = Continent.SouthAmerica,
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Boliviano,
    override val domain: Domain = Domain.Bolivia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
) : Country