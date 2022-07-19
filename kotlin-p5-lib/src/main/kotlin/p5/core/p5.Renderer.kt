/**
 * @file The p5.Renderer.js module provides a common base definition for a p5 project
 * output mode that can then be extended as with p5.Renderer2D.
 * For three-dimensional output, see the webgl module.
 * Each p5 object instance typically has a Renderer attached as a property.
 */

@file:Suppress("unused")

package p5.core

import p5.typography.TextAlignProps

// the renderer should return a 'style' object that it wishes to
// store on the push stack.
inline fun p5.Renderer.push() = asDynamic().push()

// a pop() operation is in progress
// the renderer is passed the 'style' object that it returned
// from its push() method.
inline fun p5.Renderer.pop(style: dynamic) { asDynamic().pop(style) }

/**
 * Resize our canvas element.
 */
inline fun p5.Renderer.resize(w: Int, h: Int) { asDynamic().resize(w, h) }

/**
 * TODO doc
 */
inline fun p5.Renderer.get(x: Int, y: Int): Array<Int> = asDynamic().get(x, y) as Array<Int>

inline fun p5.Renderer.get(x: Int, y: Int, w: Int, h: Int): p5.Image = asDynamic().get(x, y, w, h) as p5.Image

inline fun p5.Renderer.get(): p5.Image = asDynamic().get() as p5.Image

/**
 * TODO doc
 */
inline fun p5.Renderer.textLeading(l: Int) { asDynamic().textLeading(l) }

inline fun p5.Renderer.textLeading(): Int = asDynamic().textLeading() as Int

/**
 * TODO doc
 */
inline fun p5.Renderer.textSize(s: Int) { asDynamic().textSize(s) }

inline fun p5.Renderer.textSize(): Int = asDynamic().textSize() as Int

/**
 * TODO doc
 */
inline fun p5.Renderer.textStyle(s: String) { asDynamic().textStyle(s) }

inline fun p5.Renderer.textStyle(): String = asDynamic().textStyle() as String

/**
 * TODO doc
 */
inline fun p5.Renderer.textAscent(): Int = asDynamic().textAscent() as Int

/**
 * TODO doc
 */
inline fun p5.Renderer.textDescent(): Int = asDynamic().textDescent() as Int


/**
 * @see [p5.typography.textAlign]
 */
inline fun p5.Renderer.textAlign(h: String, v: String): p5 = asDynamic().textAlign(h, v) as p5

inline fun p5.Renderer.textAlign(): TextAlignProps = asDynamic().textAlign().unsafeCast<TextAlignProps>()

/**
 * TODO doc
 */
inline fun p5.Renderer.textWrap(wrapStyle: String): String = asDynamic().textWrap(wrapStyle) as String


/**
 * TODO doc
 */
inline fun p5.Renderer.text(str: String, x: Int, y: Int, maxWidth: Int? = null, maxHeight: Int? = null) {
    asDynamic().text(str, x, y, maxWidth ?: undefined, maxHeight ?: undefined)
}

