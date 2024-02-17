package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Serbia(
    override val name: String = "Serbia",
    override val capitalCities: List<String> = listOf("Belgrade"),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.SerbianDinar,
    override val domain: Domain = Domain.Serbia,
    override val majorCities: List<City> = listOf(
        City("Novi Sad"),
        City("Niš"),
        City("Kragujevac"),
        City("Subotica"),
        City("Zrenjanin"),
        City("Pancevo"),
        City("Cacak"),
        City("Novi Pazar"),
        City("Kraljevo")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Serbia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
