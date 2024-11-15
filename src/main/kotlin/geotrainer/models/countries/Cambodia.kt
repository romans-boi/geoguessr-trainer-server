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
data class Cambodia(
    override val name: String = "Cambodia",
    override val capitalCities: List<City> = listOf(City("Phnom Penh")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Riel,
    override val domain: Domain = Domain.Cambodia,
    override val majorCities: List<City> = listOf(
        City("Krong Siem Reap"),
        City("Krong Battambang"),
        City("Krong Poi Pet"),
        City("Samraong"),
        City("Preah Sihanouk"),
        City("Chhlong"),
        City("Skun"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Cambodia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AsianCountry()
