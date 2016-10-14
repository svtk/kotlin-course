package _5MoreAboutOperationsOnCollections

// Eager and lazy evaluation

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)

    list.map { print("m$it "); it * it }
            .filter { print("f$it "); it % 2 == 0 }

    println()

    list.asSequence() // stream
            .map { print("m$it "); it * it }
            .filter { print("f$it "); it % 2 == 0 }
            .toList()

    println()
    list.asSequence()
            .map { print("m$it "); it * it }
            .filter { print("f$it "); it % 2 == 0 }

    println()
    list.asSequence()
            .filter { print("f$it "); it % 2 == 0 }
            .map { print("m$it "); it * it }
            .toList()

}