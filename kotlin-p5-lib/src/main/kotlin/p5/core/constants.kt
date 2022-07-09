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


/**
 * Version of this p5.js.
 * @property {String} VERSION
 * @final
 * @default 'VERSION_CONST_WILL_BE_REPLACED_BY_BROWSERIFY_BUILD_PROCESS'
 */
val p5.VERSION: String get() = asDynamic().VERSION as String

// GRAPHICS RENDERER

/**
 * The default, two-dimensional renderer.
 * @property {String} P2D
 * @final
 */
val p5.P2D: String get() = asDynamic().P2D as String

/**
 * One of the two render modes in p5.js: P2D (default renderer) and WEBGL
 * Enables 3D render by introducing the third dimension: Z
 * @property {String} WEBGL
 * @final
 */
val p5.WEBGL: String get() = asDynamic().WEBGL as String

// ENVIRONMENT

/**
 * @property {String} ARROW
 * @final
 */
val p5.ARROW: String get() = asDynamic().ARROW as String

/**
 * @property {String} CROSS
 * @final
 */
val p5.CROSS: String get() = asDynamic().CROSS as String

/**
 * @property {String} HAND
 * @final
 */
val p5.HAND: String get() = asDynamic().HAND as String

/**
 * @property {String} MOVE
 * @final
 */
val p5.MOVE: String get() = asDynamic().MOVE as String

/**
 * @property {String} TEXT
 * @final
 */
val p5.TEXT: String get() = asDynamic().TEXT as String

/**
 * @property {String} WAIT
 * @final
 */
val p5.WAIT: String get() = asDynamic().WAIT as String

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
val p5.HALF_PI: Double get() = asDynamic().HALF_PI as Double

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
val p5.PI: Double get() = asDynamic().PI as Double

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
val p5.QUARTER_PI: Double get() = asDynamic().QUARTER_PI as Double

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
val p5.TAU: Double get() = asDynamic().TAU as Double

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
val p5.TWO_PI: Double get() = asDynamic().TWO_PI as Double

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
val p5.DEGREES: String get() = asDynamic().DEGREES as String

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
val p5.RADIANS: String get() = asDynamic().RADIANS as String

/**
 * @default PI / 180.0
 */
val p5.DEG_TO_RAD: Double get() = asDynamic().DEG_TO_RAD as Double

/**
 * @default 180.0 / PI
 */
val p5.RAD_TO_DEG: Double get() = asDynamic().RAD_TO_DEG as Double

// SHAPE

/**
 * @property {String} CORNER
 * @final
 */
val p5.CORNER: String get() = asDynamic().CORNER as String

/**
 * @property {String} CORNERS
 * @final
 */
val p5.CORNERS: String get() = asDynamic().CORNERS as String

/**
 * @property {String} RADIUS
 * @final
 */
val p5.RADIUS: String get() = asDynamic().RADIUS as String

/**
 * @property {String} RIGHT
 * @final
 */
val p5.RIGHT: String get() = asDynamic().RIGHT as String

/**
 * @property {String} LEFT
 * @final
 */
val p5.LEFT: String get() = asDynamic().LEFT as String

/**
 * @property {String} CENTER
 * @final
 */
val p5.CENTER: String get() = asDynamic().CENTER as String

/**
 * @property {String} TOP
 * @final
 */
val p5.TOP: String get() = asDynamic().TOP as String

/**
 * @property {String} BOTTOM
 * @final
 */
val p5.BOTTOM: String get() = asDynamic().BOTTOM as String

/**
 * @property {String} BASELINE
 * @final
 * @default alphabetic
 */
val p5.BASELINE: String get() = asDynamic().BASELINE as String

/**
 * @property {Number} POINTS
 * @final
 * @default 0x0000
 */
val p5.POINTS: Int get() = asDynamic().POINTS as Int

/**
 * @property {Number} LINES
 * @final
 * @default 0x0001
 */
val p5.LINES: Int get() = asDynamic().LINES as Int

/**
 * @property {Number} LINE_STRIP
 * @final
 * @default 0x0003
 */
val p5.LINE_STRIP: Int get() = asDynamic().LINE_STRIP as Int

/**
 * @property {Number} LINE_LOOP
 * @final
 * @default 0x0002
 */
val p5.LINE_LOOP: Int get() = asDynamic().LINE_LOOP as Int

/**
 * @property {Number} TRIANGLES
 * @final
 * @default 0x0004
 */
