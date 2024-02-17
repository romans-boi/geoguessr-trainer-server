package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class Bulgaria(
    override val name: String = "Bulgaria",
    override val capitalCities: List<City> = listOf(City("Sofia")),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Lev,
    override val domain: Domain = Domain.Bulgaria,
    override val majorCities: List<City> = listOf(
        City("Plovdiv"),
        City("Varna"),
        City("Burgas"),
        City("Ruse"),
        City("Stara Zagora"),
        City("Pleven"),
        City("Sliven"),
        City("Dobrich"),
        City("Shumen"),
        City("Pernik"),
        City("Haskovo"),
        City("Yambol"),
        City("Pazardzhik"),
        City("Blagoevgrad")
    )
    ,
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.Bulgaria),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
