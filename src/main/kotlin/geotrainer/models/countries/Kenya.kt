package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Kenya(
    override val name: String = "Kenya",
    override val capitalCities: List<String> = listOf("Nairobi"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.KenyanShilling,
    override val domain: Domain = Domain.Kenya,
    override val majorCities: List<City> = emptyList(),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Kenya),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AfricanCountry()
