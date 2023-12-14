package geotrainer.models

import kotlinx.serialization.Serializable

@Serializable
sealed class CarType {
    abstract val imageUrl: Url?

    data class Standard(
        val metas: Set<CarMeta>,
        override val imageUrl: Url?
    ): CarType()

    data class Special(
        override val imageUrl: Url
    ): CarType()
}

enum class CarMeta {
    AntennaLong,
    AntennaShortStubby,

    RoofRackBlackRubberInlay,
    RoofRackStandard,
    RoofRackBlackTape,
    RoofCampingGear,

    FrontVisible,
    FrontMirrors,
    FrontSnorkel,

    ColorWhite,
    ColorBlack,
    ColorBlue,
    ColorRed,

}