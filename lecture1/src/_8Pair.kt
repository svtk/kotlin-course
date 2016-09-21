package pair

// Pair - просто класс стандартной библиотеки
fun functionReturningPair() = Pair(42, "answer")

fun main(args: Array<String>) {
    // можно сразу присваивать двум переменным
    val (i, s) = functionReturningPair()
    println(i)
}