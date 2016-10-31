package _1LambdaWithReceiver

class Component
fun createComponent() = Component()

// Вопрос: как можно упростить код?
class A {
    private var _component: Component? = null
    val component: Component
        get() {
            val component = _component
            if (component != null) return component
            val newComponent = createComponent()
            _component = newComponent
            return newComponent
        }
}

// Ответ #1 (правильный)
class B {
    val component by lazy { createComponent() }
}

// Ответ #2 (на случай, если не хочется использовать делегаты, например, не хочется создавать лямбду)
class С {
    private var _component: Component? = null
    val component: Component
        get() = _component ?: createComponent().apply { _component = this }
}