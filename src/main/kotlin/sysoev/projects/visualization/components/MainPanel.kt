package sysoev.projects.visualization.components

import csstype.*
import emotion.react.css
import react.*
import react.dom.html.ReactHTML.div


val MainPanel = FC<PropsWithClassName> {
    div {
        css {
            width = 100.pct
            height = 100.pct

            backgroundColor = NamedColor.white
        }
    }
}