package _1LambdaWithReceiver

fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "one")
    with (map) {
        this[2] = "two"
    }
    map.apply { this[3] = "three" }
    map.run { this[4] = "four" }
    println(map)

    // inline!
}
