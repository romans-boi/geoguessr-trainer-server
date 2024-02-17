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
