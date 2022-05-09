package sysoev.projects.visualization

import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    val container = document.getElementById("root") ?: error("Couldn't find root container!")

    val root = createRoot(container)
    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }
    root.render(welcome)
}