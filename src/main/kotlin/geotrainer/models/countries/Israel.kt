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
data class Israel(
    override val name: String = "Israel",
    override val capitalCities: List<City> = listOf(City("Jerusalem")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.NewShekel,
    override val domain: Domain = Domain.Israel,
    override val majorCities: List<City> = listOf(
        City("Tel Aviv"),
        City("Haifa"),
        City("Rishon LeZion"),
        City("Petah Tikva"),
        City("Ashdod"),
        City("Netanya"),
        City("Beersheba"),
        City("Holon"),
        City("Bnei Brak"),
        City("Ramat Gan"),
        City("Ashkelon"),
        City("Herzliya"),
        City("Kfar Saba"),
        City("Modi'in")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Israel),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle
    ),
) : Country.AsianCountry()
