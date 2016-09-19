package questions

import java.util.*

val bar1: Int
    get() = Random().nextInt()

val bar2: Int
    get() = count++
var count = 0

fun main(args: Array<String>) {
    println(bar1)
    println(bar1)


    println(bar2)
    println(bar2)
}