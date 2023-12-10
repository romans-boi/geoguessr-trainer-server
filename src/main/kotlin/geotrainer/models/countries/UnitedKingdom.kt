package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class UnitedKingdom(
    override val name: String = "United Kingdom",
    override val capitalCities: List<String> = listOf("London"),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.PoundSterling,
    override val domain: Domain = Domain.UnitedKingdom,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    )
) : Country.EuropeanCountry()
