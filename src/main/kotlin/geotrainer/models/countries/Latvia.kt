package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Latvia(
    override val name: String = "Latvia",
    override val capitalCities: List<String> = listOf("Riga"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Latvia,
    override val majorCities: List<City> = listOf(
        City("Daugavpils"),
        City("Liepāja"),
        City("Jelgava"),
        City("Jūrmala"),
        City("Ventspils"),
        City("Rēzekne"),
        City("Valmiera"),
        City("Ogre"),
        City("Cesis")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Latvia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
