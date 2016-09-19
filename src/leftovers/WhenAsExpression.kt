package leftovers

import leftovers.Colour.*

enum class Colour {
    BLUE, ORANGE, RED
}

fun updateWeather(
        celsiusDegrees: Double
) {
    val description: String
    val colour: Colour
    when (celsiusDegrees) {
        in Int.MIN_VALUE..0 -> {
            description = "cold"
            colour = BLUE
        }
        in 0..15 -> {
            description = "mild"
            colour = ORANGE
        }
        else -> {
            description = "hot"
            colour = RED
        }
    }
    println("Description: $description, colour: $colour")
}

fun getDescriptionAndColour(celsiusDegrees: Double) =
        when {
            celsiusDegrees < 0 -> Pair("cold", BLUE)
            celsiusDegrees in 0..15 -> "mild" to ORANGE
            else -> "hot" to RED
        }

fun main(args: Array<String>) {
    val (description, colour) = getDescriptionAndColour(12.5)
    println("Description: $description, colour: $colour")
}