package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Netherlands(
    override val name: String = "Netherlands",
    override val capitalCities: List<String> = listOf("Amsterdam"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Netherlands,
    override val majorCities: List<City> = listOf(
        City("Rotterdam"),
        City("The Hague"),
        City("Utrecht"),
        City("Eindhoven"),
        City("Tilburg"),
        City("Groningen"),
        City("Almere"),
        City("Breda"),
        City("Nijmegen"),
        City("Enschede"),
        City("Haarlem"),
        City("Arnhem"),
        City("Zaanstad"),
        City("Amersfoort")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Netherlands),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideGreenWhiteMiddle
    ),
) : Country.EuropeanCountry()
