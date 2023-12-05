package geotrainer.utils

interface RandomHelper {
    fun <T> random(list: List<T>): T
    fun <T> randomOrNull(list: List<T>?): T?
    fun <T> shuffle(list: List<T>): List<T>
}