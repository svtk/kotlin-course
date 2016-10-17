package _4ClassDeclarationSyntax

// полный синтаксис: явно объявить параметр конструктора и блок инициализации init
class Foo1(_i: Int) {  // объявляем параметр конструктора
    val i: Int         // объявляем property

    init {             // блок инициализации init - по сути тело конструктора
        this.i = _i    // инициализуем property
    }
}


// краткий синтаксис: добавить val (или var) к параметру конструктора,
// и это автоматически сгенерирует соответствующий property
class Foo2(val i: Int)