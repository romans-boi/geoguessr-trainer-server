package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Guatemala(
    override val name: String = "Guatemala",
    override val capitalCities: List<String> = listOf("Guatemala City"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Quetzal,
    override val domain: Domain = Domain.Guatemala,
    override val majorCities: List<City> = listOf(
        City("Mixco"),
        City("Villa Nueva"),
        City("Quetzaltenango"),
        City("San Miguel Petapa"),
        City("Escuintla"),
        City("Jalapa"),
        City("Chimaltenango"),
        City("Huehuetenango"),
        City("Amatitlán"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Guatemala),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.NorthAmericanCountry()
