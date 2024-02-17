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
data class Tunisia(
    override val name: String = "Tunisia",
    override val capitalCities: List<City> = listOf(City("Tunis")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.TunisianDinar,
    override val domain: Domain = Domain.Tunisia,
    override val majorCities: List<City> = listOf(
        City("Sfax"),
        City("Sousse"),
        City("Kairouan"),
        City("Bizerte")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Tunisia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.AfricanCountry()
