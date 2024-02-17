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
data class Ecuador(
    override val name: String = "Ecuador",
    override val capitalCities: List<City> = listOf(City("Quito")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Dollar,
    override val domain: Domain = Domain.Ecuador,
    override val majorCities: List<City> = listOf(
        City("Guayaquil"),
        City("Cuenca"),
        City("Santo Domingo de los Colorados"),
        City("Machala"),
        City("Durán"),
        City("Manta"),
        City("Portoviejo"),
        City("Loja"),
        City("Ambato"),
        City("Milagro"),
        City("Ibarra"),
        City("Quevedo"),
        City("Riobamba"),
        City("Esmeraldas")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Ecuador),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle
    ),
) : Country.SouthAmericanCountry()
