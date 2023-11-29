
package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingDirection
import kotlinx.serialization.Serializable

@Serializable
data class Colombia(
    override val name: String =  "Colombia",
    override val capitalCities: List<String> = listOf("Bogota"),
    override val continent: Continent = Continent.SouthAmerica,
    override val drivingDirection: DrivingDirection = DrivingDirection.Right,
    override val currency: Currency = Currency.Peso,
    override val domain: Domain = Domain.Colombia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
): Country