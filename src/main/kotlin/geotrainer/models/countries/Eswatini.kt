package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import kotlinx.serialization.Serializable

@Serializable
data class Eswatini(
    override val name: String = "Eswatini",
    override val capitalCities: List<String> = listOf("Mbabane", "Lobamba"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Lilangeli,
    override val domain: Domain = Domain.Eswatini,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Eswatini),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle,
        RoadLines.YellowSideYellowWhiteMiddle,
    ),
) : Country.AfricanCountry()
