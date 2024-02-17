package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Japan(
    override val name: String = "Japan",
    override val capitalCities: List<String> = listOf("Tokyo"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Yen,
    override val domain: Domain = Domain.Japan,
    override val majorCities: List<City> = listOf(
        City("Tokyo"),
        City("Yokohama"),
        City("Osaka"),
        City("Nagoya"),
        City("Sapporo"),
        City("Fukuoka"),
        City("Kawasaki"),
        City("Kobe"),
        City("Yokosuka"),
        City("Saitama"),
        City("Chiba"),
        City("Sendai"),
        City("Kita-ku"),
        City("Sakai"),
        City("Niigata"),
        City("Shizuoka"),
        City("Okayama"),
        City("Kumamoto"),
        City("Utsunomiya"),
        City("Kagoshima"),
        City("Hiroshima"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Japan),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen1,
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker,
        CameraGeneration.LowCam
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.WhiteSideYellowWhiteMiddle
    ),
) : Country.AsianCountry()
