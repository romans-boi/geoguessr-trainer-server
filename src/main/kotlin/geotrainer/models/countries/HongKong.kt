package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class HongKong(
    override val name: String = "Hong Kong",
    override val capitalCities: List<String>? = null,
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.HongKongDollar,
    override val domain: Domain = Domain.HongKong,
    override val majorCities: List<City> = emptyList(),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.HongKong),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines>? = null,
) : Country.AsianCountry()
