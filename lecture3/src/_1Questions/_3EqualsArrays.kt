package _1Questions

fun main(args: Array<String>) {

    // никакой специальной оптимизации для сравнения массивов нет

    println(arrayOf(1, 2) == arrayOf(1, 2)) // false

    println(listOf(1, 2) == listOf(1, 2)) // true
}