package sysoev.projects.visualization

import csstype.Overflow
import csstype.Position
import csstype.pct
import csstype.px
import emotion.react.Global
import emotion.react.styles
import kotlinx.browser.document
import org.koin.core.context.startKoin
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import sysoev.projects.visualization.base.applyCustomFonts
import sysoev.projects.visualization.base.pluginsModule
import sysoev.projects.visualization.components.Playground


const val root = "root"

fun main() {
    startKoin {
        printLogger()

        modules(pluginsModule)
    }

    val container = document.getElementById(root) ?: error("Couldn't find root container")
    val root = createRoot(container)
    root.render(App.create())
}

val App = FC<Props> {
    Global {
        styles {
            "body, html, #$root" {
                width = 100.pct
                height = 100.pct

                margin = 0.px
                padding = 0.px

                position = Position.fixed
                overflow = Overflow.hidden
            }

            applyCustomFonts()
        }
    }

    Playground()
}