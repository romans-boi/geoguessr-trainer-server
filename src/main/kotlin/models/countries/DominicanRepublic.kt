
package models.countries

import models.Currency
import models.Domain

data object DominicanRepublic: Country {
    override val name = "Dominican Republic"
    override val capitalCities = listOf("Santo Domingo")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.DominicanPeso
    override val domain = Domain.DominicanRepublic

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}