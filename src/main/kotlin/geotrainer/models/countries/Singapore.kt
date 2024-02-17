package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Singapore(
    override val name: String = "Singapore",
    override val capitalCities: List<City> = listOf(City("Singapore")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Singapore,
    override val majorCities: List<City> = listOf(
        City("Jurong West"),
        City("Woodlands"),
        City("Tampines"),
        City("Ang Mo Kio")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Singapore),

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
) : Country.AsianCountry()
