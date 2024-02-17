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
data class Peru(
    override val name: String = "Peru",
    override val capitalCities: List<City> = listOf(City("Lima")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Sol,
    override val domain: Domain = Domain.Peru,
    override val majorCities: List<City> = listOf(
        City("Arequipa"),
        City("Trujillo"),
        City("Chiclayo"),
        City("Piura"),
        City("Iquitos"),
        City("Cusco"),
        City("Huancayo"),
        City("Chimbote"),
        City("Pucallpa")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Peru),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.SouthAmericanCountry()
