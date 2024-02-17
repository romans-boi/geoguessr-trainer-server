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
