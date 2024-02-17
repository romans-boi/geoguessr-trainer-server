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
data class Bangladesh(
    override val name: String = "Bangladesh",
    override val capitalCities: List<City> = listOf(City("Dhaka")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Taka,
    override val domain: Domain = Domain.Bangladesh,
    override val majorCities: List<City> = listOf(
        City("Khulna"),
        City("Bogura"),
        City("Mymensingh"),
        City("Cumilla"),
        City("Chattogram"),
        City("Rajshahi"),
        City("Sylhet"),
        City("Dinajpur"),
        City("Barishal"),
        City("Narayanganj"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Bangladesh),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),

) : Country.AsianCountry()
