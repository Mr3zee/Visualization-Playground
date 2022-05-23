package sysoev.projects.visualization.components

import csstype.*
import kotlinx.browser.document
import kotlinx.js.jso
import org.w3c.dom.events.*
import react.FC
import react.Props
import react.StateInstance
import react.dom.html.ReactHTML.div
import react.useState
import sysoev.projects.visualization.base.*

enum class ResizeBarType {
    HORIZONTAL, VERTICAL
}

external interface ResizeBarProps : Props {
    var sizeState: StateInstance<Double>
    var resizeBarType: ResizeBarType
    var defaultSize: Double?
    var maxWidth: Double?
    var minWidth: Double?
}

private const val RESIZE_BAR_WIDTH = 8

val ResizeBar = FC<ResizeBarProps> { props ->
    val defaultSize by useState(props.defaultSize ?: props.sizeState.component1())
    val (size, setSize) = props.sizeState
    val maxWidth = props.maxWidth ?: Double.POSITIVE_INFINITY
    val minWidth = props.minWidth ?: 0.0

    var background by useState(XTheme.primaryColor)

    div {
        css {
            when (props.resizeBarType) {
                ResizeBarType.VERTICAL -> {
                    height = 100.pct
                    width = RESIZE_BAR_WIDTH.px
                }
                ResizeBarType.HORIZONTAL -> {
                    width = 100.pct
                    height = RESIZE_BAR_WIDTH.px
                }
            }

            backgroundColor = background

            hover {
                backgroundColor = XTheme.accentColor
            }
        }

        onClick = {
            if (it.altKey) {
                setSize { defaultSize }
            }
        }

        onMouseDown = { event ->
            background = XTheme.accentColor

            val start = when (props.resizeBarType) {
                ResizeBarType.VERTICAL -> event.pageX
                ResizeBarType.HORIZONTAL -> event.pageY
            }

            val onMouseMove: (Event) -> Unit = {
                (it as MouseEvent).let { mouseEvent ->
                    setSize {
                        val newSize = size - start + when (props.resizeBarType) {
                            ResizeBarType.VERTICAL -> mouseEvent.pageX
                            ResizeBarType.HORIZONTAL -> mouseEvent.pageY
                        }
                        newSize.bounded(minWidth, maxWidth)
                    }
                }
            }

            val onMouseUp: (Event) -> Unit = {
                background = XTheme.primaryColor

                document.body?.removeEventListener("mousemove", onMouseMove);
            }

            document.body?.addEventListener("mousemove", onMouseMove)
            document.body?.addEventListener("mouseup", onMouseUp, jso { once = true })
        }
    }
}