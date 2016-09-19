package hometask.mastermind

import hometask.solutions.version2.ALPHABET
import hometask.solutions.version2.WORD_LENGTH
import java.util.*

fun generateSecret(differentLetters: Boolean = false): String {
    val chars = ALPHABET.toMutableList()
    val random = Random()
    return buildString {
        for (i in 1..WORD_LENGTH) {
            val letter = chars[random.nextInt(chars.size)]
            append(letter)
            if (differentLetters) {
                chars.remove(letter)
            }
        }
    }
}