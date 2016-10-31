package _1LambdaWithReceiver

fun buildString3(
        builderAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

fun buildString4(builderAction: StringBuilder.() -> Unit): String =
        StringBuilder().apply(builderAction).toString()