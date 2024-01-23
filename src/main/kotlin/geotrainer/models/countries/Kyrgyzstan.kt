package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import kotlinx.serialization.Serializable

@Serializable
data class Kyrgyzstan(
    override val name: String = "Kyrgyzstan",
    override val capitalCities: List<String> = listOf("Bishkek"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Som,
    override val domain: Domain = Domain.Kyrgyzstan,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Kyrgyzstan),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AsianCountry()
