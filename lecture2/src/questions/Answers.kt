package questions

import java.util.*

// task1, task2
// Код на Котлине комплируется в Java байт-код.
// В Идее есть экшн "Show Kotlin bytecode" (Help -> Find Action -> напечатать "Show Kotlin bytecode").
// Он показывает байткод, который генерится по данному Kotlin коду.
// Чтобы посмотреть байткод для Java кода, можете вызвать экшн "Show bytecode" (только не забудьте скомпилировать ваш проект).
// Например, можете сравнить сигнатуры:

fun foo(strings: Array<String>) {
    // ... и
    JavaCode.foo(strings)
}


fun task3() {
    var string = 1
    // тип у переменной Int
//    string = "a"
}

fun task4() {
    val languages = listOf("Java")
    // список read-only
//    languages.add("Kotlin")
}

fun task5() {
    // функция task5 компилируется в статическую функцию в классе AnswersKt (по имени файла).
}

fun task6() {
    println("Kotlin" in "Java".."Scala")           // true
    println("Kotlin" in setOf("Java", "Scala"))    // false
}

fun task7() {
    fun isNotDigit(c: Char) = c !in '0'..'9'

    // см. функцию
    JavaCode.isNotDigit('x')
}

fun task8() {
//    for (char c = '0'; c < '9'; c++) {
//        System.out.println(c);
//    }

    for (c in '0' until '9') {
        println(c)
    }

}

// task9
class Person(val name: String, var age: Int)
// 3 метода: getName, getAge, setAge
// 1 конструктор


// task10

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