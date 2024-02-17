package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Montenegro(
    override val name: String = "Montenegro",
    override val capitalCities: List<City> = listOf(City("Podgorica")),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Montenegro,
    override val majorCities: List<City> = listOf(
        City("Nikšić"),
        City("Herceg Novi"),
        City("Budva"),
        City("Bar")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Montenegro),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.EuropeanCountry()
