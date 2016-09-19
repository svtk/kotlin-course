package _0EqualityAndDataClasses

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person1 = Person("Alice", 21)
    val person2 = Person("Alice", 21)
    println(person1)
    println(person1 == person2)
}