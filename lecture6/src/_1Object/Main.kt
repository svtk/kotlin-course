package _1Object

// В каком порядке будет напечатано Constructor, === и Foo? (Для случая Java класса и Kotlin object'а)
fun main(args: Array<String>) {
    // java
    JSingleton::class.java
    println("===")
    JSingleton.INSTANCE.foo()

    println()

    // kotlin
    KSingleton::class
    println("===")
    KSingleton.foo()
}