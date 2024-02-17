package geotrainer.models.countries

import geotrainer.models.*
import kotlinx.serialization.Serializable

@Serializable
data class France(
    override val name: String = "France",
    override val capitalCities: List<String> = listOf("Paris"),
    override val isPartOfEuropeanUnion: Boolean = true,
    override val drivingSide: DrivingSide = DrivingSide.Right,
    override val currency: Currency = Currency.Euro,
    override val domain: Domain = Domain.France,
    override val majorCities: List<City> = listOf(
        City("Marseille"),
        City("Lyon"),
        City("Toulouse"),
        City("Nice"),
        City("Nantes"),
        City("Strasbourg"),
        City("Montpellier"),
        City("Bordeaux"),
        City("Lille"),
        City("Rennes"),
        City("Reims"),
        City("Le Havre"),
        City("Saint-Étienne"),
        City("Grenoble"),
        City("Dijon"),
        City("Angers"),
        City("Nîmes"),
        City("Le Mans"),
        City("Aix-en-Provence"),
        City("Clermont-Ferrand"),
        City("Brest"),
        City("Limoges"),
        City("Amiens"),
        City("Tours"),
        City("Metz"),
    ),
    override val carPlates: List<String> = listOf("TODO"),
    override val bollards: List<String> = listOf("TODO"),
    override val phoneDialingCodes: List<PhoneDialingCode> = listOf(PhoneDialingCode.France),

    override val cameraGenerations: List<CameraGeneration> = listOf(
        CameraGeneration.Gen1,
        CameraGeneration.Gen2,
        CameraGeneration.Gen3,
        CameraGeneration.Gen4,
        CameraGeneration.Trekker
    ),

    override val roadLines: List<RoadLines> = listOf(
        RoadLines.WhiteSideWhiteMiddle,
    ),
) : Country.EuropeanCountry()
