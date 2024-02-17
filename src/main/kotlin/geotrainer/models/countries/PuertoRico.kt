package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class PuertoRico(
    override val name: String = "Puerto Rico",
    override val capitalCities: List<String> = listOf("San Juan"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.PuertoRico,
    override val majorCities: List<City> = listOf(
        City("Bayamón"),
        City("Carolina"),
        City("Ponce"),
        City("Caguas"),
        City("Guaynabo"),
        City("Mayagüez"),
        City("Trujillo Alto"),
        City("Arecibo"),
        City("Fajardo")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(
        PhoneDialingCode.PuertoRico787,
        PhoneDialingCode.PuertoRico939
    ),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.NorthAmericanCountry()
