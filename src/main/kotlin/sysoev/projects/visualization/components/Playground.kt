package sysoev.projects.visualization.components

import csstype.number
import csstype.pct
import csstype.px
import emotion.react.css
import react.FC
import react.Props
import react.useState
import sysoev.projects.visualization.base.styled
import sysoev.projects.visualization.base.xChild

val Playground = FC<Props> {
    val widthState = useState(SidePanel.DEFAULT_WIDTH)

    horizontal {
        css {
            height = 100.pct
            width = 100.pct
        }

        xChild<SidePanel, SidePanelProps> {
            panelWidth = widthState.component1().px
        }

        ResizeBar {
            sizeState = widthState
            resizeBarType = ResizeBarType.VERTICAL
            maxWidth = SidePanel.MAX_WIDTH
            minWidth = SidePanel.MIN_WIDTH
        }

        MainPanel.styled {
            flexGrow = number(100.0)
        }.invoke()
    }
}