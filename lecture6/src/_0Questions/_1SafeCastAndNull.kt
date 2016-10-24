package _0Questions

//    as - кидает исключение ClassCastException, если не удалось привести к нужному типу
//    as? - возвращает null, если не удалось привести к нужному типу
//    as Int, as? Int
//    as Int?, as? Int?

fun main(args: Array<String>) {
    // В каких из следующих приведений типа произойдет исключение?
    val i = null
    println(i as Int)
    println(i as Int?)
    println(i as? Int)
}