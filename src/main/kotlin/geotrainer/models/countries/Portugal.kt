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
data class Portugal(
    override val name: String = "Portugal",
    override val capitalCities: List<City> = listOf(City("Lisbon")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Portugal,
    override val majorCities: List<City> = listOf(
        City("Porto"),
        City("Vila Nova de Gaia"),
        City("Amadora"),
        City("Braga"),
        City("Coimbra"),
        City("Funchal"),
        City("Setúbal"),
        City("Almada"),
        City("Aveiro")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Portugal),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle,
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
