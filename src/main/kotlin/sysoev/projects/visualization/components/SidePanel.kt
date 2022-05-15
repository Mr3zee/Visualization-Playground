package sysoev.projects.visualization.components

import csstype.Length
import csstype.NamedColor
import csstype.pct
import emotion.react.css
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import react.*
import sysoev.projects.visualization.base.CBComponent
import sysoev.projects.visualization.base.Plugin
import sysoev.projects.visualization.base.StyledProps
import sysoev.projects.visualization.base.pluginsQualifier

external interface SidePanelProps: StyledProps {
    var panelWidth: Length
}

class SidePanel: CBComponent<SidePanelProps, State>(), KoinComponent {
    private val plugins: List<Plugin> by inject(qualifier = pluginsQualifier)

    override fun ChildrenBuilder.build() {
        vertical {
            css {
                width = props.panelWidth
                height = 100.pct

                backgroundColor = NamedColor.lightgray
            }
        }
    }

    companion object {
        const val DEFAULT_WIDTH = 360.0
        const val MIN_WIDTH = 240.0
        const val MAX_WIDTH = 600.0
    }
}