package hometask.solutions.version1

import hometask.mastermind.*

val WORD_LENGTH = 4
val ALPHABET = "ABCDEF"

fun playMastermind(
        secret: String = generateSecret(),
        player: Player = RealPlayer()
) {
    var complete: Boolean
    do {
        val guess = player.guess()
        val (positions, letters) = evaluateGuess(secret, guess)
        complete = positions == WORD_LENGTH
        player.receiveEvaluation(complete, positions, letters)
    } while (!complete)
}

fun evaluateGuess(secret: String, guess: String): Pair<Int, Int> {

    val positions = secret.zip(guess).count { it.first == it.second }
    val commonDigits = 0 //todo

    return Pair(positions, commonDigits - positions)
}