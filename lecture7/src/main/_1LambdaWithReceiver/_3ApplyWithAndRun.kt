package _1LambdaWithReceiver

fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "one")
    with (map) {
        this[2] = "two"
    }
    map.apply { this[3] = "three" }
    map.run { this[4] = "four" }
    println(map)

}

// the declarations copied from the standard library

inline fun <T, R> with(receiver: T, block: T.() -> R): R =
        receiver.block()

inline fun <T, R> T.run(block: T.() -> R): R = block()

inline fun <T> T.apply(block: T.() -> Unit): T {
    this.block()
    return this
}