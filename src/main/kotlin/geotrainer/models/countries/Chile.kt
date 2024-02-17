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
data class Chile(
    override val name: String = "Chile",
    override val capitalCities: List<City> = listOf(City("Santiago")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Peso,
    override val domain: Domain = Domain.Chile,
    override val majorCities: List<City> = listOf(
        City("Valparaíso"),
        City("Concepción"),
        City("Antofagasta"),
        City("Viña del Mar"),
        City("Puente Alto"),
        City("Talcahuano"),
        City("Temuco"),
        City("La Serena"),
        City("Rancagua"),
        City("Arica"),
        City("Talca"),
        City("Chillán"),
        City("Iquique"),
        City("Calama")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Chile),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideYellowMiddle,
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.SouthAmericanCountry()
