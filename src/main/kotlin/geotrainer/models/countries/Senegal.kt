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
data class Senegal(
    override val name: String = "Senegal",
    override val capitalCities: List<City> = listOf(City("Dakar")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.CfaFranc,
    override val domain: Domain = Domain.Senegal,
    override val majorCities: List<City> = listOf(
        City("Thiès"),
        City("Kaolack"),
        City("Ziguinchor"),
        City("Diourbel"),
        City("Louga"),
        City("Touba"),
        City("Saint-Louis"),
        City("Rufisque"),
        City("Fatick")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Senegal),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AfricanCountry()
