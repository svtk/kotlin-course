package _1ClassDeclaration

// primary constructor parameters
class Foo1(_i: Int) {
    val i: Int

    // primary constructor body
    init {
        this.i = _i
    }
}

class Foo2(val i: Int)

class Foo3 {
    var prop1 = 0
    val prop2 = arrayListOf<String>()
}

// secondary constructors
class Foo4 {
    constructor(i: Int)
    constructor(s: String)
}