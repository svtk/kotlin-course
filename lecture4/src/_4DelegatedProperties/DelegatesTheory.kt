package _4DelegatedProperties

import kotlin.reflect.KProperty

class Type

class Delegate {
    operator fun getValue(thisRef: Foo, property: KProperty<*>): Type = TODO()
    operator fun setValue(thisRef: Foo, property: KProperty<*>, value: Type) { TODO() }
}

class Foo {
    var p: Type by Delegate()
}

/*
class Foo {
    private val delegate = Delegate()
    var p: Type
        set(value: Type) = delegate.setValue(..., value)
        get() = delegate.getValue(...)
}
*/
