package geotrainer.models.countries

import geotrainer.models.Continent
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Botswana(
    override val name: String = "Botswana",
    override val capitalCities: List<String> = listOf("Gaborone"),
    override val continent: Continent = Continent.Africa,
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Pula,
    override val domain: Domain = Domain.Botswana,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO")
): Country