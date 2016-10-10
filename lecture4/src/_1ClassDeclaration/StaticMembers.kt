package _1ClassDeclaration

interface Factory<T> {
    fun create(): T
}

class A {
    companion object : Factory<A> {
        override fun create(): A {
            return A()
        }

        @JvmStatic
        fun staticFunction() {}
    }
}

fun bar() {}