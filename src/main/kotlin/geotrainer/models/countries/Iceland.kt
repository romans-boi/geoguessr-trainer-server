package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Iceland(
    override val name: String = "Iceland",
    override val capitalCities: List<String> = listOf("Reykjavik"),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Krona,
    override val domain: Domain = Domain.Iceland,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    )
) : Country.EuropeanCountry()
