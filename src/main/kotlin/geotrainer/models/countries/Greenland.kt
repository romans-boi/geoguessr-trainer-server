package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Greenland(
    override val name: String = "Greenland (Denmark)",
    override val capitalCities: List<City> = listOf(City("Nuuk")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Krone,
    override val domain: Domain = Domain.Greenland,
    override val majorCities: List<City> = listOf(
        City("Sisimiut"),
        City("Ilulissat"),
        City("Qaqortoq"),
        City("Aasiaat")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Greenland),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.NorthAmericanCountry()
