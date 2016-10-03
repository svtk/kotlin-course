package _1Questions

class Value(val i: Int) {
    override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other !is Value) return false
        return i == other.i
    }
}

fun main(args: Array<String>) {
    val set = hashSetOf(Value(1))
    println(set.contains(Value(1)))
}