@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package sysoev.projects.visualization.plugins

import kotlin.reflect.KProperty

abstract class BasePlugin : Plugin {
    override val section: String? = null

    private val parametersList = mutableListOf<Parameter<*>>()

    val parameters: List<Parameter<*>> = parametersList

    sealed class Parameter<T>(initValue: T, val name: String) {
        var value = initValue
            private set

        operator fun getValue(basePlugin: BasePlugin, property: KProperty<*>): T {
            return value
        }

        fun update(newValue: T): Boolean {
            return checkNewValue(newValue).also { if (it) this.value = newValue }
        }

        open fun checkNewValue(newValue: T): Boolean = true
    }

    abstract class BoundedParameter<T : Comparable<T>>(
        initValue: T,
        name: String,
        val minValue: T? = null,
        val maxValue: T? = null
    ) : Parameter<T>(initValue, name) {
        override fun checkNewValue(newValue: T): Boolean {
            return minValue?.let { min ->
                min <= newValue && maxValue?.let { max -> newValue <= max } ?: true
            } ?: true
        }
    }

    class IntParameter(initValue: Int, name: String, minValue: Int? = null, maxValue: Int? = null) :
        BoundedParameter<Int>(initValue, name, minValue, maxValue)

    class DoubleParameter(initValue: Double, name: String, minValue: Double? = null, maxValue: Double? = null) :
        BoundedParameter<Double>(initValue, name, minValue, maxValue)

    class StringParameter(initValue: String, name: String, minValue: String? = null, maxValue: String? = null) :
        BoundedParameter<String>(initValue, name, minValue, maxValue)

    class EnumParameter<E : Enum<E>>(initValue: E, name: String) :
        Parameter<E>(initValue, name)
}

