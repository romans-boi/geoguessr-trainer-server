package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Eswatini(
    override val name: String = "Eswatini",
    override val capitalCities: List<String> = listOf("Mbabane", "Lobamba"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Lilangeli,
    override val domain: Domain = Domain.Eswatini,
    override val majorCities: List<City> = listOf(
        City("Manzini"),
        City("Big Bend"),
        City("Malkerns"),
        City("Nhlangano"),
        City("Siteki"),
        City("Hluti"),
        City("Mhlume")
    ),
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
