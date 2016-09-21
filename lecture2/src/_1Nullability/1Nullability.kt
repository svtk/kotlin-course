package _1Nullability

fun main(args: Array<String>) {

    // разные типы: nullable & не-nullable (not-null)
    // только в переменной nullable типа (с вопросиком) можно хранить null
    val s1: String = "always not null"
    val s2: String? = null

    val i1: Int = s1.length
    // s2.length - нельзя просто разыменовать, ошибка

    // Что можно сделать?
    // можно явно проверить, что != null
    if (s2 != null) s2.length
    // компилятор предлагает упростить:
    s2?.length // если null, ничего не произойдет

    val i2: Int? = if (s2 != null) s2.length else null
    val i3: Int? = s2?.length // если null, вернется null в качестве результата

    val i4: Int? = if (s2 != null) s2.length else 0
    val i5: Int = s2?.length ?: 0 // если null, вернется 0 в качестве результата

    s2!! // явно кинуть NPE, если s2 хранит null
}

fun test1(s: String?) {
    // компилятор замечает return в ветке, когда переменная null или fail() (может только кинуть исключение)
    if (s == null) return
    s.length // можно разыменовывать
}

fun test2(s: String?) {
    // компилятор также замечает, если функция не может нормально завершиться, например fail может только кинуть исключение
    if (s == null) fail()
    s.length // можно разыменовывать
}

fun test3(s: String?) {
    // удобно писать return или fail после ?:
    val i: Int = s?.length ?: fail()
}

// В Котлине можно объявить функцию, которая может завершиться только аварийный образом: кинуть исключение.
// Её тип Nothing нужно явно указать (про Nothing и иерархию типов мы поговорим потом).
fun fail(): Nothing =
  throw UnsupportedOperationException()

// В библиотеке, например, есть функция TODO,
// которая возвращает Nothing
fun notImplemented() { TODO() }