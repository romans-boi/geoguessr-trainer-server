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
data class China(
    override val name: String = "China",
    override val capitalCities: List<City> = listOf(City("Beijing")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Renminbi,
    override val domain: Domain = Domain.China,
    override val majorCities: List<City> = listOf(
        City("Shanghai"),
        City("Guangzhou"),
        City("Shenzhen"),
        City("Tianjin"),
        City("Chongqing"),
        City("Wuhan"),
        City("Chengdu"),
        City("Nanjing"),
        City("Hangzhou"),
        City("Xi'an"),
        City("Shijiazhuang"),
        City("Harbin"),
        City("Suzhou"),
        City("Dalian")
    ),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines>? = null,
) : Country.AsianCountry()
