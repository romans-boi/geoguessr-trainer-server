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
data class Germany(
    override val name: String = "Germany",
    override val capitalCities: List<City> = listOf(City("Berlin")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Germany,
    override val majorCities: List<City> = listOf(
        City("Hamburg"),
        City("Munich"),
        City("Cologne"),
        City("Frankfurt"),
        City("Stuttgart"),
        City("Düsseldorf"),
        City("Dortmund"),
        City("Essen"),
        City("Bremen"),
        City("Leipzig"),
        City("Dresden"),
        City("Hanover"),
        City("Nuremberg"),
        City("Duisburg")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Germany),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideYellowMiddle
    ),
) : Country.EuropeanCountry()
