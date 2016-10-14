package _5MoreAboutOperationsOnCollections

inline fun <T> max(i1: T, i2: T, selector: (T) -> Int): T {
    val v1 = selector(i1)
    val v2 = selector(i2)
    return if (v1 >= v2) i1 else i2
}
data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val p1 = Person("Alice", 29)
    val p2 = Person("Bob", 21)

    val m = max(p1, p2, { it.age })

    // Функция max инлайнится.
    // Код, генерируемый компилятором:
//    val i1 = p1
//    val i2 = p2
//    val v1 = i1.age
//    val v2 = i2.age
//    val m = if (v1 >= v2) i1 else i2
}