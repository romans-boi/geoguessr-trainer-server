
package models.countries

import models.Currency

data object Albania: Country {
    override val name = "Albania"
    override val capitalCities = listOf("Tirane")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Lek

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}