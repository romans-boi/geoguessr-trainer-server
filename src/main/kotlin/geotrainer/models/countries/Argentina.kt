package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Argentina(
    override val name: String = "Argentina",
    override val capitalCities: List<City> = listOf(City("Buenos Aires")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Peso,
    override val domain: Domain = Domain.Argentina,
    override val majorCities: List<City> = listOf(
        City("Córdoba"),
        City("Rosario"),
        City("Salta"),
        City("Mendoza"),
        City("Mar del Plata"),
        City("La Plata"),
        City("Santa Fe"),
        City("Bahía Blanca"),
        City("San Miguel de Tucuman"),
        City("Resistencia"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Argentina),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.WhiteSideYellowWhiteMiddle,
    ),

) : Country.SouthAmericanCountry()
