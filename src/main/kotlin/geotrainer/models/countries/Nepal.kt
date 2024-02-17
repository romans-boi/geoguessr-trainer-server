package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Nepal(
    override val name: String = "Nepal",
    override val capitalCities: List<City> = listOf(City("Kathmandu")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.NepaleseRupee,
    override val domain: Domain = Domain.Nepal,
    override val majorCities: List<City> = listOf(
        City("Pokhara"),
        City("Lalitpur"),
        City("Bharatpur"),
        City("Biratnagar")
    ),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines>? = null,
) : Country.AsianCountry()
