package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import kotlinx.serialization.Serializable

@Serializable
data class Rwanda(
    override val name: String = "Rwanda",
    override val capitalCities: List<String> = listOf("Kigali"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.RwandanFranc,
    override val domain: Domain = Domain.Rwanda,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Rwanda),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen4,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AfricanCountry()
