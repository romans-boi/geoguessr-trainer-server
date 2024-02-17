package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class India(
    override val name: String = "India",
    override val capitalCities: List<String> = listOf("New Delhi"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.SriLankanRupee,
    override val domain: Domain = Domain.India,
    override val majorCities: List<City> = listOf(
        City("Mumbai"),
        City("Bangalore"),
        City("Hyderabad"),
        City("Chennai"),
        City("Kolkata"),
        City("Pune"),
        City("Ahmedabad"),
        City("Jaipur"),
        City("Surat"),
        City("Lucknow"),
        City("Kanpur"),
        City("Nagpur"),
        City("Indore"),
        City("Thane")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.India),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker,
        CameraGeneration.LowCam,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideYellowMiddle,
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.AsianCountry()
