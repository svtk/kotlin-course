package questions

fun <T, R: T> subtype() {}

open class Parent
class Child: Parent()

// Нарисуйте стрелочки, если соответствующие типы связаны отношением "является подтипом"
// (на рисунке Child является подтипом Parent)

fun main(args: Array<String>) {
    subtype<List<Parent>, List<Child>>()
    subtype<List<Parent?>, List<Child>>()
//    subtype<MutableList<Parent>, MutableList<Child>>()
//    subtype<MutableList<Child?>, MutableList<Child>>()

    // vice versa!
    subtype<(Child) -> Unit, (Parent) -> Unit>()

//    subtype<Parent, Nothing?>()
    subtype<Parent, Nothing>()
    subtype<Parent?, Nothing?>()
    subtype<Parent?, Nothing>()
}