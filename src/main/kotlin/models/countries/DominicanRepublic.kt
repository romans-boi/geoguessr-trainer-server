
package models.countries

import models.Currency

data object DominicanRepublic: Country {
    override val name = "Dominican Republic"
    override val capitalCities = listOf("Santo Domingo")
    override val continent = Continent.NorthAmerica
    override val drivingDirection = DrivingDirection.Right
    override val currency = Currency.DominicanPeso

    override val majorCities = listOf("TODO")
    override val carPlates = listOf("TODO")
    override val bollards = listOf("TODO")
}