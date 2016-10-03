package whenAsExpression

import whenAsExpression.Colour.*

enum class Colour {
    BLUE, ORANGE, RED
}

fun updateWeather(
        celsiusDegrees: Double
) {
    val description: String
    val colour: Colour
    if (celsiusDegrees < 0) {
        description = "cold"
        colour = BLUE
    }
    else if (celsiusDegrees in 0..15) {
        description = "mild"
        colour = ORANGE
    }
    else {
        description = "hot"
        colour = RED
    }
}

fun updateWeather1(celsiusDegrees: Double) {
    val (description, colour) =
            when {
        celsiusDegrees < 0 -> Pair("cold", BLUE)
        celsiusDegrees in 0..15 -> "mild" to ORANGE
        else -> "hot" to RED
    }
}

fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)