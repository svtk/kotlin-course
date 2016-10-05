package _1Questions

fun eq1(s1: String?, s2: String?): Boolean {
    return s1 == s2
}

fun eq2(s1: String?, s2: String?): Boolean =
        if (s1 === null) s2 === null else s1.equals(s2)

fun eq3(s1: String?, s2: String?): Boolean =
        s1?.equals(s2) ?: (s2 === null)

fun main(args: Array<String>) {
    eq1("abc", "abc")  // true
    eq1(null, "abc")   // false
    eq1("abc", null)   // false
    eq1(null, null)    // true
}