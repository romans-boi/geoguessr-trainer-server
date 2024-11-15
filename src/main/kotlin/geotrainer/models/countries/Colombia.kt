
package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.City
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines

import kotlinx.serialization.Serializable

@Serializable
data class Colombia(
    override val name: String = "Colombia",
    override val capitalCities: List<City> = listOf(City("Bogota")),
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
