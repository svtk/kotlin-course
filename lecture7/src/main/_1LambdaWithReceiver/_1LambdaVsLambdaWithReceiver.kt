package _1LambdaWithReceiver

fun main(args: Array<String>) {
    // regular lambda
    val sum = { x: Int, y: Int ->
        x + y
    }

    // lambda with receiver
    val appendExcl: StringBuilder.() -> Unit = {
        this.append("!")
    }

    // lambda with receiver with non-empty list of parameters
    val appendTwice: StringBuilder.(Char) -> Unit = {
        append("$it$it")
    }

    println(sum(1, 2))
    val sb = StringBuilder()
    sb.appendExcl()
    sb.appendTwice('1')
    println(sb) //!11
}