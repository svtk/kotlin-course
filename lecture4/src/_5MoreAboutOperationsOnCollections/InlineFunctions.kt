package _5MoreAboutOperationsOnCollections

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)

    list.filter { it % 2 == 1 }                 // [1, 3, 5]
    // this method is inlined

    list.filter { it % 2 == 1 }.map { it * 2 }  // [1, 9 25]
    // eager evaluation
    // intermediate collection is created
}

inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val destination = arrayListOf<T>()
    for (element in this) if (predicate(element)) destination.add(element)
    return destination
}