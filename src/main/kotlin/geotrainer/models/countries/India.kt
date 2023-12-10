package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class India(
    override val name: String = "India",
    override val capitalCities: List<String> = listOf("New Delhi"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.SriLankanRupee,
    override val domain: Domain = Domain.India,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker,
        CameraGeneration.LowCam,
    )
) : Country.AsianCountry()
