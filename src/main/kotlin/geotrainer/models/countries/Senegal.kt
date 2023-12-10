package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Senegal(
    override val name: String = "Senegal",
    override val capitalCities: List<String> = listOf("Dakar"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.CfaFranc,
    override val domain: Domain = Domain.Senegal,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    )
) : Country.AfricanCountry()
