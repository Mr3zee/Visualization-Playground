package sysoev.projects.visualization.base

import csstype.*

object Fonts {
    val PoppinsRegular = Font("Poppins/Poppins-Regular", "Poppins")
}

data class Font(
    val file: String,
    val family: String,
) {
    val src get() = "url('fonts/$file.woff2') format('woff2'), url('fonts/$file.ttf') format('ttf')"

    fun fontFamily() = string("'$family'")
}

fun RuleBuilder<PropertiesBuilder>.applyCustomFonts() {
    fontFace {
        fontFamily = Fonts.PoppinsRegular.family
        src = Fonts.PoppinsRegular.src
        fontWeight = FontWeight.normal
        fontStyle = FontStyle.normal
    }

    "*" {
        fontFamily = Fonts.PoppinsRegular.fontFamily()
    }
}
