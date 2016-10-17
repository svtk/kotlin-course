package _1Questions.extensions

// Напишите реализацию member extension функций record & unaryPlus,
// чтобы код внизу компилировался.

class Words {
    private val list = mutableListOf<String>()

    fun String.record() {
        list += this
    }

    operator fun String.unaryPlus() {
        this.record()
    }

    override fun toString() = list.toString()
}

fun main(args: Array<String>) {
    val words = Words()
    with(words) {
        "one".record()
        + "two"
    }
    println(words)
}

