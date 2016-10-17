package _5MoreAboutOperationsOnCollections

import java.util.*

fun main(args: Array<String>) {
    val list = listOf(2, -1, 1, 0)

    // Напишите код на Kotlin, эквивалентный тому байткоду,
    // который сгенерирует Kotlin компилятор вместо вызова функции 'filter'
    // (объявление функции приведено ниже).
    val result = list.filter { it > 0 }

    /*
    result = filterTo(ArrayList<T>(), { it > 0 })

    =========
    val destination = ArrayList<T>()
    for (element in this) {
        if (element > 0) destination.add(element)
    }
    result = destination
    */
}

inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    return filterTo(ArrayList<T>(), predicate)
}

inline fun <T, C : MutableCollection<T>>
        Iterable<T>.filterTo(destination: C, predicate: (T) -> Boolean): C {
    for (element in this) {
        if (predicate(element)) destination.add(element)
    }
    return destination
}
