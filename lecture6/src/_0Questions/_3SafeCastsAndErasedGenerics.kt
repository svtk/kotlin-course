package _0Questions

fun <T> foo(c: Collection<T>) {
    println(c as List<String>)
}

fun main(args: Array<String>) {
    // В каких из случаев ниже будет брошено исключение ClassCastException?

    foo(listOf("a", "b", "c"))
    foo(listOf(1, 2, 3))
    foo(setOf("a", "b", "c"))
    // ClassCastException: java.util.LinkedHashSet cannot be cast to java.util.List
}