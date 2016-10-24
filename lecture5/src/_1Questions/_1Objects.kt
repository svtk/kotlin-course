package _1Questions.objects

// Напишите все строки, в которых компилятор выдаст ошибку.
class A {
    fun foo() {}

    inner class B {
        fun b() = this@A.foo()
    }

/*
    class C {
        fun c() = this@A.foo()
    }

    inner object D {
        fun d() = this@A.foo()
    }

    object E {
        fun e() = this@A.foo()
    }
*/
}