package _2Reified

inline fun <reified T> foo(t: T) {
//    bar(t)
}

fun <T> bar(t: T) {
//    foo(t)
}