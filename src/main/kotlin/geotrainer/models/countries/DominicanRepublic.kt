package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class DominicanRepublic(
    override val name: String = "Dominican Republic",
    override val capitalCities: List<String> = listOf("Santo Domingo"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.DominicanPeso,
    override val domain: Domain = Domain.DominicanRepublic,
    override val majorCities: List<City> = emptyList(),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(
        PhoneDialingCode.DominicanRepublic809,
        PhoneDialingCode.DominicanRepublic829,
        PhoneDialingCode.DominicanRepublic849
    ),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.NorthAmericanCountry()
