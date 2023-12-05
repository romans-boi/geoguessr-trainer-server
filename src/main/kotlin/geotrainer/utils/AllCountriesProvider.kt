package geotrainer.utils

import geotrainer.models.countries.Country

interface CountryProvider {
    fun getAllCountries(): List<Country>
}