
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
data class Andorra(
    override val name: String = "Andorra",
    override val capitalCities: List<String> = listOf("Andorra la Vella"),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.Andorra,
    override val majorCities: List<String> = listOf("TODO"),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Andorra),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),

    override val carTypes: List<CarType>? = listOf(
        CarType.Standard(
            metas = setOf(CarMeta.AntennaLong),
            imageUrl = Url(value = "andorra")
        )
    )
): Country.EuropeanCountry()
