package questions

// Реализуйте функцию foo на Java, так, чтобы
// функция unsafe компилировалась, но при этом при ее выполнении вылетало исключение NullPointerException.
// Функция safe при этом не должна кидать NPE.

fun unsafe() = _8JavaClass.foo() + 1

fun safe() = _8JavaClass.foo()?.let { it + 1 }

fun main(args: Array<String>) {
    println(unsafe())
    println(safe())
}