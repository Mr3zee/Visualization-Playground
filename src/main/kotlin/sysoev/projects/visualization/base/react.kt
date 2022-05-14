@file:Suppress("UNUSED_VARIABLE")

package sysoev.projects.visualization.base

import react.*

inline fun <reified C : CBComponent<P, *>, P> ChildrenBuilder.xChild(
    crossinline block: @ReactDsl P.() -> Unit
) where P : Props {
    C::class.react {
        block()
    }
}

abstract class CBComponent<P : Props, S : State> : RComponent<P, S>() {
    private val innerComponent = FC<P> { build() }

    override fun RBuilder.render() {
        child(innerComponent.create())
    }

    abstract fun ChildrenBuilder.build()
}