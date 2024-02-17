package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Egypt(
    override val name: String = "Egypt",
    override val capitalCities: List<String> = listOf("Cairo"),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.EgyptianPound,
    override val domain: Domain = Domain.Egypt,
    override val majorCities: List<City> = listOf(
        City("Alexandria"),
        City("Giza"),
        City("Shubra El-Kheima"),
        City("Port Said"),
        City("Suez"),
        City("Luxor"),
        City("Damanhour"),
        City("Mansoura"),
        City("El-Mahalla El-Kubra"),
        City("Tanta"),
        City("Asyut"),
        City("Ismailia"),
        City("Faiyum"),
        City("Zagazig"),
        City("Assiut")
    ),
    override val carPlates: List<String>? = null,
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode>? = null,

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines>? = null,
) : Country.AfricanCountry()
