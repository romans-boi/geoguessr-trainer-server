package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Ecuador(
    override val name: String = "Ecuador",
    override val capitalCities: List<String> = listOf("Quito"),
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
