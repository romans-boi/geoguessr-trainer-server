package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Ecuador(
    override val name: String = "Ecuador",
    override val capitalCities: List<String> = listOf("Quito"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Ecuador,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    )
) : Country.SouthAmericanCountry()
