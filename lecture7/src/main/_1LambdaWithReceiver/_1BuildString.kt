package _1LambdaWithReceiver

fun main(args: Array<String>) {
    val s = buildString1 {
        for (i in 1..9) {
            it.append(i)
        }
        it.append('!')
    }
    println(s)
}

fun buildString1(
        builderAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun buildString2(
        builderAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}
