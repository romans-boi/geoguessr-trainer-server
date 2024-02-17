package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class UnitedKingdom(
    override val name: String = "United Kingdom",
    override val capitalCities: List<String> = listOf("London"),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.PoundSterling,
    override val domain: Domain = Domain.UnitedKingdom,
    override val majorCities: List<City> = listOf(
        City("Birmingham"),
        City("Manchester"),
        City("Glasgow"),
        City("Liverpool"),
        City("Edinburgh"),
        City("Bristol"),
        City("Newcastle upon Tyne"),
        City("Sheffield"),
        City("Leeds"),
        City("Cardiff"),
        City("Belfast"),
        City("Nottingham"),
        City("Southampton"),
        City("Leicester"),
        City("Hull"),
        City("Aberdeen"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.UnitedKingdom),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.EuropeanCountry()
