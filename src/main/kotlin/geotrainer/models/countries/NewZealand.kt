package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class NewZealand(
    override val name: String = "New Zealand",
    override val capitalCities: List<City> = listOf(City("Wellington")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.NewZealand,
    override val majorCities: List<City> = listOf(
        City("Auckland"),
        City("Christchurch"),
        City("Hamilton"),
        City("Tauranga"),
        City("Dunedin"),
        City("Queenstown"),
        City("Palmerston North"),
        City("Napier-Hastings"),
        City("Hamilton"),
        City("New Plymouth")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.NewZealand),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen1,
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.YellowSideWhiteMiddle,
        RoadLines.YellowSideYellowMiddle,
        RoadLines.WhiteSideYellowWhiteMiddle
    ),
) : Country.OceanianCountry()
