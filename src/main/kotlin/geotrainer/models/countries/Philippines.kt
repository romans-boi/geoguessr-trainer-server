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
data class Philippines(
    override val name: String = "Philippines",
    override val capitalCities: List<City> = listOf(City("Manila")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.PhilippinePeso,
    override val domain: Domain = Domain.Philippines,
    override val majorCities: List<City> = listOf(
        City("Quezon City"),
        City("Davao City"),
        City("Cebu City"),
        City("Zamboanga City"),
        City("Taguig City"),
        City("Antipolo City"),
        City("Pasig City"),
        City("Cagayan de Oro"),
        City("Parañaque City")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Philippines),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.WhiteSideYellowWhiteMiddle,
    ),
) : Country.AsianCountry()
