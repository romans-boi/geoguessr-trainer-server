package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Kyrgyzstan(
    override val name: String = "Kyrgyzstan",
    override val capitalCities: List<City> = listOf(City("Bishkek")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Som,
    override val domain: Domain = Domain.Kyrgyzstan,
    override val majorCities: List<City> = listOf(
        City("Osh"),
        City("Jalal-Abad"),
        City("Karakol"),
        City("Tokmok"),
        City("Balykchy"),
        City("Naryn"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Kyrgyzstan),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AsianCountry()
