package _1Questions

fun main(args: Array<String>) {
    println(evaluateGuess("BCDF", "ACEB"))
    println(evaluateGuess("AAAF", "ABCA"))
    println(evaluateGuess("ABCA", "AAAF"))
// Evaluation(positions=1, letters=1)
}

data class Evaluation(val positions: Int, val letters: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    val positions = secret.zip(guess).count { it.first == it.second }
//    "BCDF", "ACEB"
//    (B, A), (C, C), (D, E), (F, B)

    val commonLetters = "ABCDEF".sumBy { ch ->
        Math.min(secret.count { it == ch }, guess.count { it == ch })
    }
//    "AAAF", "ABCA"
//    A: min(3, 2)  -> 2

    return Evaluation(positions, commonLetters - positions)
}

