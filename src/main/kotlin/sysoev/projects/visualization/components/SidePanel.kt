package sysoev.projects.visualization.components

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import react.*
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.p
import sysoev.projects.visualization.base.CBComponent
import sysoev.projects.visualization.base.Plugin
import sysoev.projects.visualization.base.pluginsQualifier

external interface SideProps: Props {
    var prop: String
}

class SidePanel: CBComponent<SideProps, State>(), KoinComponent {
    private val plugins: List<Plugin> by inject(qualifier = pluginsQualifier)

    override fun ChildrenBuilder.build() {
        var state by useState(1)

        plugins.forEach {
            p {
                +(it.name + props.prop + state.toString())
            }
            button {
                title = "button"
                onClick = {
                    state++
                }
            }
        }
    }
}