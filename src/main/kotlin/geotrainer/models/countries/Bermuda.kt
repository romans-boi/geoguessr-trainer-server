package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.CarMeta
import geotrainer.models.CarType
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines
import geotrainer.models.Url
import kotlinx.serialization.Serializable

@Serializable
data class Bermuda(
    override val name: String = "Bermuda",
    override val capitalCities: List<String> = listOf("Hamilton"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Bermuda,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker,
    ),

    override val roadLines: List<RoadLines>? = null,

    override val carTypes: List<CarType>? = listOf(
        CarType.Standard(
            metas = setOf(CarMeta.FrontVisible, CarMeta.FrontMirrors, CarMeta.ColorBlack),
            imageUrl = Url(value = "bermuda")
        ),
    )
) : Country.NorthAmericanCountry()
