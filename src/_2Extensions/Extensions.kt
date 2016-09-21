// можно специфицировать имя класса, в котором будут жить функции и проперти, объявленные на уровне пакета
//@file:JvmName("StringUtil")
package _2Extensions

fun String.lastChar() =
        this.get(this.length - 1)

// 'this' можно опустить
fun String.lastChar1() =
        get(length - 1)

fun test() {
    // можно вызвать из completion
    "abc".lastChar()
}