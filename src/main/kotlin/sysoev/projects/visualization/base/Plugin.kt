package sysoev.projects.visualization.base

import react.RBuilder

interface Plugin {
    fun RBuilder.render()

    val name: String
}