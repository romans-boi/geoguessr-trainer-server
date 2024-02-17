
package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Colombia(
    override val name: String = "Colombia",
    override val capitalCities: List<String> = listOf("Bogota"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Peso,
    override val domain: Domain = Domain.Colombia,
    override val majorCities: List<City> = listOf(
        City("Medellín"),
        City("Cali"),
        City("Barranquilla"),
        City("Cartagena"),
        City("Cúcuta"),
        City("Bucaramanga"),
        City("Pereira"),
        City("Santa Marta"),
        City("Ibagué"),
        City("Manizales"),
        City("Neiva"),
        City("Villavicencio"),
        City("Pasto"),
        City("Popayán"),
        City("Yopal"),
        City("Montería"),
        City("Valledupar")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Colombia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
): Country.SouthAmericanCountry()
