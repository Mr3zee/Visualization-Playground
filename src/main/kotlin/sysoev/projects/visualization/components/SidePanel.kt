package sysoev.projects.visualization.components

import csstype.Length
import csstype.pct
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import react.*
import sysoev.projects.visualization.base.*
import sysoev.projects.visualization.plugins.Plugin

external interface SidePanelProps: StyledProps {
    var panelWidth: Length
}

class SidePanel: CBComponent<SidePanelProps>(), KoinComponent {
    private val plugins: List<Plugin> by inject(qualifier = pluginsQualifier)

    override fun ChildrenBuilder.build() {
        val pluginSetter = useContext(pluginContextSetter)

        vertical {
            css {
                width = props.panelWidth
                height = 100.pct

                backgroundColor = XTheme.secondaryColor
            }

            xSectionedList(
                items = plugins.map { it to it.section },
                renderItem = { attrs, item ->
                    attrs.css {
                        color = XTheme.sideTextColor
                    }

                    +item.name.upperFirstChar()
                },
                onClick = { pluginSetter(it) }
            )
        }
    }

    companion object {
        const val DEFAULT_WIDTH = 240.0
        const val MIN_WIDTH = 200.0
        const val MAX_WIDTH = 600.0
    }
}

fun ChildrenBuilder.xSidePanel(panelWidth: Length) {
    xChild<SidePanel, SidePanelProps> {
        this.panelWidth = panelWidth
    }
}