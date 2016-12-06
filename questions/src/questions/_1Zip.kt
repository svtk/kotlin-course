package questions

fun main(args: Array<String>) {
    println("abcde" zip "123")  // [(a, 1), (b, 2), (c, 3)]
}

// Допишите реализацию функции zip. Пример использования представлен ниже.

/*
 * Returns a list of pairs built from characters of both strings with same indexes.
 * List has length of shortest string.
 */
infix fun String.zip(other: String): List<Pair<Char, Char>> {
    val result = arrayListOf<Pair<Char, Char>>()
    val length = Math.min(length, other.length)
    for (index in 0 until length) {
        result += (this[index] to other[index])
    }
    return result
}