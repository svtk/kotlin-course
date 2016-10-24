package _5ReifiedGenerics

val list1: List<String> = listOf("a", "b")
val list2: List<Int> = listOf(1, 2, 3)

fun main(args: Array<String>) {
    foo(list1)
    foo(list2)
}

fun <T> foo(list: Collection<T>) {
    // generics are erased
//    if (list is List<String>) {
//    }
    if (list is List<*>) {}
}
