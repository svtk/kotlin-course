package leftovers

interface Expr
class Num(val value : Int) : Expr
class Sum(val left : Expr, val right : Expr) : Expr

fun eval(e : Expr) : Int {
    return if (e is Num) {
        val n = e
        n.value
    }

    else if (e is Sum)
        eval(e.left) + eval(e.right)

    else
        throw IllegalArgumentException("Unknown expression")
}

fun evalWhen(e : Expr) : Int =
        when (e) {
            is Num -> e.value
            is Sum -> evalWhen(e.left) + evalWhen(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args : Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
}