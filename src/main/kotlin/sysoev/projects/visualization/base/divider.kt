package sysoev.projects.visualization.base

import csstype.*
import react.dom.html.ReactHTML.div

val horizontalDivider = div.styled {
    width = 100.pct
    height = 1.px

    backgroundColor = XTheme.sideTextColor
}