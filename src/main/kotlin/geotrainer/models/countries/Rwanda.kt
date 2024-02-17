package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Rwanda(
    override val name: String = "Rwanda",
    override val capitalCities: List<String> = listOf("Kigali"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.RwandanFranc,
    override val domain: Domain = Domain.Rwanda,
    override val majorCities: List<City> = listOf(
        City("Butare"),
        City("Gitarama"),
        City("Ruhengeri"),
        City("Gisenyi")
    ),
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
