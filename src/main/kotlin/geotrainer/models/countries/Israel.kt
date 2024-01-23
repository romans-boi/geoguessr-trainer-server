package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import kotlinx.serialization.Serializable

@Serializable
data class Israel(
    override val name: String = "Israel",
    override val capitalCities: List<String> = listOf("Jerusalem"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.NewShekel,
    override val domain: Domain = Domain.Israel,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Israel),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.AsianCountry()
