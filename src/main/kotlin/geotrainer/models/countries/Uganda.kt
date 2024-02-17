package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Uganda(
    override val name: String = "Uganda",
    override val capitalCities: List<String> = listOf("Kampala"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.UgandanShilling,
    override val domain: Domain = Domain.Uganda,
    override val majorCities: List<City> = listOf(
        City("Gulu"),
        City("Lira"),
        City("Mbarara"),
        City("Jinja"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Uganda),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AfricanCountry()
