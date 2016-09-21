package buildString

fun main(args: Array<String>) {
    val s = buildString {
        for (i in 1..9) {
            append(i)
        }
        append('!')
    }
    println(s) //123456789!
}