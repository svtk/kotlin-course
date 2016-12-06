package questions

import java.util.*

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val list = listOf(Person("Alice", 21), Person("Bob", 25))
    println(list.associateBy(Person::name))
    // {Alice=Person(name=Alice, age=21), Bob=Person(name=Bob, age=25)}
}

// Допишите реализацию функции associateBy. Пример использования представлен ниже.

/*
 * Returns a [Map] containing the elements from the given collection indexed by the key
 * returned from [keySelector] function applied to each element.
 * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
 */
inline fun <T, K> Iterable<T>.associateBy(keySelector: (T) -> K): Map<K, T> {
    val destination = LinkedHashMap<K, T>()
    for (element in this) {
        destination.put(keySelector(element), element)
    }
    return destination
}
