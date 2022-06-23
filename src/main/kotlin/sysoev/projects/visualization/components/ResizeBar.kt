package sysoev.projects.visualization.components

import csstype.*
import kotlinx.browser.document
import kotlinx.js.jso
import org.w3c.dom.events.*
import react.*
import react.dom.html.ReactHTML.div
import sysoev.projects.visualization.base.*

enum class ResizeBarType {
    HORIZONTAL, VERTICAL
}

external interface ResizeBarProps : Props {
    var sizeSetter: (Double) -> Unit
    var resizeBarType: ResizeBarType
    var initialSize: Double
    var maxWidth: Double?
    var minWidth: Double?
}

private const val RESIZE_BAR_WIDTH = 8

val ResizeBar = memo(FC<ResizeBarProps> { props ->
    val (size, setSize) = useState(props.initialSize)

    useEffect { props.sizeSetter(size) }

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
                setSize { props.initialSize }
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

                document.body?.removeEventListener("mousemove", onMouseMove)
            }

            document.body?.addEventListener("mousemove", onMouseMove)
            document.body?.addEventListener("mouseup", onMouseUp, jso { once = true })
        }
    }
})