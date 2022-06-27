/**
 * @file The constants.js module provides various default values mostly related to
 * math and web standards using clear semantic names to increase syntax clarity when
 * they are used in other algorithms. These values are attached to the p5 object prototype
 * as properties by the constructor function, so they can be more easily accessed
 * by other parts of the p5.js library or by user code.
 *
 * @see <a href="">https://github.com/processing/p5.js/blob/main/src/core/constants.js</a>
 */

@file:Suppress("unused", "SpellCheckingInspection", "ObjectPropertyName")

package p5.core

@JsModule("p5")
external object P5Constants {

    /**
     * Version of this p5.js.
     * @property {String} VERSION
     * @final
     * @default 'VERSION_CONST_WILL_BE_REPLACED_BY_BROWSERIFY_BUILD_PROCESS'
     */
    val VERSION: String = definedExternally

// GRAPHICS RENDERER

    /**
     * The default, two-dimensional renderer.
     * @property {String} P2D
     * @final
     */
    val P2D: String = definedExternally

    /**
     * One of the two render modes in p5.js: P2D (default renderer) and WEBGL
     * Enables 3D render by introducing the third dimension: Z
     * @property {String} WEBGL
     * @final
     */
    val WEBGL: String = definedExternally

// ENVIRONMENT

    /**
     * @property {String} ARROW
     * @final
     */
    val ARROW: String = definedExternally

    /**
     * @property {String} CROSS
     * @final
     */
    val CROSS: String = definedExternally

    /**
     * @property {String} HAND
     * @final
     */
    val HAND: String = definedExternally

    /**
     * @property {String} MOVE
     * @final
     */
    val MOVE: String = definedExternally

    /**
     * @property {String} TEXT
     * @final
     */
    val TEXT: String = definedExternally

    /**
     * @property {String} WAIT
     * @final
     */
    val WAIT: String = definedExternally

// TRIGONOMETRY

    /**
     * HALF_PI is a mathematical constant with the value
     * 1.57079632679489661923. It is half the ratio of the
     * circumference of a circle to its diameter. It is useful in
     * combination with the trigonometric functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
     *
     * @property {Number} HALF_PI
     * @final
     *
     * @example
     * <div><code>
     * arc(50, 50, 80, 80, 0, HALF_PI);
     * </code></div>
     *
     * @alt
     * 80×80 white quarter-circle with curve toward bottom right of canvas.
     */
    val HALF_PI: Double = definedExternally

    /**
     * PI is a mathematical constant with the value
     * 3.14159265358979323846. It is the ratio of the circumference
     * of a circle to its diameter. It is useful in combination with
     * the trigonometric functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
     *
     * @property {Number} PI
     * @final
     *
     * @example
     * <div><code>
     * arc(50, 50, 80, 80, 0, PI);
     * </code></div>
     *
     * @alt
     * white half-circle with curve toward bottom of canvas.
     */
    val PI: Double = definedExternally

    /**
     * QUARTER_PI is a mathematical constant with the value 0.7853982.
     * It is one quarter the ratio of the circumference of a circle to
     * its diameter. It is useful in combination with the trigonometric
     * functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
     *
     * @property {Number} QUARTER_PI
     * @final
     *
     * @example
     * <div><code>
     * arc(50, 50, 80, 80, 0, QUARTER_PI);
     * </code></div>
     *
     * @alt
     * white eighth-circle rotated about 40 degrees with curve bottom right canvas.
     */
    val QUARTER_PI: Double = definedExternally

    /**
     * TAU is an alias for TWO_PI, a mathematical constant with the
     * value 6.28318530717958647693. It is twice the ratio of the
     * circumference of a circle to its diameter. It is useful in
     * combination with the trigonometric functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
     *
     * @property {Number} TAU
     * @final
     *
     * @example
     * <div><code>
     * arc(50, 50, 80, 80, 0, TAU);
     * </code></div>
     *
     * @alt
     * 80×80 white ellipse shape in center of canvas.
     */
    val TAU: Double = definedExternally

    /**
     * TWO_PI is a mathematical constant with the value
     * 6.28318530717958647693. It is twice the ratio of the
     * circumference of a circle to its diameter. It is useful in
     * combination with the trigonometric functions <a href="#/p5/sin">sin()</a> and <a href="#/p5/cos">cos()</a>.
     *
     * @property {Number} TWO_PI
     * @final
     *
     * @example
     * <div><code>
     * arc(50, 50, 80, 80, 0, TWO_PI);
     * </code></div>
     *
     * @alt
     * 80×80 white ellipse shape in center of canvas.
     */
    val TWO_PI: Double = definedExternally

    /**
     * Constant to be used with the <a href="#/p5/angleMode">angleMode()</a> function, to set the mode in
     * which p5.js interprets and calculates angles (either DEGREES or RADIANS).
     * @property {String} DEGREES
     * @final
     *
     * @example
     * <div class='norender'><code>
     * function setup() {
     *   angleMode(DEGREES);
     * }
     * </code></div>
     */
    val DEGREES: String = definedExternally

    /**
     * Constant to be used with the <a href="#/p5/angleMode">angleMode()</a> function, to set the mode
     * in which p5.js interprets and calculates angles (either RADIANS or DEGREES).
     * @property {String} RADIANS
     * @final
     *
     * @example
     * <div class='norender'><code>
     * function setup() {
     *   angleMode(RADIANS);
     * }
     * </code></div>
     */
    val RADIANS: String = definedExternally

    /**
     * @default PI / 180.0
     */
    val DEG_TO_RAD: Double = definedExternally

    /**
     * @default 180.0 / PI
     */
    val RAD_TO_DEG: Double = definedExternally

// SHAPE

    /**
     * @property {String} CORNER
     * @final
     */
    val CORNER: String = definedExternally

    /**
     * @property {String} CORNERS
     * @final
     */
    val CORNERS: String = definedExternally

    /**
     * @property {String} RADIUS
     * @final
     */
    val RADIUS: String = definedExternally

    /**
     * @property {String} RIGHT
     * @final
     */
    val RIGHT: String = definedExternally

    /**
     * @property {String} LEFT
     * @final
     */
    val LEFT: String = definedExternally

    /**
     * @property {String} CENTER
     * @final
     */
    val CENTER: String = definedExternally

    /**
     * @property {String} TOP
     * @final
     */
    val TOP: String = definedExternally

    /**
     * @property {String} BOTTOM
     * @final
     */
    val BOTTOM: String = definedExternally

    /**
     * @property {String} BASELINE
     * @final
     * @default alphabetic
     */
    val BASELINE: String = definedExternally

    /**
     * @property {Number} POINTS
     * @final
     * @default 0x0000
     */
    val POINTS: Int = definedExternally

    /**
     * @property {Number} LINES
     * @final
     * @default 0x0001
     */
    val LINES: Int = definedExternally

    /**
     * @property {Number} LINE_STRIP
     * @final
     * @default 0x0003
     */
    val LINE_STRIP: Int = definedExternally

    /**
     * @property {Number} LINE_LOOP
     * @final
     * @default 0x0002
     */
    val LINE_LOOP: Int = definedExternally

    /**
     * @property {Number} TRIANGLES
     * @final
     * @default 0x0004
     */
    val TRIANGLES: Int = definedExternally

    /**
     * @property {Number} TRIANGLE_FAN
     * @final
     * @default 0x0006
     */
    val TRIANGLE_FAN: Int = definedExternally

    /**
     * @property {Number} TRIANGLE_STRIP
     * @final
     * @default 0x0005
     */
    val TRIANGLE_STRIP: Int = definedExternally

    /**
     * @property {String} QUADS
     * @final
     */
    val QUADS: String = definedExternally

    /**
     * @property {String} QUAD_STRIP
     * @final
     * @default quad_strip
     */
    val QUAD_STRIP: String = definedExternally

    /**
     * @property {String} TESS
     * @final
     * @default tess
     */
    val TESS: String = definedExternally

    /**
     * @property {String} CLOSE
     * @final
     */
    val CLOSE: String = definedExternally

    /**
     * @property {String} OPEN
     * @final
     */
    val OPEN: String = definedExternally

    /**
     * @property {String} CHORD
     * @final
     */
    val CHORD: String = definedExternally

    /**
     * @property {String} PIE
     * @final
     */
    val PIE: String = definedExternally

    /**
     * @property {String} PROJECT
     * @final
     * @default square
     */
    val PROJECT: String = definedExternally // PEND: careful this is counterintuitive

    /**
     * @property {String} SQUARE
     * @final
     * @default butt
     */
    val SQUARE: String = definedExternally

    /**
     * @property {String} ROUND
     * @final
     */
    val ROUND: String = definedExternally

    /**
     * @property {String} BEVEL
     * @final
     */

    val BEVEL: String = definedExternally
    /**
     * @property {String} MITER
     * @final
     */

    val MITER: String = definedExternally

// COLOR

    /**
     * @property {String} RGB
     * @final
     */
    val RGB: String = definedExternally

    /**
     * HSB (hue, saturation, brightness) is a type of color model.
     * You can learn more about it at
     * <a href="https://learnui.design/blog/the-hsb-color-system-practicioners-primer.html">HSB</a>.
     *
     * @property {String} HSB
     * @final
     */
    val HSB: String = definedExternally

    /**
     * @property {String} HSL
     * @final
     */
    val HSL: String = definedExternally

// DOM EXTENSION

    /**
     * AUTO allows us to automatically set the width or height of an element (but not both),
     * based on the current height and width of the element. Only one parameter can
     * be passed to the <a href="/#/p5.Element/size">size</a> function as AUTO, at a time.
     *
     * @property {String} AUTO
     * @final
     */
    val AUTO: String = definedExternally

// Input

    /**
     * @property {Number} ALT
     * @final
     * @default 18
     */
    val ALT: Int = definedExternally

    /**
     * @property {Number} BACKSPACE
     * @final
     * @default 8
     */
    val BACKSPACE: Int = definedExternally

    /**
     * @property {Number} CONTROL
     * @final
     * @default 17
     */
    val CONTROL: Int = definedExternally

    /**
     * @property {Number} DELETE
     * @final
     * @default 46
     */
    val DELETE: Int = definedExternally

    /**
     * @property {Number} DOWN_ARROW
     * @final
     * @default 40
     */
    val DOWN_ARROW: Int = definedExternally

    /**
     * @property {Number} ENTER
     * @final
     * @default 13
     */
    val ENTER: Int = definedExternally

    /**
     * @property {Number} ESCAPE
     * @final
     * @default 27
     */
    val ESCAPE: Int = definedExternally

    /**
     * @property {Number} LEFT_ARROW
     * @final
     * @default 37
     */
    val LEFT_ARROW: Int = definedExternally

    /**
     * @property {Number} OPTION
     * @final
     * @default 18
     */
    val OPTION: Int = definedExternally

    /**
     * @property {Number} RETURN
     * @final
     * @default 13
     */
    val RETURN: Int = definedExternally

    /**
     * @property {Number} RIGHT_ARROW
     * @final
     * @default 39
     */
    val RIGHT_ARROW: Int = definedExternally

    /**
     * @property {Number} SHIFT
     * @final
     * @default 16
     */
    val SHIFT: Int = definedExternally

    /**
     * @property {Number} TAB
     * @final
     * @default 9
     */
    val TAB: Int = definedExternally

    /**
     * @property {Number} UP_ARROW
     * @final
     * @default 38
     */
    val UP_ARROW: Int = definedExternally

// RENDERING

    /**
     * @property {String} BLEND
     * @final
     * @default source-over
     */
    val BLEND: String = definedExternally

    /**
     * @property {String} REMOVE
     * @final
     * @default destination-out
     */
    val REMOVE: String = definedExternally

    /**
     * @property {String} ADD
     * @final
     * @default lighter
     */
    val ADD: String = definedExternally

    /**
     * @property {String} DARKEST
     * @final
     */
    val DARKEST: String = definedExternally

    /**
     * @property {String} LIGHTEST
     * @final
     * @default lighten
     */
    val LIGHTEST: String = definedExternally

    /**
     * @property {String} DIFFERENCE
     * @final
     */
    val DIFFERENCE: String = definedExternally

    /**
     * @property {String} SUBTRACT
     * @final
     */
    val SUBTRACT: String = definedExternally

    /**
     * @property {String} EXCLUSION
     * @final
     */
    val EXCLUSION: String = definedExternally

    /**
     * @property {String} MULTIPLY
     * @final
     */
    val MULTIPLY: String = definedExternally

    /**
     * @property {String} SCREEN
     * @final
     */
    val SCREEN: String = definedExternally

    /**
     * @property {String} REPLACE
     * @final
     * @default copy
     */
    val REPLACE: String = definedExternally

    /**
     * @property {String} OVERLAY
     * @final
     */
    val OVERLAY: String = definedExternally

    /**
     * @property {String} HARD_LIGHT
     * @final
     */
    val HARD_LIGHT: String = definedExternally

    /**
     * @property {String} SOFT_LIGHT
     * @final
     */
    val SOFT_LIGHT: String = definedExternally

    /**
     * @property {String} DODGE
     * @final
     * @default color-dodge
     */
    val DODGE: String = definedExternally

    /**
     * @property {String} BURN
     * @final
     * @default color-burn
     */
    val BURN: String = definedExternally

// FILTERS

    /**
     * @property {String} THRESHOLD
     * @final
     */
    val THRESHOLD: String = definedExternally

    /**
     * @property {String} GRAY
     * @final
     */
    val GRAY: String = definedExternally

    /**
     * @property {String} OPAQUE
     * @final
     */
    val OPAQUE: String = definedExternally

    /**
     * @property {String} INVERT
     * @final
     */
    val INVERT: String = definedExternally

    /**
     * @property {String} POSTERIZE
     * @final
     */
    val POSTERIZE: String = definedExternally

    /**
     * @property {String} DILATE
     * @final
     */
    val DILATE: String = definedExternally

    /**
     * @property {String} ERODE
     * @final
     */
    val ERODE: String = definedExternally

    /**
     * @property {String} BLUR
     * @final
     */
    val BLUR: String = definedExternally

// TYPOGRAPHY

    /**
     * @property {String} NORMAL
     * @final
     */
    val NORMAL: String = definedExternally

    /**
     * @property {String} ITALIC
     * @final
     */
    val ITALIC: String = definedExternally

    /**
     * @property {String} BOLD
     * @final
     */
    val BOLD: String = definedExternally

    /**
     * @property {String} BOLDITALIC
     * @final
     */
    val BOLDITALIC: String = definedExternally

    /**
     * @property {String} CHAR
     * @final
     */
    val CHAR: String = definedExternally

    /**
     * @property {String} WORD
     * @final
     */
    val WORD: String = definedExternally

// TYPOGRAPHY-INTERNAL

    /**
     * @default '#000000'
     */
    val _DEFAULT_TEXT_FILL: String = definedExternally

    /**
     * @default 1.25
     */
    val _DEFAULT_LEADMULT: Double = definedExternally

    /**
     * @default 'middle'
     */
    val _CTX_MIDDLE: String = definedExternally

// VERTICES

    /**
     * @property {String} LINEAR
     * @final
     */
    val LINEAR: String = definedExternally

    /**
     * @property {String} QUADRATIC
     * @final
     */
    val QUADRATIC: String = definedExternally

    /**
     * @property {String} BEZIER
     * @final
     */
    val BEZIER: String = definedExternally

    /**
     * @property {String} CURVE
     * @final
     */
    val CURVE: String = definedExternally

// WEBGL DRAWMODES

    /**
     * @property {String} STROKE
     * @final
     */
    val STROKE: String = definedExternally

    /**
     * @property {String} FILL
     * @final
     */
    val FILL: String = definedExternally

    /**
     * @property {String} TEXTURE
     * @final
     */
    val TEXTURE: String = definedExternally

    /**
     * @property {String} IMMEDIATE
     * @final
     */
    val IMMEDIATE: String = definedExternally

// WEBGL TEXTURE MODE
// NORMAL already exists for typography

    /**
     * @property {String} IMAGE
     * @final
     */
    val IMAGE: String = definedExternally

// WEBGL TEXTURE WRAP AND FILTERING
// LINEAR already exists above

    /**
     * @property {String} NEAREST
     * @final
     */
    val NEAREST: String = definedExternally

    /**
     * @property {String} REPEAT
     * @final
     */
    val REPEAT: String = definedExternally

    /**
     * @property {String} CLAMP
     * @final
     */
    val CLAMP: String = definedExternally

    /**
     * @property {String} MIRROR
     * @final
     */
    val MIRROR: String = definedExternally

// DEVICE-ORIENTATION

    /**
     * @property {String} LANDSCAPE
     * @final
     */
    val LANDSCAPE: String = definedExternally

    /**
     * @property {String} PORTRAIT
     * @final
     */
    val PORTRAIT: String = definedExternally

// DEFAULTS

    /**
     * @default '#000000'
     */
    val _DEFAULT_STROKE: String = definedExternally

    /**
     * @default '#FFFFFF'
     */
    val _DEFAULT_FILL: String = definedExternally

// Other

    /**
     * @property {String} GRID
     * @final
     */
    val GRID: String = definedExternally

    /**
     * @property {String} AXES
     * @final
     */
    val AXES: String = definedExternally

    /**
     * @property {String} LABEL
     * @final
     */
    val LABEL: String = definedExternally

    /**
     * @property {String} FALLBACK
     * @final
     */
    val FALLBACK: String = definedExternally
}