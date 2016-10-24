package _1Questions

// Исправьте ошибку в некомпилирующемся коде ниже

class A {
    class B
    inner class C {
//        fun B.foo() = listOf(this@A, this@B, this@C)
        fun B.foo() = listOf(this@A, this, this@C)
    }
}