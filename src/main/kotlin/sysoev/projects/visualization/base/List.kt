package sysoev.projects.visualization.base

import csstype.AlignItems
import csstype.minus
import csstype.pct
import csstype.px
import react.ChildrenBuilder
import react.dom.html.ReactHTML.div

external interface ListProps<T> : StyledProps {
    var items: List<T>
    var renderItem: (ChildrenBuilder, T, DIVAttrs) -> Unit
    var onClick: (T) -> Unit
    var builder: XBuilderInProps<ListProps<T>>
}

class XList<T> : CBComponent<ListProps<T>>() {
    override fun ChildrenBuilder.build() {
        vertical {
            css {
                width = 100.pct
            }

            props.items.forEach { item ->
                flex {
                    css {
                        width = 100.pct - 16.px
                        minHeight = 32.px
                        padding = 8.px

                        alignItems = AlignItems.center
                    }

                    div {
                        css {
                            width = 100.pct
                        }

                        props.renderItem(this, item, this)
                    }

                    onClick = { props.onClick(item) }
                }
            }

            props.builder(this, props)
        }
    }
}

fun <T> ChildrenBuilder.xList(
    items: List<T>,
    renderItem: ChildrenBuilder.(T, DIVAttrs) -> Unit,
    onClick: (T) -> Unit = {},
    builder: XBuilder<StyledProps> = {}
) {
    xChild<XList<T>, ListProps<T>> {
        this.items = items
        this.renderItem = renderItem
        this.onClick = onClick
        this.builder = builder.builderInProps()
    }
}
