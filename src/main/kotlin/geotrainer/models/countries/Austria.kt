package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Austria(
    override val name: String = "Austria",
    override val capitalCities: List<City> = listOf(City("Vienna")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Austria,
    override val majorCities: List<City> = listOf(
        City("Linz"),
        City("Salzburg"),
        City("Innsbruck"),
        City("Graz"),
        City("Wels"),
        City("Klagenfurt"),
        City("Villach"),
        City("Wiener Neustadt"),
        City("Sankt Pölten"),
        City("Dornbirn"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Austria),

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
