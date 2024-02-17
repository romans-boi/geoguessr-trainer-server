package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class UnitedStates(
    override val name: String = "United States",
    override val capitalCities: List<City> = listOf(City("Washington D.C.")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.UnitedStates,
    override val majorCities: List<City> = listOf(
        City("New York"),
        City("Los Angeles"),
        City("Chicago"),
        City("Houston"),
        City("Phoenix"),
        City("Philadelphia"),
        City("San Antonio"),
        City("San Diego"),
        City("Dallas"),
        City("San Jose"),
        City("Austin"),
        City("Jacksonville"),
        City("San Francisco"),
        City("Columbus"),
        City("Indianapolis"),
        City("Fort Worth"),
        City("Charlotte"),
        City("Seattle"),
        City("Denver"),
        City("Boston"),
        City("El Paso"),
        City("Detroit"),
        City("Nashville"),
        City("Memphis"),
        City("Portland"),
        City("Oklahoma City"),
        City("Las Vegas"),
        City("Baltimore"),
        City("Louisville"),
        City("Milwaukee")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.UnitedStates),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen1,
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.NorthAmericanCountry()
