package sysoev.projects.visualization.components

import csstype.Length
import csstype.pct
import kotlinx.browser.window
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import react.*
import sysoev.projects.visualization.base.*

external interface SidePanelProps: StyledProps {
    var panelWidth: Length
}

class SidePanel: CBComponent<SidePanelProps>(), KoinComponent {
    private val plugins: List<Plugin> by inject(qualifier = pluginsQualifier)

    override fun ChildrenBuilder.build() {
        vertical {
            css {
                width = props.panelWidth
                height = 100.pct

                backgroundColor = XTheme.secondaryColor
            }

            xList(
                items = plugins,
                renderItem = { item, attrs ->
                    attrs.css {
                        color = XTheme.accentColor
                    }

                    +"Plugin: ${item.name}"
                },
                onClick = { window.alert(it.name) }
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