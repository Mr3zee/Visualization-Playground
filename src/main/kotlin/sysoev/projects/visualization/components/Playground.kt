package sysoev.projects.visualization.components

import csstype.*
import react.*
import sysoev.projects.visualization.base.*
import sysoev.projects.visualization.plugins.Plugin

data class PluginContextConfig(
    val plugin: Plugin?,
    val setter: StateSetter<Plugin?>
)

val Playground = FC<Props> {
    val widthState = useState(SidePanel.DEFAULT_WIDTH)

    PluginContextProvider {
        horizontal {
            css {
                height = 100.pct
                width = 100.pct

                backgroundColor = XTheme.backgroundColor
            }

            xSidePanel(panelWidth = widthState.value.px)

            ResizeBar {
                sizeState = widthState
                resizeBarType = ResizeBarType.VERTICAL
                maxWidth = SidePanel.MAX_WIDTH
                minWidth = SidePanel.MIN_WIDTH
            }

            MainPanel()
        }
    }
}