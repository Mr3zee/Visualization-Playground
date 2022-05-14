package sysoev.projects.visualization.components

import csstype.*
import emotion.react.css
import react.FC
import react.Props
import react.StateSetter
import react.dom.html.ReactHTML.div

enum class ResizeBarType {
    HORIZONTAL, VERTICAL
}

external interface ResizeBarProps : Props {
    var sizeSetter: StateSetter<Int>
    var resizeBarType: ResizeBarType
}

val ResizeBar = FC<ResizeBarProps> { props ->
    div {
        css {
            when (props.resizeBarType) {
                ResizeBarType.VERTICAL -> {
                    height = 100.pct
                    width = 4.px
                }
                ResizeBarType.HORIZONTAL -> {
                    width = 100.pct
                    height = 4.px
                }
            }

            // TODO: 5/15/22 use theme colors
            backgroundColor = NamedColor.gray

            hover {
                backgroundColor = NamedColor.blue
            }
        }
    }
}