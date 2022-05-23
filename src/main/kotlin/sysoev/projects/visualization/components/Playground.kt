package sysoev.projects.visualization.components

import csstype.*
import react.FC
import react.Props
import react.useState
import sysoev.projects.visualization.base.*

val Playground = FC<Props> {
    val widthState = useState(SidePanel.DEFAULT_WIDTH)

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