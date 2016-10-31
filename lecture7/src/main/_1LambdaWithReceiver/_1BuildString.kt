package _1LambdaWithReceiver

fun String.lastChar() = get(length - 1)

fun main(args: Array<String>) {
    val stringBuilder = StringBuilder()

    for (i in 1..9) {
        stringBuilder.append(i)
    }
    stringBuilder.append('!')

    with (stringBuilder) {
        for (i in 1..9) {
            append(i)
        }
        append('!')
    }

    val result = stringBuilder.toString()

    val s = buildString2 {
        for (i in 1..9) {
            append(i)
        }
        append('!')
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
