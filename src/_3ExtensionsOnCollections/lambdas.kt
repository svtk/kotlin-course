package _3ExtensionsOnCollections

fun sumFun(i: Int, j: Int) = i + j

fun declareLambda() {
    val sumVal: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    sumVal(1, 2)

    performOperation(sumVal)

    performOperation(::sumFun)

    performOperation { i, j -> i + j }
}

fun performOperation(op: (Int, Int) -> Int) {
    println(op(1, 2))
}