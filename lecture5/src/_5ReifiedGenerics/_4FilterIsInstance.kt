package _5ReifiedGenerics

fun main(args: Array<String>) {
    val strings = listOf(1, "one", 2.0).filterIsInstance<String>()
    println(strings)
}

inline fun <reified T>
        Iterable<*>.filterIsInstance(): List<T> {

    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}