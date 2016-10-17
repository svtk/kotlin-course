package _1Questions

class Email { /*...*/ }

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String) {
//    val emails by lazy { loadEmails(this) }

    private val lazyEmails = LazyProperty { loadEmails(this)}
    val emails: List<Email>
        get() = lazyEmails.getValue()
}

// Напишите реализацию класса LazyProperty так,
// чтобы можно было создать LazyProperty любого типа и получить его значение через метод getValue.

class LazyProperty<T>(val initializer: () -> T) {
    private var value: T? = null

    fun getValue(): T {
        if (value == null) {
            value = initializer()
        }
        return value!!
    }
}

fun main(args: Array<String>) {
    val p = Person("Alice")
    println("---")
    p.emails
    println("---")
    p.emails
}