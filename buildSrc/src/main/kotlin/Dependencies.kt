import org.gradle.kotlin.dsl.provideDelegate
import kotlin.reflect.KProperty

object Dependencies {
    object KotlinWrappers {
        val wrappersBom by kotlinw(Versions.bom)

        val react by kotlinw()
        val reactDom by kotlinw()
        val emotion by kotlinw()
        val reactRouterDom by kotlinw()

        val extensions by kotlinw()
        val browser by kotlinw()
    }
}

fun kotlinw(version: String? = null): KotlinWrapper = KotlinWrapper(version)

class KotlinWrapper(private val version: String? = null) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return buildString {
            append("org.jetbrains.kotlin-wrappers:kotlin-${property.name.toSnake()}")
            version?.let { append(":$it") }
        }
    }

    private fun String.toSnake() = toList().joinToString("") {
        if (it.isUpperCase()) "-${it.toLowerCase()}" else it.toString()
    }.trimStart('-')
}