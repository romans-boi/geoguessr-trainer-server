package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Germany(
    override val name: String = "Germany",
    override val capitalCities: List<String> = listOf("Berlin"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Germany,
    override val majorCities: List<City> = listOf(
        City("Hamburg"),
        City("Munich"),
        City("Cologne"),
        City("Frankfurt"),
        City("Stuttgart"),
        City("Düsseldorf"),
        City("Dortmund"),
        City("Essen"),
        City("Bremen"),
        City("Leipzig"),
        City("Dresden"),
        City("Hanover"),
        City("Nuremberg"),
        City("Duisburg")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Germany),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideYellowMiddle
    ),
) : Country.EuropeanCountry()
