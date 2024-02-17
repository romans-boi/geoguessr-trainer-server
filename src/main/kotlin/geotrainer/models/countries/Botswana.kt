package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Botswana(
    override val name: String = "Botswana",
    override val capitalCities: List<String> = listOf("Gaborone"),
    override val drivingSide: DrivingSide = DrivingSide.Left,
    override val currency: Currency = Currency.Pula,
    override val domain: Domain = Domain.Botswana,
    override val majorCities: List<City> = listOf(
        City("Francistown"),
        City("Molepolole"),
        City("Serowe"),
        City("Selibe Phikwe"),
        City("Maun"),
        City("Kanye"),
        City("Mahalapye"),
        City("Mosopa"),
        City("Mogoditshane"),
        City("Mochudi")
    )
    ,
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Botswana),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.YellowSideWhiteMiddle
    ),

): Country.AfricanCountry()
