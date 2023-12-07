package geotrainer.utils

interface RandomHelper {
    fun <T> random(list: List<T>): T
    fun <T> randomOrNull(list: List<T>?): T?
    fun <T> shuffle(list: List<T>): List<T>
}

object RandomHelperImpl: RandomHelper {
    override fun <T> random(list: List<T>) = list.random()
    override fun <T> randomOrNull(list: List<T>?) = list?.randomOrNull()
    override fun <T> shuffle(list: List<T>) = list.shuffled()
}
