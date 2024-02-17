package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.City
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines

import kotlinx.serialization.Serializable

@Serializable
data class Eswatini(
    override val name: String = "Eswatini",
    override val capitalCities: List<City> = listOf(City("Mbabane"), City("Lobamba")),
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
