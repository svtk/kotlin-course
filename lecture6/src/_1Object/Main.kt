package _1Object

fun main(args: Array<String>) {
    // java
    JSingleton::class
    println("========")
    JSingleton.INSTANCE.foo()

    println()

    // kotlin
    KSingleton::class
    println("========")
    KSingleton.foo()
}