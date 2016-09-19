package _1Nullability

import java.io.BufferedReader

fun check(percentage: Int) {
    if (percentage !in 0..100) {
        throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $percentage")
    }
}

// try is expression

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number)
}