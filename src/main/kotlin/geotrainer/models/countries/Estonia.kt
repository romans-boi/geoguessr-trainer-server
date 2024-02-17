package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Estonia(
    override val name: String = "Estonia",
    override val capitalCities: List<City> = listOf(City("Tallinn")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Estonia,
    override val majorCities: List<City> = listOf(
        City("Tartu"),
        City("Narva"),
        City("Pärnu"),
        City("Kohtla-Järve"),
        City("Viljandi"),
        City("Rakvere"),
        City("Maardu"),
        City("Sillamäe"),
        City("Kuressaare"),
        City("Võru"),
        City("Valga"),
        City("Haapsalu"),
        City("Jõhvi"),
        City("Paide")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Estonia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
