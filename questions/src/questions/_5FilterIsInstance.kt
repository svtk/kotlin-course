package questions

import java.util.*


fun main(args: Array<String>) {
    listOf(Cat()).getCatsOnly()
}

open class Animal
class Cat: Animal()

// Напишите код на Kotlin, эквивалентный тому байткоду,
// который сгенерирует Kotlin компилятор вместо вызова функции filterInInstance (объявление функции приведено ниже).
fun List<Animal>.getCatsOnly(): List<Cat> {
    return filterIsInstance<Cat>()
}

fun List<Animal>.getCatsOnlyBytecode(): List<Cat> {
    val destination = ArrayList<Cat>()
    for (element in this) if (element is Cat) destination.add(element)
    return destination
}

inline fun <reified R> Iterable<*>.filterIsInstance(): List<R> {
    return filterIsInstanceTo(ArrayList<R>())
}

inline fun <reified R, C : MutableCollection<in R>> Iterable<*>.filterIsInstanceTo(destination: C): C {
    for (element in this) if (element is R) destination.add(element)
    return destination
}

// ---------- 6 ----------

// Если убрать ключевое слово reified из объявления функции filterIsInstance
// (при этом функция filterIsInstanceTo остается без изменений), будет ли она компилироваться и почему?

// Нет. Функция filterIsInstance вызывает функцию filterIsInstanceTo,
// которая требует информацию про типовые аргументы, т.к. сохраняет ее.
// Если мы стираем эту информацию в filterIsInstance (убирая слово reified),
// то вызову filterIsInstanceTo неоткуда будет ее взять.

// ---------- 7 ----------

// Можно ли вызвать функцию filterIsInstance из Java? (Если нет, то почему?)

// Нет. Обычную inline функцию можно вызвать из Java (она не заинлайниться, но вызвать можно).
// Однако inline функцию с reified дженериками вызвать нельзя,
// т.к. для ее выполнения нужно дополнительно сохранять информацию про типовые аргументы,
// и это уже умеет делать только компилятор Kotlin.