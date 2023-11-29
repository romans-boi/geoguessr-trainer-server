package geotrainer.models

import kotlinx.serialization.Serializable

@Serializable
sealed interface Continent {
    @Serializable
    data object Africa: Continent

    @Serializable
    data object Asia: Continent

    @Serializable
    data object NorthAmerica: Continent

    @Serializable
    data object Oceania: Continent

    @Serializable
    data object SouthAmerica: Continent

    @Serializable
    data class Europe(val isPartOfEuropeanUnion: Boolean): Continent
}