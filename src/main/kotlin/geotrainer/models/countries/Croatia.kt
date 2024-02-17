package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Croatia(
    override val name: String = "Croatia",
    override val capitalCities: List<City> = listOf(City("Zagreb")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Kuna,
    override val domain: Domain = Domain.Croatia,
    override val majorCities: List<City> = listOf(
        City("Split"),
        City("Rijeka"),
        City("Osijek"),
        City("Zadar"),
        City("Slavonski Brod"),
        City("Pula"),
        City("Sesvete"),
        City("Karlovac"),
        City("Varaždin"),
        City("Šibenik"),
        City("Sisak"),
        City("Velika Gorica"),
        City("Dubrovnik"),
        City("Vinkovci")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Croatia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
