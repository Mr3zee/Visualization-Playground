package sysoev.projects.visualization.plugins

import react.RBuilder

interface Plugin {
    fun RBuilder.render()

    val name: String

    val section: String?
}