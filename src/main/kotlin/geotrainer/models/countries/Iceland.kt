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
data class Iceland(
    override val name: String = "Iceland",
    override val capitalCities: List<City> = listOf(City("Reykjavik")),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Krona,
    override val domain: Domain = Domain.Iceland,
    override val majorCities: List<City> = listOf(
        City("Kopavogur"),
        City("Hafnarfjordur"),
        City("Akureyri"),
        City("Reykjanesbaer"),
        City("Seltjarnarnes"),
        City("Garðabær"),
        City("Mosfellsbaer"),
        City("Akranes"),
        City("Selfoss")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Iceland),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
