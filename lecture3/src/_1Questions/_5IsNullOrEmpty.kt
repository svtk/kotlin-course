package _1Questions

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    println(s1.isNullOrEmpty() && s2.isNullOrEmpty())     // true
}

fun String?.isNullOrEmpty(): Boolean =
        this == null || this.isEmpty()