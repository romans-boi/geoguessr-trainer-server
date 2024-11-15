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
data class Switzerland(
    override val name: String = "Switzerland",
    override val capitalCities: List<City> = listOf(City("Bern")),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Franc,
    override val domain: Domain = Domain.Switzerland,
    override val majorCities: List<City> = listOf(
        City("Zurich"),
        City("Geneva"),
        City("Basel"),
        City("Lausanne"),
        City("St. Gallen"),
        City("Lucerne"),
        City("Winterthur"),
        City("Lugano"),
        City("St Moritz"),
        City("Davos"),
        City("Biel (Bienne)")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Switzerland),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker,
        CameraGeneration.LowCam
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
