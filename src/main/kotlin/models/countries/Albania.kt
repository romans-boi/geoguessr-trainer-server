
package models.countries

import models.Currency
import models.Domain

data object Albania: Country {
    override val name = "Albania"
    override val capitalCities = listOf("Tirane")
    override val continent = Continent.Europe(isPartOfEuropeanUnion = false)
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.Lek
    override val domain = Domain.Albania

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}