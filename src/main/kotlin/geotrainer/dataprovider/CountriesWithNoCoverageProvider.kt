package geotrainer.dataprovider

interface CountriesWithNoCoverageProvider {
    // Not an exhaustive list of countries with no coverage, but enough to give good options in quizzes
    fun getCountriesWithNoCoverage(): List<String>
}

class CountriesWithNoCoverageProviderImpl : CountriesWithNoCoverageProvider {
    override fun getCountriesWithNoCoverage() = listOf(
        "Honduras",
        "Belize",
        "Nicaragua",
        "El Salvador",
        "Cuba",
        "Jamaica",
        "Cayman Islands",
        "The Bahamas",
        "Haiti",
        "Barbados",
        "Saint Lucia",
        "Saint Vincent and the Grenadines",
        "Grenada",
        "Trinidad and Tobago",
        "Venezuela",
        "Guyana",
        "Suriname",
        "Paraguay",
        "Bosnia and Herzegovina",
        "Kosovo",
        "Moldova",
        "Georgia",
        "Cyprus",
        "Kazakhstan",
        "Uzbekistan",
        "Turkmenistan",
        "Tajikistan",
        "Oman",
        "Yemen",
        "Saudi Arabia",
        "Syria",
        "Iran",
        "Seychelles",
        "Namibia",
        "Mozambique",
        "Zimbabwe",
        "Malawi",
        "Angola",
        "Burundi",
        "Democratic Republic of the Congo",
        "Republic of Congo",
        "Gabon",
        "Cameroon",
        "Central African Republic",
        "Sudan",
        "South Sudan",
        "Ethiopia",
        "Somalia",
        "Niger",
        "Chad",
        "Liberia",
        "Guinea",
        "Morocco",
        "Algeria",
        "Libya",
        "Myanmar",
        "Papua New Guinea",
        "Fiji"
    )
}