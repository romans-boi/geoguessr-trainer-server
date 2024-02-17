package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Finland(
    override val name: String = "Finland",
    override val capitalCities: List<String> = listOf("Helsinki"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Finland,
    override val majorCities: List<City> = listOf(
        City("Espoo"),
        City("Tampere"),
        City("Vantaa"),
        City("Oulu"),
        City("Turku"),
        City("Jyväskylä"),
        City("Lahti"),
        City("Kuopio"),
        City("Kouvola"),
        City("Pori"),
        City("Joensuu"),
        City("Lappeenranta"),
        City("Hämeenlinna"),
        City("Rovaniemi")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Finland),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.WhiteSideYellowWhiteMiddle
    ),
) : Country.EuropeanCountry()
