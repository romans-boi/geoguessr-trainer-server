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
data class Hungary(
    override val name: String = "Hungary",
    override val capitalCities: List<City> = listOf(City("Budapest")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Forint,
    override val domain: Domain = Domain.Hungary,
    override val majorCities: List<City> = listOf(
        City("Debrecen"),
        City("Szeged"),
        City("Miskolc"),
        City("Pécs"),
        City("Győr"),
        City("Nyíregyháza"),
        City("Kecskemét"),
        City("Székesfehérvár"),
        City("Szombathely"),
        City("Szolnok"),
        City("Tatabánya"),
        City("Kaposvár"),
        City("Érd"),
        City("Veszprém")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Hungary),

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
