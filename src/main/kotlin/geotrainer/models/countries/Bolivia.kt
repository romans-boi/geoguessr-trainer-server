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
data class Bolivia(
    override val name: String = "Bolivia",
    override val capitalCities: List<City> = listOf(City("La Paz (administrative)"), City("Sucre (judicial)")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Boliviano,
    override val domain: Domain = Domain.Bolivia,
    override val majorCities: List<City> = listOf(
        City("Santa Cruz de la Sierra"),
        City("Cochabamba"),
        City("Oruro"),
        City("Tarija"),
        City("Potosí"),
        City("Sacaba"),
        City("Montero"),
        City("Quillacollo"),
        City("Trinidad"),
        City("Riberalta"),
        City("El Alto")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Bolivia),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker,
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),

) : Country.SouthAmericanCountry()
