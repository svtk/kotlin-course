package _2Reified

// Какой из следующих вызовов не будет компилироваться и почему?

inline fun <reified T> foo(t: T) {
//    bar(t)
}

fun <T> bar(t: T) {
//    foo(t)
}