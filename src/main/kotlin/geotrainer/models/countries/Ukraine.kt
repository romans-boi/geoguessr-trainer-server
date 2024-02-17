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
data class Ukraine(
    override val name: String = "Ukraine",
    override val capitalCities: List<City> = listOf(City("Kiev")),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Hryvnia,
    override val domain: Domain = Domain.Ukraine,
    override val majorCities: List<City> = listOf(
        City("Kharkiv"),
        City("Odessa"),
        City("Dnipro"),
        City("Donetsk"),
        City("Zaporizhzhia"),
        City("Lviv"),
        City("Kryvyi Rih"),
        City("Mykolaiv"),
        City("Mariupol")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Ukraine),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
