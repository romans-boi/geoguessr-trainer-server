package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import kotlinx.serialization.Serializable

@Serializable
data class SriLanka(
    override val name: String = "Sri Lanka",
    override val capitalCities: List<String> = listOf("Colombo"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.SriLankanRupee,
    override val domain: Domain = Domain.SriLanka,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.SriLanka),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.LowCam
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.AsianCountry()
