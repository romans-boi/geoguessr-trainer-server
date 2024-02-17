package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Lesotho(
    override val name: String = "Lesotho",
    override val capitalCities: List<String> = listOf("Maseru"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Loti,
    override val domain: Domain = Domain.Lesotho,
    override val majorCities: List<City> = listOf(
        City("Quthing"),
        City("Qacha's Nek"),
        City("Morija"),
        City("Thaba-Tseka"),
        City("Mokhotlong")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Lesotho),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.AfricanCountry()
