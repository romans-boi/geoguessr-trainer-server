package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Pakistan(
    override val name: String = "Pakistan",
    override val capitalCities: List<City> = listOf(City("Islamabad")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.PakistaniRupee,
    override val domain: Domain = Domain.Pakistan,
    override val majorCities: List<City> = listOf(
        City("Karachi"),
        City("Lahore"),
        City("Faisalabad"),
        City("Rawalpindi"),
        City("Multan")
    ),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines>? = null,
) : Country.AsianCountry()
