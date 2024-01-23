package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import kotlinx.serialization.Serializable

@Serializable
data class Norway(
    override val name: String = "Norway",
    override val capitalCities: List<String> = listOf("Oslo"),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Krone,
    override val domain: Domain = Domain.Norway,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Norway),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.EuropeanCountry()
