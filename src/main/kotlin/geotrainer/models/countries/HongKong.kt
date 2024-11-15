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
data class HongKong(
    override val name: String = "Hong Kong",
    override val capitalCities: List<City>? = null,
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.HongKongDollar,
    override val domain: Domain = Domain.HongKong,
    override val majorCities: List<City> = listOf(
        City("Kowloon"),
        City("Tsuen Wan"),
        City("Yuen Long Kau Hui"),
        City("Tuen Mun"),
    ),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.HongKong),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines>? = null,
) : Country.AsianCountry()
