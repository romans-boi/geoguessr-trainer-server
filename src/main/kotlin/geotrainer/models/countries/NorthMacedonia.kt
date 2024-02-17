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
data class NorthMacedonia(
    override val name: String = "North Macedonia",
    override val capitalCities: List<City> = listOf(City("Skopje")),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Denar,
    override val domain: Domain = Domain.NorthMacedonia,
    override val majorCities: List<City> = listOf(
        City("Bitola"),
        City("Kumanovo"),
        City("Prilep"),
        City("Tetovo"),
        City("Ohrid"),
        City("Veles"),
        City("Štip"),
        City("Gostivar"),
        City("Strumica")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.NorthMacedonia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideYellowMiddle
    ),
) : Country.EuropeanCountry()
