package controlStructures

import java.util.*

fun iteratingOverMap() {
    val binaryReps = HashMap<Int, String>()

    for (i in 1..10) {
        binaryReps[i] = Integer.toBinaryString(i)
    }

    for ((number, binary) in binaryReps) {
        println("$number = $binary")
    }
}

fun main(args: Array<String>) {
    iteratingOverMap()

    for ((index, element) in listOf("a", "b", "c").withIndex()) {
        println("$index $element")
    }
}