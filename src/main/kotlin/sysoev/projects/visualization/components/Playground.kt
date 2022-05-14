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
    val (sidePanelSize, sizeSetter) = useState(SidePanel.DEFAULT_SIZE)

    horizontal {
        css {
            height = 100.pct
            width = 100.pct
        }

        xChild<SidePanel, SidePanelProps> {
            panelWidth = sidePanelSize.px
        }

        ResizeBar {
            this.sizeSetter = sizeSetter
            this.resizeBarType = ResizeBarType.VERTICAL
        }

        MainPanel.styled {
            flexGrow = number(100.0)
        }.invoke()
    }
}