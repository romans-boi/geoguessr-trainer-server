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
data class Ghana(
    override val name: String = "Ghana",
    override val capitalCities: List<City> = listOf(City("Accra")),
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
