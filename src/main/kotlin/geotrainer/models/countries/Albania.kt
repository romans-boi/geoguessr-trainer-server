package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Albania(
    override val name: String = "Albania",
    override val capitalCities: List<String> = listOf("Tirana"),
    override val isPartOfEuropeanUnion: Boolean = false,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Lek,
    override val domain: Domain = Domain.Albania,
    override val majorCities: List<City> = listOf(
        City("Durrës"),
        City("Vlorë"),
        City("Shkodër"),
        City("Sarandë"),
        City("Elbasan"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Albania),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
        RoadLines.WhiteSideYellowMiddle
    ),

    ) : Country.EuropeanCountry()
