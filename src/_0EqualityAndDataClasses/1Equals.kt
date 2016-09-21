package _0EqualityAndDataClasses

fun main(args: Array<String>) {
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(1, 2, 3)

    // проверяет равенство ссылок
    println(set1 === set2)

    // вызывает equals
    println(set1 == set2)
}