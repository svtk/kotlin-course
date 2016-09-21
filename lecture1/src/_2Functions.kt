package functions

fun max(a: Int, b: Int): Int {
    return if (a < b) a else b
}

// краткий синтаксис для функции, возвращающей одно выражение
fun max2(a: Int, b: Int) = if (a < b) a else b

// можно писать значения аргументов по умолчанию
fun sum(a: Int, b: Int, c: Int = 0) = a + b + c

fun use() {
    sum(1, 2)
    sum(1, 2, 3)
    // можно передавать аргументы по имени
    sum(b = 2, a = 1)
}