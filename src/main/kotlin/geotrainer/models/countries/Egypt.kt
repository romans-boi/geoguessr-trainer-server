package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import kotlinx.serialization.Serializable

@Serializable
data class Egypt(
    override val name: String = "Egypt",
    override val capitalCities: List<String> = listOf("Cairo"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.EgyptianPound,
    override val domain: Domain = Domain.Egypt,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines>? = null,
) : Country.AfricanCountry()
