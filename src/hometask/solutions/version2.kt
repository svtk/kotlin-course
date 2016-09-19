package hometask.solutions.version2

import hometask.mastermind.*

val WORD_LENGTH = 4
val ALPHABET = "ABCDEF"

fun playMastermind(
        secret: String = generateSecret(),
        player: Player = RealPlayer()
) {
    do {
        val guess = player.guess()
        val evaluation = evaluateGuess(secret, guess)
        player.receiveEvaluation(evaluation.complete, evaluation.positions, evaluation.letters)
    } while (!evaluation.complete)
}

data class Evaluation(val positions: Int, val letters: Int) {
    val complete: Boolean
        get() = positions == WORD_LENGTH
}

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val positions = secret.zip(guess).count { it.first == it.second }
    val commonDigits = 0 //todo

    return Evaluation(positions, commonDigits - positions)
}