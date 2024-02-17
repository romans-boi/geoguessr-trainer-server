package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Sweden(
    override val name: String = "Sweden",
    override val capitalCities: List<City> = listOf(City("Stockholm")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Krona,
    override val domain: Domain = Domain.Sweden,
    override val majorCities: List<City> = listOf(
        City("Gothenburg"),
        City("Malmö"),
        City("Uppsala"),
        City("Västerås"),
        City("Örebro"),
        City("Linköping"),
        City("Helsingborg"),
        City("Jönköping"),
        City("Norrköping")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Sweden),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
