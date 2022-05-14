package sysoev.projects.visualization

import kotlinx.browser.document
import org.koin.core.context.startKoin
import react.FC
import react.Props
import react.create
import react.dom.client.createRoot
import sysoev.projects.visualization.components.SidePanel
import sysoev.projects.visualization.base.pluginsModule
import sysoev.projects.visualization.base.xChild
import sysoev.projects.visualization.components.SideProps

fun main() {
    startKoin {
        printLogger()

        modules(pluginsModule)
    }

    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    val root = createRoot(container)
    root.render(App.create())
}

val App = FC<Props> {
    xChild<SidePanel, SideProps> {
        prop = "prop"
    }
}