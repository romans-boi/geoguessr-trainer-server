package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Mongolia(
    override val name: String = "Mongolia",
    override val capitalCities: List<String> = listOf("Ulaanbaatar"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Togrog,
    override val domain: Domain = Domain.Mongolia,
    override val majorCities: List<City> = listOf(
        City("Darkhan"),
        City("Erdenet"),
        City("Choibalsan"),
        City("Mörön")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Mongolia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AsianCountry()
