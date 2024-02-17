package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Malaysia(
    override val name: String = "Malaysia",
    override val capitalCities: List<City> = listOf(City("Kuala Lumpur")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Ringgit,
    override val domain: Domain = Domain.Malaysia,
    override val majorCities: List<City> = listOf(
        City("George Town"),
        City("Ipoh"),
        City("Johor Bahru"),
        City("Kuching"),
        City("Kota Kinabalu"),
        City("Shah Alam"),
        City("Malacca City"),
        City("Alor Setar"),
        City("Tawau"),
        City("Sandakan"),
        City("Miri")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Malaysia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AsianCountry()
