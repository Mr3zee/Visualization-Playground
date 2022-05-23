package sysoev.projects.visualization.base

import csstype.Color

/**
 * @see <a href="https://coolors.co/palette/e63946-f1faee-a8dadc-457b9d-1d3557">Palette</a>
 */
object XTheme {
    val accentColor = xColor("E63946")
    val secondaryBackgroundColor = xColor("F1FAEE")
    val backgroundColor = xColor("A8DADC")
    val secondaryColor = xColor("457B9D")
    val primaryColor = xColor("1D3557")
}

fun xColor(color: String) = Color("#$color")
