package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Greece(
    override val name: String = "Greece",
    override val capitalCities: List<City> = listOf(City("Athens")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Greece,
    override val majorCities: List<City> = listOf(
        City("Thessaloniki"),
        City("Piraeus"),
        City("Patras"),
        City("Heraklion"),
        City("Larissa"),
        City("Volos"),
        City("Ioannina"),
        City("Kavala"),
        City("Chania"),
        City("Drama"),
        City("Komotini"),
        City("Rhodes"),
        City("Serres"),
        City("Lamia")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Greece),

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
