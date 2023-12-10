package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Nigeria(
    override val name: String = "Nigeria",
    override val capitalCities: List<String> = listOf("Abuja"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Naira,
    override val domain: Domain = Domain.Nigeria,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    )
) : Country.AfricanCountry()