val p5.TRIANGLES: Int get() = asDynamic().TRIANGLES as Int

/**
 * @property {Number} TRIANGLE_FAN
 * @final
 * @default 0x0006
 */
val p5.TRIANGLE_FAN: Int get() = asDynamic().TRIANGLE_FAN as Int

/**
 * @property {Number} TRIANGLE_STRIP
 * @final
 * @default 0x0005
 */
val p5.TRIANGLE_STRIP: Int get() = asDynamic().TRIANGLE_STRIP as Int

/**
 * @property {String} QUADS
 * @final
 */
val p5.QUADS: String get() = asDynamic().QUADS as String

/**
 * @property {String} QUAD_STRIP
 * @final
 * @default quad_strip
 */
val p5.QUAD_STRIP: String get() = asDynamic().QUAD_STRIP as String

/**
 * @property {String} TESS
 * @final
 * @default tess
 */
val p5.TESS: String get() = asDynamic().TESS as String

/**
 * @property {String} CLOSE
 * @final
 */
val p5.CLOSE: String get() = asDynamic().CLOSE as String

/**
 * @property {String} OPEN
 * @final
 */
val p5.OPEN: String get() = asDynamic().OPEN as String

/**
 * @property {String} CHORD
 * @final
 */
val p5.CHORD: String get() = asDynamic().CHORD as String

/**
 * @property {String} PIE
 * @final
 */
val p5.PIE: String get() = asDynamic().PIE as String

/**
 * @property {String} PROJECT
 * @final
 * @default square
 */
val p5.PROJECT: String get() = asDynamic().PROJECT as String // PEND: careful this is counterintuitive

/**
 * @property {String} SQUARE
 * @final
 * @default butt
 */
val p5.SQUARE: String get() = asDynamic().SQUARE as String

/**
 * @property {String} ROUND
 * @final
 */
val p5.ROUND: String get() = asDynamic().ROUND as String

/**
 * @property {String} BEVEL
 * @final
 */

val p5.BEVEL: String get() = asDynamic().BEVEL as String

/**
 * @property {String} MITER
 * @final
 */

val p5.MITER: String get() = asDynamic().MITER as String

// COLOR

/**
 * @property {String} RGB
 * @final
 */
val p5.RGB: String get() = asDynamic().RGB as String

/**
 * HSB (hue, saturation, brightness) is a type of color model.
 * You can learn more about it at
 * <a href="https://learnui.design/blog/the-hsb-color-system-practicioners-primer.html">HSB</a>.
 *
 * @property {String} HSB
 * @final
 */
val p5.HSB: String get() = asDynamic().HSB as String

/**
 * @property {String} HSL
 * @final
 */
val p5.HSL: String get() = asDynamic().HSL as String

// DOM EXTENSION

/**
 * AUTO allows us to automatically set the width or height of an element (but not both),
 * based on the current height and width of the element. Only one parameter can
 * be passed to the <a href="/#/p5.Element/size">size</a> function as AUTO, at a time.
 *
 * @property {String} AUTO
 * @final
 */
val p5.AUTO: String get() = asDynamic().AUTO as String

// Input

/**
 * @property {Number} ALT
 * @final
 * @default 18
 */
val p5.ALT: Int get() = asDynamic().ALT as Int

/**
 * @property {Number} BACKSPACE
 * @final
 * @default 8
 */
val p5.BACKSPACE: Int get() = asDynamic().BACKSPACE as Int

/**
 * @property {Number} CONTROL
 * @final
 * @default 17
 */
val p5.CONTROL: Int get() = asDynamic().CONTROL as Int

/**
 * @property {Number} DELETE
 * @final
 * @default 46
 */
val p5.DELETE: Int get() = asDynamic().DELETE as Int

/**
 * @property {Number} DOWN_ARROW
 * @final
 * @default 40
 */
val p5.DOWN_ARROW: Int get() = asDynamic().DOWN_ARROW as Int

/**
 * @property {Number} ENTER
 * @final
 * @default 13
 */
val p5.ENTER: Int get() = asDynamic().ENTER as Int

/**
 * @property {Number} ESCAPE
 * @final
 * @default 27
 */
val p5.ESCAPE: Int get() = asDynamic().ESCAPE as Int

/**
 * @property {Number} LEFT_ARROW
 * @final
 * @default 37
 */
val p5.LEFT_ARROW: Int get() = asDynamic().LEFT_ARROW as Int

