package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Senegal(
    override val name: String = "Senegal",
    override val capitalCities: List<String> = listOf("Dakar"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.CfaFranc,
    override val domain: Domain = Domain.Senegal,
    override val majorCities: List<City> = emptyList(),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Senegal),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AfricanCountry()
