package classes

// скомпилированная версия совпадает с классом javaCode.Person

class Person(val name: String, var age: Int)

fun main(args: Array<String>) {
    // нет слова new, конструктор вызывается как обычная функция
    val person = Person("Alice", 26)

    println(person.name)
}