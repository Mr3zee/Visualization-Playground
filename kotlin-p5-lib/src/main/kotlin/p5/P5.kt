package p5

import kotlinx.browser.document
import org.w3c.dom.HTMLElement
import p5.core.noLoop
import p5.core.p5

fun main() {
    val container = document.getElementById("root") as HTMLElement? ?: error("Couldn't find root container")

    p5({
        it.preload = {
            console.log("preload")
        }

        it.setup = {
            console.log("setup")
        }

        it.draw = {
            console.log("draw")
            it.noLoop()
        }
    }, container)
}