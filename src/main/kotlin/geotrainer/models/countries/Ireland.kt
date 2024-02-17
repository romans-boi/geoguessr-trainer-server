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
data class Ireland(
    override val name: String = "Ireland",
    override val capitalCities: List<City> = listOf(City("Dublin")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Ireland,
    override val majorCities: List<City> = listOf(
        City("Cork"),
        City("Limerick"),
        City("Galway"),
        City("Waterford"),
        City("Drogheda"),
        City("Dundalk"),
        City("Bray"),
        City("Navan"),
        City("Ennis"),
        City("Tralee"),
        City("Carlow"),
        City("Kilkenny"),
        City("Naas"),
        City("Sligo")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Ireland),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
