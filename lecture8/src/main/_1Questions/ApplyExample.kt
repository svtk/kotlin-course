package _1Questions

fun main(args: Array<String>) {
    val s = StringBuilder().apply {
        for (i in 0..9) {
            append(i)
        }
    }.toString()
    println(s) // 0123456789
}

inline fun <T> T.apply(block: T.() -> Unit): T {
    this.block()
    return this
}

// comment about @InlineOnly