package _0EqualityAndDataClasses

// Добавление модификатора data заставляет компилятор сгенерировать полезные методы,
// такие как equals, hashCode, toString.
data class Person(
        val name: String,
        val age: Int)

// Можно убрать data и посмотреть, что поменяется.
fun main(args: Array<String>) {
    val person1 = Person("Alice", 21)
    val person2 = Person("Alice", 21)
    println(person1)
    println(person1 == person2)
}