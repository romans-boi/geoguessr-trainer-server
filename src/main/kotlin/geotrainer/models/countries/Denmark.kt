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
data class Denmark(
    override val name: String = "Denmark",
    override val capitalCities: List<City> = listOf(City("Copenhagen")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Krone,
    override val domain: Domain = Domain.Denmark,
    override val majorCities: List<City> = listOf(
        City("Aarhus"),
        City("Odense"),
        City("Aalborg"),
        City("Esbjerg"),
        City("Randers"),
        City("Kolding"),
        City("Horsens"),
        City("Vejle"),
        City("Roskilde"),
        City("Helsingør"),
        City("Herning"),
        City("Silkeborg"),
        City("Næstved"),
        City("Fredericia")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Denmark),

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
