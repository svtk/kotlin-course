package questions

// Реализуйте функцию todo (выписав явно тип возвращаемого значения) так, чтобы
// ее результат можно было присвоить в переменную любого типа.

fun main(args: Array<String>) {
    val i: Int = todo()
    val s: String = todo()
}

fun todo(): Nothing = throw Exception()