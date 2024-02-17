package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Ghana(
    override val name: String = "Ghana",
    override val capitalCities: List<String> = listOf("Accra"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Cedi,
    override val domain: Domain = Domain.Ghana,
    override val majorCities: List<City> = listOf(
        City("Kumasi"),
        City("Tamale"),
        City("Sekondi-Takoradi"),
        City("Ashiaman"),
        City("Sunyani"),
        City("Teshie"),
        City("Cape Coast"),
        City("Obuasi"),
        City("Madina"),
        City("Koforidua"),
        City("Wa"),
        City("Techiman"),
        City("Ho"),
        City("Bolgatanga")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Ghana),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AfricanCountry()
