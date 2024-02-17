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
data class Thailand(
    override val name: String = "Thailand",
    override val capitalCities: List<City> = listOf(City("Bangkok")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Baht,
    override val domain: Domain = Domain.Thailand,
    override val majorCities: List<City> = listOf(
        City("Nonthaburi"),
        City("Chiang Mai"),
        City("Hat Yai"),
        City("Udon Thani"),
        City("Pak Kret"),
        City("Khon Kaen"),
        City("Nakhon Ratchasima"),
        City("Pattaya"),
        City("Si Racha")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Thailand),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AsianCountry()
