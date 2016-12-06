package questions

// Bonus.
// Завершите объявление класса A, так чтобы во время создания элемента B кидалось NPE.

open class A(open val value: String) {
    val x = value.length
}

class B(override val value: String) : A(value)

fun main(args: Array<String>) {
    B("a")
}