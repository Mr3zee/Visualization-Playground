package sysoev.projects.visualization.base

import csstype.*
import react.ChildrenBuilder
import react.Context
import react.Fragment
import react.dom.html.ReactHTML.div

private external interface ListProps<T> : StyledProps {
    var items: List<SectionedElement<T>>
    var renderItem: (ChildrenBuilder, DIVAttrs, T) -> Unit
    var onClick: (T) -> Unit
    var builder: XBuilderInProps<ListProps<T>>
}

private class XList<T> : CBComponent<ListProps<T>>() {
    override fun ChildrenBuilder.build() {
        vertical {
            css {
                width = 100.pct
            }

            props.items.forEachIndexed { i, item ->
                when (item) {
                    is SectionedElement.Element -> {
                        Fragment {
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

                                        fontSize = FontSize.medium
                                    }

                                    props.renderItem(this, this, item.value)
                                }

                                onClick = { props.onClick(item.value) }
                            }
                        }
                    }
                    is SectionedElement.Section -> {
                        if (i != 0) {
                            horizontalDivider()

                            gap(4.px)
                        }

                        item.section?.let { sectionName ->
                            div {
                                css {
                                    paddingLeft = 6.px

                                    color = XTheme.sideTextColor
                                    backgroundColor = XTheme.secondaryColor2

                                    fontSize = FontSize.smaller
                                }

                                +sectionName
                            }

                            gap(4.px)
                        }
                    }
                }
            }

            props.builder(this, props)
        }
    }
}

fun <T> ChildrenBuilder.xSectionedList(
    items: List<Pair<T, String?>>,
    renderItem: ChildrenBuilder.(DIVAttrs, T) -> Unit,
    onClick: (T) -> Unit = {},
    builder: XBuilder<StyledProps> = {}
) {
    xChild<XList<T>, ListProps<T>> {
        this.items = if (items.mapNotNull { it.second }.isEmpty()) {
            items.map { SectionedElement.Element(it.first) }
        } else {
            items.map {
                if (it.second?.isEmpty() == true) it.first to null else it
            }.sortedWith(compareBy(nullsLast()) { it.second }).let { list ->
                var last = ""
                val newList = mutableListOf<SectionedElement<T>>()
                list.forEach { (el, section) ->
                    when (section) {
                        null -> SectionedElement.Section(null)
                        last -> null
                        else -> SectionedElement.Section<T>(section).also { last = section }
                    }?.let { newList.add(it) }
                    newList.add(SectionedElement.Element(el))
                }
                newList
            }
        }
        this.renderItem = renderItem
        this.onClick = onClick
        this.builder = builder.builderInProps()
    }
}


fun <T> ChildrenBuilder.xList(
    items: List<T>,
    renderItem: ChildrenBuilder.(DIVAttrs, T) -> Unit,
    onClick: (T) -> Unit = {},
    builder: XBuilder<StyledProps> = {}
) = xSectionedList(
    items = items.map { it to null },
    renderItem = renderItem,
    onClick = onClick,
    builder = builder.builderInProps()
)

private sealed interface SectionedElement<T> {
    class Element<T>(val value: T): SectionedElement<T>

    class Section<T>(val section: String?): SectionedElement<T>
}