package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class UnitedStates(
    override val name: String = "United States",
    override val capitalCities: List<String> = listOf("Washington D.C."),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.UnitedStates,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen1,
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    )
) : Country.NorthAmericanCountry()
