package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Bangladesh(
    override val name: String = "Bangladesh",
    override val capitalCities: List<String> = listOf("Dhaka"),
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
