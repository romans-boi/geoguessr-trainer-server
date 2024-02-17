package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Spain(
    override val name: String = "Spain",
    override val capitalCities: List<String> = listOf("Madrid"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Spain,
    override val majorCities: List<City> = listOf(
        City("Barcelona"),
        City("Valencia"),
        City("Seville"),
        City("Zaragoza"),
        City("Málaga"),
        City("Murcia"),
        City("Palma de Mallorca"),
        City("Las Palmas de Gran Canaria"),
        City("Bilbao"),
        City("Alicante"),
        City("Valladolid"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Spain),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.EuropeanCountry()
