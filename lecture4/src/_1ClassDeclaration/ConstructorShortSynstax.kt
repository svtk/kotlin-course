package _1ClassDeclaration

// primary constructor parameters
class Foo1(_i: Int) {
    val i: Int

    // primary constructor body
    init {
        this.i = _i
    }
}

// эквивалентно декларации Foo1
class Foo2(val i: Int)

class Foo3 {
    // свойства (properties), которым не соответствует параметр конструктора,
    // стоит объявлять внутри тела класса
    var prop1 = 0
    val prop2 = arrayListOf<String>()

    init {
        for (i in 0..10) {
            prop2.add("$i")
        }
    }
}

// secondary constructors
class Foo4 {
    constructor(i: Int)
    constructor(s: String)
}