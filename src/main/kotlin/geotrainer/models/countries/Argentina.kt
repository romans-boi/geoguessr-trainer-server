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
data class Argentina(
    override val name: String = "Argentina",
    override val capitalCities: List<String> = listOf("Buenos Aires"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Peso,
    override val domain: Domain = Domain.Argentina,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Argentina),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.WhiteSideYellowWhiteMiddle,
    ),

    override val carTypes: List<CarType>? = listOf(
        CarType.Standard(
            metas = setOf(CarMeta.ColorBlue),
            imageUrl = null
        ),

        CarType.Standard(
            metas = setOf(CarMeta.ColorWhite),
            imageUrl = null
        ),

        CarType.Standard(
            metas = setOf(CarMeta.ColorBlack),
            imageUrl = null
        ),

        CarType.Standard(
            metas = setOf(CarMeta.ColorWhite, CarMeta.ColorBlue),
            imageUrl = Url(value = "argentina-blue-white")
        ),

        CarType.Standard(
            metas = setOf(CarMeta.ColorBlack, CarMeta.FrontVisible),
            imageUrl = Url(value = "argentina-black-front")
        )
    )
) : Country.SouthAmericanCountry()
