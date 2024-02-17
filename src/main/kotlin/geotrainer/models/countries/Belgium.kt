package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Belgium(
    override val name: String = "Belgium",
    override val capitalCities: List<String> = listOf("Brussels"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Belgium,
    override val majorCities: List<City> = listOf(
        City("Ghent"),
        City("Antwerp"),
        City("Bruges"),
        City("Liège"),
        City("Mons"),
        City("Kortrijk"),
        City("Namur"),
        City("Charleroi"),
        City("Leuven"),
        City("Ostend"),
        City("Ypres"),
        City("Hasselt"),
        City("Genk"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Belgium),

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
