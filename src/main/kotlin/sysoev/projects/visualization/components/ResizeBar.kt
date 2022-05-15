package sysoev.projects.visualization.components

import csstype.*
import emotion.react.css
import kotlinx.browser.document
import kotlinx.js.jso
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import react.FC
import react.Props
import react.StateInstance
import react.dom.html.ReactHTML.div
import react.useState
import sysoev.projects.visualization.base.bounded

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

            // TODO: 5/15/22 use theme colors
            backgroundColor = NamedColor.gray

            hover {
                backgroundColor = NamedColor.blue
            }
        }

        onClick = {
            if (it.altKey) {
                setSize { defaultSize }
            }
        }

        onMouseDown = { event ->
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
                document.body?.removeEventListener("mousemove", onMouseMove);
            }

            document.body?.addEventListener("mousemove", onMouseMove)
            document.body?.addEventListener("mouseup", onMouseUp, jso { once = true })
        }
    }
}