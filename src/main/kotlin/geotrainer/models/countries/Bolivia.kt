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
data class Bolivia(
    override val name: String = "Bolivia",
    override val capitalCities: List<String> = listOf("La Paz (administrative)", "Sucre (judicial)"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Boliviano,
    override val domain: Domain = Domain.Bolivia,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Bolivia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),

    override val carTypes: List<CarType>? = listOf(
        CarType.Standard(
            metas = setOf(CarMeta.ColorWhite),
            imageUrl = null
        ),

        CarType.Special(
            imageUrl = Url(value = "bolivia-special")
        ),
    )
) : Country.SouthAmericanCountry()
