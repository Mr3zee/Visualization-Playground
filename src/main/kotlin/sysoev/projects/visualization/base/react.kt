@file:Suppress("UNUSED")

package sysoev.projects.visualization.base

import csstype.PropertiesBuilder
import emotion.css.cx
import emotion.styled.StyledComponent
import emotion.styled.styled
import kotlinx.js.jso
import org.w3c.dom.Element
import react.*
import react.dom.html.HTMLAttributes

external interface StyledProps : PropsWithClassName, PropsWithChildren

typealias XBuilder<P> = ChildrenBuilder.(P) -> Unit
typealias XBuilderInProps<P> = (ChildrenBuilder, P) -> Unit


fun <P> XBuilder<P>.builderInProps(): XBuilderInProps<P> = { builder: ChildrenBuilder, props: P ->
    this.invoke(builder, props)
}


fun <P : PropsWithClassName> ElementType<P>.styled(builder: PropertiesBuilder.() -> Unit): StyledComponent<P> =
    styled { _, _ -> builder() }

inline fun <reified C : CBComponent<P>, P> ChildrenBuilder.xChild(
    crossinline block: @ReactDsl P.() -> Unit = {}
) where P : StyledProps {
    C::class.react {
        block()
    }
}

inline fun <reified C : CBComponent<StyledProps>> ChildrenBuilder.xChild() {
    C::class.react.invoke()
}

abstract class CBComponent<P : StyledProps> : RComponent<P, State>() {
    private val innerComponent = FC<P> { build() }

    override fun RBuilder.render() {
        child(innerComponent.create())
    }

    abstract fun ChildrenBuilder.build()
}

fun StyledProps.css(block: PropertiesBuilder.() -> Unit) {
    className = cx(className, emotion.css.css(jso(block)))
}

fun <T : Element> HTMLAttributes<T>.css(block: PropertiesBuilder.() -> Unit) {
    className = cx(className, emotion.css.css(jso(block)))
}

val <T> StateInstance<T>.value get() = component1()
val <T> StateInstance<T>.setter get() = component2()