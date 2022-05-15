@file:Suppress("UNUSED")

package sysoev.projects.visualization.base

import csstype.PropertiesBuilder
import emotion.styled.StyledComponent
import emotion.styled.styled
import react.*

external interface StyledProps : PropsWithClassName, PropsWithChildren

typealias XBuilder<P> = ChildrenBuilder.(P) -> Unit

fun <P : PropsWithClassName> ElementType<P>.styled(builder: PropertiesBuilder.() -> Unit): StyledComponent<P> =
    styled { _, _ -> builder() }

inline fun <reified C : CBComponent<P, *>, P> ChildrenBuilder.xChild(
    crossinline block: @ReactDsl P.() -> Unit = {}
) where P : Props {
    C::class.react {
        block()
    }
}

inline fun <reified C : CBComponent<Props, *>> ChildrenBuilder.xChild() {
    C::class.react.invoke()
}

abstract class CBComponent<P : Props, S : State> : RComponent<P, S>() {
    private val innerComponent = FC<P> { build() }

    override fun RBuilder.render() {
        child(innerComponent.create())
    }

    abstract fun ChildrenBuilder.build()
}