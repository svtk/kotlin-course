package reifiedGenerics.validators

import kotlin.reflect.KClass

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

fun main(args: Array<String>) {
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

    println((validators[String::class] as? FieldValidator<String>)?.validate("Kotlin"))
//    println(validators[Int::class]?.validate(42))
}


object Validators {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> registerValidator(
            kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T>? =
            validators[kClass] as FieldValidator<T>?

    inline fun <reified T: Any> validate(t: T) = get(T::class)!!.validate(t)
}


object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}