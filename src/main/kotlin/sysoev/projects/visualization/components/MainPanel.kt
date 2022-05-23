package sysoev.projects.visualization.components

import csstype.*
import react.*
import react.dom.html.ReactHTML.div
import sysoev.projects.visualization.base.*


val MainPanel = FC<StyledProps> {
    div {
        css {
            flex = Flex(number(1.0), number(1.0), Auto.auto)
            height = 100.pct
        }
    }
}