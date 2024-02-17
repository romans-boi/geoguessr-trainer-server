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
data class Bhutan(
    override val name: String = "Bhutan",
    override val capitalCities: List<City> = listOf(City("Thimphu")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Ngultrum,
    override val domain: Domain = Domain.Bhutan,
    override val majorCities: List<City> = listOf(
        City("Phuntsholing"),
        City("Punakha"),
        City("Trashigang"),
        City("Wangdue Phodrang"),
        City("Paro")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Bhutan),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),

) : Country.AsianCountry()
