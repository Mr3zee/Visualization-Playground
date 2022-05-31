package sysoev.projects.visualization.base

import csstype.Length
import react.ChildrenBuilder
import react.dom.html.ReactHTML.div

fun ChildrenBuilder.gap(size: Length) = div.styled {
    width = size
    height = size
}