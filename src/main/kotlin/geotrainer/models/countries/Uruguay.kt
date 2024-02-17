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
data class Uruguay(
    override val name: String = "Uruguay",
    override val capitalCities: List<City> = listOf(City("Montevideo")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Peso,
    override val domain: Domain = Domain.Uruguay,
    override val majorCities: List<City> = listOf(
        City("Salto"),
        City("Ciudad de la Costa"),
        City("Paysandú"),
        City("Las Piedras"),
        City("Florida"),
        City("Rocha"),
        City("Tacuarembo"),
        City("Melo"),
        City("San Gregorio de Polanco"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Uruguay),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowWhiteMiddle
    ),
) : Country.SouthAmericanCountry()
