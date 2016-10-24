package _0Questions

fun main(args: Array<String>) {
    // Объявите переменную i так, чтобы одно из приведений типа ниже кидало исключение, а другое возвращало null.
    val i = ""
    println(i as Int?)
    println(i as? Int)
}