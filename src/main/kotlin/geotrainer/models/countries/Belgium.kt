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
data class Belgium(
    override val name: String = "Belgium",
    override val capitalCities: List<City> = listOf(City("Brussels")),
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
