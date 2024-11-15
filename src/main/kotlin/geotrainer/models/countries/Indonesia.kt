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
data class Indonesia(
    override val name: String = "Indonesia",
    override val capitalCities: List<City> = listOf(City("Jakarta")),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Rupiah,
    override val domain: Domain = Domain.Indonesia,
    override val majorCities: List<City> = listOf(
        City("Surabaya"),
        City("Bandung"),
        City("Medan"),
        City("Semarang"),
        City("Tangerang"),
        City("Depok"),
        City("Palembang"),
        City("Makassar"),
        City("Batam"),
        City("Bekasi"),
        City("Pekanbaru"),
        City("Balikpapan"),
        City("Bogor"),
        City("Yogyakarta")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Indonesia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.AsianCountry()
