package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Canada(
    override val name: String = "Canada",
    override val capitalCities: List<String> = listOf("Ottawa"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Canada,
    override val majorCities: List<City> = listOf(
        City("Toronto"),
        City("Montreal"),
        City("Vancouver"),
        City("Calgary"),
        City("Edmonton"),
        City("Winnipeg"),
        City("Quebec City"),
        City("Hamilton"),
        City("Kitchener"),
        City("London"),
        City("Banff"),
        City("Halifax"),
        City("Medicine Hat"),
        City("Red Deer"),
        City("Sudbury"),
        City("Thunder Bay"),
        City("Quebec City"),
        City("Saskatoon"),
        City("Saint John"),
        City("Trois-Rivières"),
        City("Sherbrooke"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Canada),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen1,
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.NorthAmericanCountry()
