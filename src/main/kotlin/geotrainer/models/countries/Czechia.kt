package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Czechia(
    override val name: String = "Czechia",
    override val capitalCities: List<City> = listOf(City("Prague")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Koruna,
    override val domain: Domain = Domain.Czechia,
    override val majorCities: List<City> = listOf(
        City("Brno"),
        City("Ostrava"),
        City("Pilsen"),
        City("Liberec"),
        City("Olomouc"),
        City("České Budějovice"),
        City("Hradec Králové"),
        City("Pardubice"),
        City("Ústí nad Labem"),
        City("Havířov"),
        City("Zlín"),
        City("Kladno"),
        City("Most"),
        City("Opava")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Czechia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