/**
 * @property {Number} OPTION
 * @final
 * @default 18
 */
val p5.OPTION: Int get() = asDynamic().OPTION as Int

/**
 * @property {Number} RETURN
 * @final
 * @default 13
 */
val p5.RETURN: Int get() = asDynamic().RETURN as Int

/**
 * @property {Number} RIGHT_ARROW
 * @final
 * @default 39
 */
val p5.RIGHT_ARROW: Int get() = asDynamic().RIGHT_ARROW as Int

/**
 * @property {Number} SHIFT
 * @final
 * @default 16
 */
val p5.SHIFT: Int get() = asDynamic().SHIFT as Int

/**
 * @property {Number} TAB
 * @final
 * @default 9
 */
val p5.TAB: Int get() = asDynamic().TAB as Int

/**
 * @property {Number} UP_ARROW
 * @final
 * @default 38
 */
val p5.UP_ARROW: Int get() = asDynamic().UP_ARROW as Int

// RENDERING

/**
 * @property {String} BLEND
 * @final
 * @default source-over
 */
val p5.BLEND: String get() = asDynamic().BLEND as String

/**
 * @property {String} REMOVE
 * @final
 * @default destination-out
 */
val p5.REMOVE: String get() = asDynamic().REMOVE as String

/**
 * @property {String} ADD
 * @final
 * @default lighter
 */
val p5.ADD: String get() = asDynamic().ADD as String

/**
 * @property {String} DARKEST
 * @final
 */
val p5.DARKEST: String get() = asDynamic().DARKEST as String

/**
 * @property {String} LIGHTEST
 * @final
 * @default lighten
 */
val p5.LIGHTEST: String get() = asDynamic().LIGHTEST as String

/**
 * @property {String} DIFFERENCE
 * @final
 */
val p5.DIFFERENCE: String get() = asDynamic().DIFFERENCE as String

/**
 * @property {String} SUBTRACT
 * @final
 */
val p5.SUBTRACT: String get() = asDynamic().SUBTRACT as String

/**
 * @property {String} EXCLUSION
 * @final
 */
val p5.EXCLUSION: String get() = asDynamic().EXCLUSION as String

/**
 * @property {String} MULTIPLY
 * @final
 */
val p5.MULTIPLY: String get() = asDynamic().MULTIPLY as String

/**
 * @property {String} SCREEN
 * @final
 */
val p5.SCREEN: String get() = asDynamic().SCREEN as String

/**
 * @property {String} REPLACE
 * @final
 * @default copy
 */
val p5.REPLACE: String get() = asDynamic().REPLACE as String

/**
 * @property {String} OVERLAY
 * @final
 */
val p5.OVERLAY: String get() = asDynamic().OVERLAY as String

/**
 * @property {String} HARD_LIGHT
 * @final
 */
val p5.HARD_LIGHT: String get() = asDynamic().HARD_LIGHT as String

/**
 * @property {String} SOFT_LIGHT
 * @final
 */
val p5.SOFT_LIGHT: String get() = asDynamic().SOFT_LIGHT as String

/**
 * @property {String} DODGE
 * @final
 * @default color-dodge
 */
val p5.DODGE: String get() = asDynamic().DODGE as String

/**
 * @property {String} BURN
 * @final
 * @default color-burn
 */
val p5.BURN: String get() = asDynamic().BURN as String

// FILTERS

/**
 * @property {String} THRESHOLD
 * @final
 */
val p5.THRESHOLD: String get() = asDynamic().THRESHOLD as String

/**
 * @property {String} GRAY
 * @final
 */
val p5.GRAY: String get() = asDynamic().GRAY as String

/**
 * @property {String} OPAQUE
 * @final
 */
val p5.OPAQUE: String get() = asDynamic().OPAQUE as String

/**
 * @property {String} INVERT
 * @final
 */
val p5.INVERT: String get() = asDynamic().INVERT as String

/**
 * @property {String} POSTERIZE
 * @final
 */
val p5.POSTERIZE: String get() = asDynamic().POSTERIZE as String

/**
 * @property {String} DILATE
 * @final
 */
val p5.DILATE: String get() = asDynamic().DILATE as String

/**
 * @property {String} ERODE
 * @final
 */
val p5.ERODE: String get() = asDynamic().ERODE as String

/**
 * @property {String} BLUR
 * @final
 */
val p5.BLUR: String get() = asDynamic().BLUR as String

