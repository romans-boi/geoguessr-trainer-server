package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Nepal(
    override val name: String = "Nepal",
    override val capitalCities: List<String> = listOf("Kathmandu"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.NepaleseRupee,
    override val domain: Domain = Domain.Nepal,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Trekker
    )
) : Country.AsianCountry()
