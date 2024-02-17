package geotrainer.models.countries

import geotrainer.models.CameraGeneration
import geotrainer.models.City
import geotrainer.models.Currency
import geotrainer.models.Domain
import geotrainer.models.DrivingSide
import geotrainer.models.PhoneDialingCode
import geotrainer.models.RoadLines

import kotlinx.serialization.Serializable

@Serializable
data class Kenya(
    override val name: String = "Kenya",
    override val capitalCities: List<City> = listOf(City("Nairobi")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.KenyanShilling,
    override val domain: Domain = Domain.Kenya,
    override val majorCities: List<City> = listOf(
        City("Mombasa"),
        City("Kisumu"),
        City("Nakuru"),
        City("Eldoret"),
        City("Thika"),
        City("Malindi"),
        City("Kitale"),
        City("Garissa"),
        City("Kakamega"),
        City("Nyeri"),
        City("Machakos"),
        City("Meru"),
        City("Lamu"),
        City("Nanyuki")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Kenya),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AfricanCountry()
