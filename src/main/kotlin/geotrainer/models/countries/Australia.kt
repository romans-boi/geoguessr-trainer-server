package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Australia(
    override val name: String = "Australia",
    override val capitalCities: List<String> = listOf("Canberra"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Australia,
    override val majorCities: List<City> = listOf(
        City("Brisbane"),
        City("Sydney"),
        City("Melbourne"),
        City("Adelaide"),
        City("Perth"),
        City("Hobart"),
        City("Darwin"),
        City("Gold Coast"),
        City("Griffith"),
        City("Alice Springs"),
        City("Albany"),
        City("Sunshine Coast"),
        City("Wagga Wagga"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Australia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen1,
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideYellowMiddle,
        RoadLines.YellowSideWhiteMiddle,
    ),
) : Country.OceanianCountry()
