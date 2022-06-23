package sysoev.projects.visualization.components

import csstype.*
import react.*
import sysoev.projects.visualization.base.*

val Playground = FC<Props> {
    PluginContextProvider {
        horizontal {
            css {
                height = 100.pct
                width = 100.pct

                backgroundColor = XTheme.backgroundColor
            }

            xSidePanel()

            MainPanel()
        }
    }
}
