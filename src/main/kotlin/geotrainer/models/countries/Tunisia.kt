package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Tunisia(
    override val name: String = "Tunisia",
    override val capitalCities: List<String> = listOf("Tunis"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.TunisianDinar,
    override val domain: Domain = Domain.Tunisia,
    override val majorCities: List<City> = listOf(
        City("Sfax"),
        City("Sousse"),
        City("Kairouan"),
        City("Bizerte")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Tunisia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AfricanCountry()
