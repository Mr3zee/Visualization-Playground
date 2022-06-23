package sysoev.projects.visualization.components

import csstype.pct
import csstype.px
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.w3c.dom.HTMLElement
import react.*
import sysoev.projects.visualization.base.*
import sysoev.projects.visualization.plugins.Plugin

class SidePanel: CBComponent<StyledProps>(), KoinComponent {
    private val plugins: List<Plugin> by inject(qualifier = pluginsQualifier)

    override fun ChildrenBuilder.build() {
        val pluginSetter = useContext(pluginContextSetter)

        val panelRef = useRef<HTMLElement>(null)

        vertical {
            css {
                width = DEFAULT_WIDTH.px
                height = 100.pct

                backgroundColor = XTheme.secondaryColor
            }

            ref = panelRef

            xSectionedList(
                items = plugins.map { it to it.section },
                renderItem = { attrs, item ->
                    attrs.css {
                        color = XTheme.sideTextColor
                    }

                    +item.name.upperFirstChar()
                },
                onClick = { pluginSetter(it) }
            )
        }

        ResizeBar {
            sizeSetter = {
                panelRef.current?.style?.width = it.px.toString()
            }
            initialSize = DEFAULT_WIDTH
            resizeBarType = ResizeBarType.VERTICAL
            maxWidth = MAX_WIDTH
            minWidth = MIN_WIDTH
        }
    }

    companion object {
        const val DEFAULT_WIDTH = 240.0
        const val MIN_WIDTH = 200.0
        const val MAX_WIDTH = 600.0
    }
}

fun ChildrenBuilder.xSidePanel() {
    xChild<SidePanel, StyledProps>()
}