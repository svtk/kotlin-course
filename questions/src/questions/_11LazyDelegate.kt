package questions

import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    println("before")
    val example = DeepThought {
        println("calculation the answer for 7½ million years...")
        42
    }
    println("start")
    println(example.answer)
    println("after")
    println(example.answer)
}

class DeepThought(calculation: () -> Any?) {
    val answer: Any? by LazyDelegate(calculation)
}


// Реализуйте класс LazyDelegate и метод getValue (без параметров) в этом классе.
// Чтобы не нужно было вспоминать конвенцию, выразим ее через extension метод:
operator fun <T> LazyDelegate<T>.getValue(thisRef: Any?, property: KProperty<*>): T = getValue()

// Пример кода, использующий LazyDelegate, приведен ниже.

// 1.
// Напишете класс так, чтобы правильно обрабатывались нулевые ссылки.
// Т.е. если в примере выше 42 заменить на null, "calculation the answer for 7½ million years..." будет напечатано 1 раз.

// 2.
// Напишите класс LazyDelegate так, чтобы он работал с любыми типами значений, т.е. чтобы можно было написать:

val a: Int by LazyDelegate { 42 }

/*
before
start
calculation the answer for 7½ million years...
42
after
42
*/

class LazyDelegate<T>(val initializer: () -> T) {
    private var isInitialized: Boolean = false
    private var _value: T? = null

    fun getValue(): T {
        if (!isInitialized) {
            _value = initializer()
            isInitialized = true
        }
        return _value as T
    }
}