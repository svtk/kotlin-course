package _5MoreAboutOperationsOnCollections

// Eager and lazy evaluation

fun main(args: Array<String>) {
   val list = listOf(1, 2, 3, 4, 5)

    list.map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }

    println()

    list.asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .sum()

    println()

    list.asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }

    println()

    list.asSequence()
            .filter { print("filter($it) "); it % 2 == 0 }
            .map { print("map($it) "); it * it }
            .toList()

}