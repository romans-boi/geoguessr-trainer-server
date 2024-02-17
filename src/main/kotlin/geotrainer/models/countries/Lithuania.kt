package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Lithuania(
    override val name: String = "Lithuania",
    override val capitalCities: List<String> = listOf("Vilnius"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Lithuania,
    override val majorCities: List<City> = listOf(
        City("Kaunas"),
        City("Klaipeda"),
        City("Šiauliai"),
        City("Panevėžys"),
        City("Alytus"),
        City("Marijampolė"),
        City("Mažeikiai"),
        City("Jonava"),
        City("Utena")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Lithuania),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.EuropeanCountry()
