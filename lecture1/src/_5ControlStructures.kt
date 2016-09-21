package controlStructures

fun whileLoop() {
    fun condition() = true

    while (condition()) {
        /*...​*/
    }

    do {
        /*...​*/
    } while (condition())
}


fun forLoop() {
    val list = listOf(1, 2, 3)
    for (element in list) {
        print(element)
    }

    for (i in 1..9) { // включая границы
        print(i)
    }

    // не включая вторую границу (т.е. то же самое, что 1..9)
    for (i in 1 until 10) {
        print(i)
    }

    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}

fun main(args: Array<String>) {
    forLoop()
}