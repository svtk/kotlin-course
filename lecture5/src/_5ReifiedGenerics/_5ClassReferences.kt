package _5ReifiedGenerics

import java.util.*

class Service

inline fun <reified T: Any> loadService() =
    ServiceLoader.load(T::class.java)

fun main(args: Array<String>) {

    ServiceLoader.load(Service::class.java)
    loadService<Service>()
}
