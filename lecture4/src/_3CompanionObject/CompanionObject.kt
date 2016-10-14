package _3CompanionObject

interface Factory<T> {
    fun create(): T
}

// В Java статические методы не могут имплементить методы интерфейсов.
// В Kotlin методы companion object'а могут имплементить методы интерфейсов.
class A {
    private constructor()

    companion object : Factory<A> {
        override fun create(): A {
            return A()
        }

        // Чтобы эти методы были доступны из Java как статические методы класса A,
        // нужна специальная аннотация
        @JvmStatic
        fun staticFunction() {}
    }
}