// TYPOGRAPHY

/**
 * @property {String} NORMAL
 * @final
 */
val p5.NORMAL: String get() = asDynamic().NORMAL as String

/**
 * @property {String} ITALIC
 * @final
 */
val p5.ITALIC: String get() = asDynamic().ITALIC as String

/**
 * @property {String} BOLD
 * @final
 */
val p5.BOLD: String get() = asDynamic().BOLD as String

/**
 * @property {String} BOLDITALIC
 * @final
 */
val p5.BOLDITALIC: String get() = asDynamic().BOLDITALIC as String

/**
 * @property {String} CHAR
 * @final
 */
val p5.CHAR: String get() = asDynamic().CHAR as String

/**
 * @property {String} WORD
 * @final
 */
val p5.WORD: String get() = asDynamic().WORD as String

// TYPOGRAPHY-INTERNAL

/**
 * @default '#000000'
 */
val p5._DEFAULT_TEXT_FILL: String get() = asDynamic()._DEFAULT_TEXT_FILL as String

/**
 * @default 1.25
 */
val p5._DEFAULT_LEADMULT: Double get() = asDynamic()._DEFAULT_LEADMULT as Double

/**
 * @default 'middle'
 */
val p5._CTX_MIDDLE: String get() = asDynamic()._CTX_MIDDLE as String

// VERTICES

/**
 * @property {String} LINEAR
 * @final
 */
val p5.LINEAR: String get() = asDynamic().LINEAR as String

/**
 * @property {String} QUADRATIC
 * @final
 */
val p5.QUADRATIC: String get() = asDynamic().QUADRATIC as String

/**
 * @property {String} BEZIER
 * @final
 */
val p5.BEZIER: String get() = asDynamic().BEZIER as String

/**
 * @property {String} CURVE
 * @final
 */
val p5.CURVE: String get() = asDynamic().CURVE as String

// WEBGL DRAWMODES

/**
 * @property {String} STROKE
 * @final
 */
val p5.STROKE: String get() = asDynamic().STROKE as String

/**
 * @property {String} FILL
 * @final
 */
val p5.FILL: String get() = asDynamic().FILL as String

/**
 * @property {String} TEXTURE
 * @final
 */
val p5.TEXTURE: String get() = asDynamic().TEXTURE as String

/**
 * @property {String} IMMEDIATE
 * @final
 */
val p5.IMMEDIATE: String get() = asDynamic().IMMEDIATE as String

// WEBGL TEXTURE MODE
// NORMAL already exists for typography

/**
 * @property {String} IMAGE
 * @final
 */
val p5.IMAGE: String get() = asDynamic().IMAGE as String

// WEBGL TEXTURE WRAP AND FILTERING
// LINEAR already exists above

/**
 * @property {String} NEAREST
 * @final
 */
val p5.NEAREST: String get() = asDynamic().NEAREST as String

/**
 * @property {String} REPEAT
 * @final
 */
val p5.REPEAT: String get() = asDynamic().REPEAT as String

/**
 * @property {String} CLAMP
 * @final
 */
val p5.CLAMP: String get() = asDynamic().CLAMP as String

/**
 * @property {String} MIRROR
 * @final
 */
val p5.MIRROR: String get() = asDynamic().MIRROR as String

// DEVICE-ORIENTATION

/**
 * @property {String} LANDSCAPE
 * @final
 */
val p5.LANDSCAPE: String get() = asDynamic().LANDSCAPE as String

/**
 * @property {String} PORTRAIT
 * @final
 */
val p5.PORTRAIT: String get() = asDynamic().PORTRAIT as String

// DEFAULTS

/**
 * @default '#000000'
 */
val p5._DEFAULT_STROKE: String get() = asDynamic()._DEFAULT_STROKE as String

/**
 * @default '#FFFFFF'
 */
val p5._DEFAULT_FILL: String get() = asDynamic()._DEFAULT_FILL as String

// Other

/**
 * @property {String} GRID
 * @final
 */
val p5.GRID: String get() = asDynamic().GRID as String

/**
 * @property {String} AXES
 * @final
 */
val p5.AXES: String get() = asDynamic().AXES as String

/**
 * @property {String} LABEL
 * @final
 */
val p5.LABEL: String get() = asDynamic().LABEL as String

/**
 * @property {String} FALLBACK
 * @final
 */
val p5.FALLBACK: String get() = asDynamic().FALLBACK as String
