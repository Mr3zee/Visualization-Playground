package sysoev.projects.visualization.components

import csstype.Display
import csstype.FlexDirection
import react.dom.html.ReactHTML.div
import sysoev.projects.visualization.base.styled

val flex = div.styled {
    display = Display.flex
}

val horizontal = flex.styled {
    flexDirection = FlexDirection.row
}

val vertical = flex.styled {
    flexDirection = FlexDirection.column
}
