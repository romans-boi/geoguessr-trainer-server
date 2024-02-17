package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Mexico(
    override val name: String = "Mexico",
    override val capitalCities: List<City> = listOf(City("Mexico City")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Peso,
    override val domain: Domain = Domain.Mexico,
    override val majorCities: List<City> = listOf(
        City("Guadalajara"),
        City("Monterrey"),
        City("Puebla"),
        City("Tijuana"),
        City("Querétaro"),
        City("Juárez"),
        City("León"),
        City("Zapopan"),
        City("Monclova")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Mexico),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen1,
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.YellowSideWhiteMiddle,
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.NorthAmericanCountry()
