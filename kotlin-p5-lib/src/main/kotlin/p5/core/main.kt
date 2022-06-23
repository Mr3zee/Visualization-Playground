@file:Suppress("ClassName")

package p5.core

import org.w3c.dom.HTMLElement

@JsModule("p5")
external class p5(sketch: (p5) -> Unit, node: HTMLElement) {
    var preload: () -> Unit

    var setup: () -> Unit

    var draw: () -> Unit
}