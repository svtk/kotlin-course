package _3ExtensionsOnCollections

// Подробные комментарии про синтаксис лямбд и семантику функций будут в домашнем задании.

// Пока важно понимать, что все эти функции (filter, map, all, groupBy etc.) объявлены как extension-функции на коллекциях.
// Можно снавигироваться по ним и посмотреть.

data class Person(val name: String, val age: Int)

fun example(people: List<Person>) {
    people.filter { person -> person.age >= 21 }
    people.filter { it.age >= 21 }.map { it.name }
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 20), Person("Bob", 30))
    println(people.asSequence().filter { it.age >= 21 })

    println(people.maxBy { it.age })

    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))

    println(people.groupBy { it.age })

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    println("abca".count { it == 'a'})

    val positions = "AACF".zip("ABCD").count { it.first == it.second } //2
}