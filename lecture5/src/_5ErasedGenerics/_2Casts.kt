package _5ErasedGenerics

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
            ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main(args: Array<String>) {

    printSum(listOf(1, 2, 3))
    // ok

//    printSum(setOf(1, 2, 3))
//    IllegalArgumentException: List is expected

    printSum(listOf("a", "b", "c"))
}