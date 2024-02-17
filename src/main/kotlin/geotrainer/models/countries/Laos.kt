package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Laos(
    override val name: String = "Laos",
    override val capitalCities: List<String> = listOf("Vientiane"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Kip,
    override val domain: Domain = Domain.Laos,
    override val majorCities: List<City> = listOf(
        City("Savannakhet"),
        City("Pakse"),
        City("Thakhek"),
        City("Luang Prabang"),
        City("Xam Neua"),
        City("Phonsavan"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Laos),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AsianCountry()
