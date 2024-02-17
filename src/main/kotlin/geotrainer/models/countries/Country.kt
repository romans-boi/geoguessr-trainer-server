package geotrainer.models.countries

import geotrainer.models.*

sealed interface Country {
    val name: String
    val capitalCities: List<String>?
    val continent: Continent
    val drivingSide: DrivingSide
    val currency: Currency
    val domain: Domain
    val phoneDialingCodes: List<PhoneDialingCode>?

    val majorCities: List<City>

    // TODO change this to URL
    val carPlates: List<String>?

    // TODO change this to URL
    val bollards: List<String>?

    val cameraGenerations: List<CameraGeneration>

    val roadLines: List<RoadLines>?

    sealed class AfricanCountry : Country {
        final override val continent: Continent = Continent.Africa

        companion object {
            fun getAllAfricanCountries(): List<AfricanCountry> = listOf(
                Eswatini(),
                Botswana(),
                Egypt(),
                Ghana(),
                Kenya(),
                Lesotho(),
                Nigeria(),
                Rwanda(),
                Senegal(),
                SouthAfrica(),
                Tunisia(),
                Uganda()
            )
        }
    }

    sealed class AsianCountry : Country {
        final override val continent: Continent = Continent.Asia

        companion object {
            fun getAllAsianCountries(): List<AsianCountry> = listOf(
                Bhutan(),
                Bangladesh(),
                Cambodia(),
                China(),
                HongKong(),
                India(),
                Indonesia(),
                Israel(),
                Japan(),
                Jordan(),
                Kyrgyzstan(),
                Laos(),
                Malaysia(),
                Mongolia(),
                Nepal(),
                Pakistan(),
                Philippines(),
                Singapore(),
                SouthKorea(),
                SriLanka(),
                Taiwan(),
                Thailand(),
                Turkey(),
                UnitedArabEmirates(),
            )
        }
    }

    sealed class NorthAmericanCountry : Country {
        final override val continent: Continent = Continent.NorthAmerica

        companion object {
            fun getAllNorthAmericanCountries(): List<NorthAmericanCountry> = listOf(
                Bermuda(),
                Canada(),
                DominicanRepublic(),
                Greenland(),
                Guatemala(),
                Mexico(),
                PuertoRico(),
                UnitedStates()
            )
        }
    }

    sealed class SouthAmericanCountry : Country {
        final override val continent: Continent = Continent.SouthAmerica

        companion object {
            fun getAllSouthAmericanCountries(): List<SouthAmericanCountry> = listOf(
                Argentina(),
                Bolivia(),
                Brazil(),
                Chile(),
                Colombia(),
                Ecuador(),
                Peru(),
                Uruguay()
            )
        }
    }

    sealed class OceanianCountry : Country {
        final override val continent: Continent = Continent.Oceania

        companion object {
            fun getAllOceanianCountries(): List<OceanianCountry> = listOf(
                Australia(),
                NewZealand(),
                NorthMarianaIslands()
            )
        }
    }

    sealed class EuropeanCountry : Country {
        abstract val isPartOfEuropeanUnion: Boolean
        final override val continent: Continent = Continent.Europe

        companion object {
            fun getAllEuropeanCountries(): List<EuropeanCountry> = listOf(
                Albania(),
                Andorra(),
                Austria(),
                Belgium(),
                Bulgaria(),
                Croatia(),
                Czechia(),
                Denmark(),
                Estonia(),
                FaroeIslands(),
                Finland(),
                France(),
                Germany(),
                Greece(),
                Hungary(),
                Iceland(),
                Ireland(),
                Italy(),
                Latvia(),
                Lithuania(),
                Luxembourg(),
                Montenegro(),
                Netherlands(),
                NorthMacedonia(),
                Norway(),
                Poland(),
                Portugal(),
                Romania(),
                Russia(),
                Serbia(),
                Slovakia(),
                Slovenia(),
                Spain(),
                Sweden(),
                Switzerland(),
                Ukraine(),
                UnitedKingdom()
            )
        }
    }

    companion object {
        val allCountries = AfricanCountry.getAllAfricanCountries() +
            AsianCountry.getAllAsianCountries() +
            SouthAmericanCountry.getAllSouthAmericanCountries() +
            NorthAmericanCountry.getAllNorthAmericanCountries() +
            OceanianCountry.getAllOceanianCountries() +
            EuropeanCountry.getAllEuropeanCountries()
    }
}

fun main() {
    //    val quizGen = QuizGeneratorImpl(
    //        questionFactoryProvider = QuestionFactoryProviderImpl(
    //            randomHelper = RandomHelperImpl(),
    //            countryProvider = CountryProvider { Country.allCountries }
    //        )
    //    )
    //
    //    quizGen.generateDomainNamesQuiz(Continent.Europe, 50, 4).map {
    //        println("========= Question ========")
    //        println("${it.question}")
    //        println("Options: ${it.options}")
    //        println("Answer: ${it.correctAnswer}")
    //    }

    Country.allCountries.map {
        println(it.name + ": ")
    }
}
