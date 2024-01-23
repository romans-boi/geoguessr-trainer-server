package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import kotlinx.serialization.Serializable

@Serializable
data class Turkey(
    override val name: String = "Turkey",
    override val capitalCities: List<String> = listOf("Ankara"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Lira,
    override val domain: Domain = Domain.Turkey,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Turkey),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.YellowSideYellowMiddle,
        RoadLines.WhiteSideYellowWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AsianCountry()
