package geotrainer.utils

import geotrainer.models.countries.Country

fun interface CountryProvider {
    fun getAllCountries(): List<Country>
}
