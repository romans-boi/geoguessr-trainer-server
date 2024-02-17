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
data class FaroeIslands(
    override val name: String = "Faroe Islands",
    override val capitalCities: List<City> = listOf(City("Tórshavn")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Krone,
    override val domain: Domain = Domain.FaroeIslands,
    override val majorCities: List<City> = listOf(
        City("Klaksvík"),
        City("Runavík"),
        City("Fuglafjørður"),
        City("Tvøroyri"),
        City("Vágur"),
        City("Nordragota"),
        City("Gøta"),
        City("Vestmanna")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.FaroeIslands),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
