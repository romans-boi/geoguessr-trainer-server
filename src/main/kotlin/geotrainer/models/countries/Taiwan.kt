package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Taiwan(
    override val name: String = "Taiwan",
    override val capitalCities: List<City> = listOf(City("Taipei")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.NewTaiwanDollar,
    override val domain: Domain = Domain.Taiwan,
    override val majorCities: List<City> = listOf(
        City("New Taipei City"),
        City("Kaohsiung"),
        City("Taichung"),
        City("Tainan"),
        City("Banqiao"),
        City("Hsinchu"),
        City("Taoyuan"),
        City("Keelung"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Taiwan),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.RedSideYellowMiddle
    ),
) : Country.AsianCountry()
