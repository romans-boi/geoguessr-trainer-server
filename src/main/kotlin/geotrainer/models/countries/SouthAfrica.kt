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
data class SouthAfrica(
    override val name: String = "South Africa",
    override val capitalCities: List<City> = listOf(
        City("Pretoria (administrative)"),
        City("Cape Town (legislative)"),
        City("Bloemfontein (judiciary)"),
    ),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Rand,
    override val domain: Domain = Domain.SouthAfrica,
    override val majorCities: List<City> = listOf(
        City("Durban"),
        City("Pretoria"),
        City("Gqeberha (Port Elizabeth)"),
        City("Soweto"),
        City("East London"),
        City("Polokwane"),
        City("George"),
        City("Kimberly"),
        City("Mossel Bay"),
        City("Mbombela")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.SouthAfrica),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle,
        RoadLines.RedSideWhiteMiddle
    ),
) : Country.AfricanCountry()
