package sysoev.projects.visualization.base

import csstype.Display
import csstype.FlexDirection
import react.dom.html.ReactHTML.div

val flex = div.styled {
    display = Display.flex
}

val horizontal = flex.styled {
    flexDirection = FlexDirection.row
}

val vertical = flex.styled {
    flexDirection = FlexDirection.column
}
