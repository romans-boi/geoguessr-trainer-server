package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class SouthKorea(
    override val name: String = "South Korea",
    override val capitalCities: List<City> = listOf(City("Seoul")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Won,
    override val domain: Domain = Domain.SouthKorea,
    override val majorCities: List<City> = listOf(
        City("Busan"),
        City("Incheon"),
        City("Daegu"),
        City("Daejeon"),
        City("Gwangju"),
        City("Suwon"),
        City("Ulsan"),
        City("Seongnam"),
        City("Yongin")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.SouthKorea),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AsianCountry()
