package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Russia(
    override val name: String = "Russia",
    override val capitalCities: List<City> = listOf(City("Moscow")),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Ruble,
    override val domain: Domain = Domain.Russia,
    override val majorCities: List<City> = listOf(
        City("Saint Petersburg"),
        City("Novosibirsk"),
        City("Yekaterinburg"),
        City("Nizhny Novgorod"),
        City("Kazan"),
        City("Chelyabinsk"),
        City("Omsk"),
        City("Samara"),
        City("Rostov-on-Don")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Russia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.EuropeanCountry()
