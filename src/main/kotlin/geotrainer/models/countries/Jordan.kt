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
data class Jordan(
    override val name: String = "Jordan",
    override val capitalCities: List<City> = listOf(City("Amman")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.JordanianDinar,
    override val domain: Domain = Domain.Jordan,
    override val majorCities: List<City> = listOf(
        City("Zarqa"),
        City("Irbid"),
        City("Aqaba"),
        City("Salt"),
        City("Ar Ramtha"),
        City("Madaba"),
        City("Al Karak"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Jordan),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.AsianCountry()
