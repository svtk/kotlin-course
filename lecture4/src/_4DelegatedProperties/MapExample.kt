package _4DelegatedProperties

class Person1 {
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    // по конвенции вызываются библиотечные методы, похожие на объявления в MapAccessors.kt
    val name: String by _attributes
}

fun main(args: Array<String>) {
    val p = Person1()
    val data = mapOf("name" to "Alice", "phoneNumber" to "1234567")
    for ((attrName, value) in data) {
        p.setAttribute(attrName, value)
    }
    println(p.name)
}