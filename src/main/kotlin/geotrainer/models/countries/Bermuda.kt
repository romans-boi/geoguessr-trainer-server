package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Bermuda(
    override val name: String = "Bermuda",
    override val capitalCities: List<City> = listOf(City("Hamilton")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Bermuda,
    override val majorCities: List<City> = listOf(
        City("Mt Pleasant"),
        City("Flatts Village"),
        City("North Shore Village"),
        City("Somerset Village"),
        City("Hog Bay"),
        City("St. George's"),
        City("Tucker's Town"),
    ),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker,
    ),

    override val roadLines: List<RoadLines>? = null,

    ) : Country.NorthAmericanCountry()
