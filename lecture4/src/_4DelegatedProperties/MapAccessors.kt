package _4DelegatedProperties

import kotlin.reflect.KProperty

operator fun <V, V1: V> Map<in String, V>.getValue(thisRef: Any?, property: KProperty<*>): V1
        = this[property.name] as V1


/*operator fun <V> MutableMap<in String, in V>.getValue(thisRef: Any?, property: KProperty<*>): V
        = this[property.name] as V

operator fun <V> MutableMap<in String, in V>.setValue(thisRef: Any?, property: KProperty<*>, value: V) {
    this[property.name] = value
}*/

