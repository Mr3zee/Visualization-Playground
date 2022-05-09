package sysoev.projects.visualizationPlayground

import kotlinx.browser.document
import react.create
import react.dom.render

fun main() {
    val container = document.getElementById("root") ?: error("Couldn't find root container!")

    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }
    render(welcome, container)
}