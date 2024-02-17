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
data class Uganda(
    override val name: String = "Uganda",
    override val capitalCities: List<City> = listOf(City("Kampala")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.UgandanShilling,
    override val domain: Domain = Domain.Uganda,
    override val majorCities: List<City> = listOf(
        City("Gulu"),
        City("Lira"),
        City("Mbarara"),
        City("Jinja"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Uganda),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AfricanCountry()
