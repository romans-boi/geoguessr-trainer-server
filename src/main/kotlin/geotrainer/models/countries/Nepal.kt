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
