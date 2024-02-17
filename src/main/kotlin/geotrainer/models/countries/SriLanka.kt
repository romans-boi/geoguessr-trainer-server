package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class SriLanka(
    override val name: String = "Sri Lanka",
    override val capitalCities: List<City> = listOf(City("Colombo")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.SriLankanRupee,
    override val domain: Domain = Domain.SriLanka,
    override val majorCities: List<City> = listOf(
        City("Dehiwala-Mount Lavinia"),
        City("Moratuwa"),
        City("Jaffna"),
        City("Negombo"),
        City("Kandy"),
        City("Kalmunai"),
        City("Vavuniya"),
        City("Galle"),
        City("Trincomalee")
    ),
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
