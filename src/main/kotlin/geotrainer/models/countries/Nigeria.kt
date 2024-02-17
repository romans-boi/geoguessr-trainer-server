package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Nigeria(
    override val name: String = "Nigeria",
    override val capitalCities: List<String> = listOf("Abuja"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Naira,
    override val domain: Domain = Domain.Nigeria,
    override val majorCities: List<City> = listOf(
        City("Lagos"),
        City("Kano"),
        City("Ibadan"),
        City("Kaduna"),
        City("Port Harcourt"),
        City("Benin City"),
        City("Maiduguri"),
        City("Zaria"),
        City("Aba")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Nigeria),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.AfricanCountry()
