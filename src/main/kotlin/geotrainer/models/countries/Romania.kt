package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Romania(
    override val name: String = "Romania",
    override val capitalCities: List<String> = listOf("Bucharest"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Leu,
    override val domain: Domain = Domain.Romania,
    override val majorCities: List<City> = listOf(
        City("Cluj-Napoca"),
        City("Timișoara"),
        City("Iași"),
        City("Constanța"),
        City("Craiova"),
        City("Brașov"),
        City("Galați"),
        City("Ploiești"),
        City("Oradea")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Romania),

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
