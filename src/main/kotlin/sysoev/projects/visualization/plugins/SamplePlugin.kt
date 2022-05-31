package sysoev.projects.visualization.plugins

import react.RBuilder

class SamplePlugin: Plugin {
    override fun RBuilder.render() {
        TODO("Not yet implemented")
    }

    override val name: String
        get() = "sample"

    override val section = "section"
}