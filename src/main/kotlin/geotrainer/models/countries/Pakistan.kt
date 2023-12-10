package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import kotlinx.serialization.Serializable

@Serializable
data class Pakistan(
    override val name: String = "Pakistan",
    override val capitalCities: List<String> = listOf("Islamabad"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.PakistaniRupee,
    override val domain: Domain = Domain.Pakistan,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Trekker
    )
) : Country.AsianCountry()
