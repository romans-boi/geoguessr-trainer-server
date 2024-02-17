package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Brazil(
    override val name: String = "Brazil",
    override val capitalCities: List<City> = listOf(City("Brasilia")),
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Real,
    override val domain: Domain = Domain.Brazil,
    override val majorCities: List<City> = listOf(
        City("São Paulo"),
        City("Rio de Janeiro"),
        City("Salvador"),
        City("Fortaleza"),
        City("Belo Horizonte"),
        City("Manaus"),
        City("Curitiba"),
        City("Recife"),
        City("Porto Alegre"),
        City("Belém"),
        City("Goiânia"),
        City("Guarulhos"),
        City("Campinas"),
        City("Cuiabà"),
        City("Campo Grande"),
        City("Uberlândia"),
        City("Ribeirao Preto"),
        City("Vitoria"),
        City("Recife"),
        City("Natal"),
        City("Tersina"),
        City("Porto Velho"),
        City("Santarém"),
        City("São Luís")
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String>? = null,
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Brazil),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideYellowMiddle,
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.SouthAmericanCountry()
