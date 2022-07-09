/**
 * The p5.Renderer2D.js module extends the generic p5.Renderer
 * definition and optimizes it for two-dimensional images.
 */

@file:Suppress("unused")

package p5.core


/**
 * TODO docs
 */
inline fun p5.Renderer2D.resize(w: Int, h: Int) { asDynamic().resize(w, h) }


//////////////////////////////////////////////
// COLOR | Setting
//////////////////////////////////////////////


/**
 * TODO docs
 */
inline fun p5.Renderer2D.background(r: Int, g: Int, b: Int, a: Int? = null) {
    asDynamic().background(r, g, b, a ?: undefined)
}

inline fun p5.Renderer2D.background(grayscale: Int, a: Int? = null) {
    asDynamic().background(grayscale, a ?: undefined)
}

inline fun p5.Renderer2D.background(color: Array<Int>) { asDynamic().background(color) }

inline fun p5.Renderer2D.background(color: String, a: Int? = null) { asDynamic().background(color, a) }

inline fun p5.Renderer2D.background(color: p5.Color) { asDynamic().background(color) }

inline fun p5.Renderer2D.background(image: p5.Image, a: Int? = null) { asDynamic().background(image, a) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.clear() { asDynamic().clear() }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.fill(r: Int, g: Int, b: Int, a: Int? = null) { asDynamic().fill(r, g, b, a ?: undefined) }

inline fun p5.Renderer2D.fill(grayscale: Int, a: Int? = null) { asDynamic().fill(grayscale, a ?: undefined) }

inline fun p5.Renderer2D.fill(color: Array<Int>) { asDynamic().fill(color) }

inline fun p5.Renderer2D.fill(color: String) { asDynamic().fill(color) }

inline fun p5.Renderer2D.fill(color: p5.Color) { asDynamic().fill(color) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.stroke(r: Int, g: Int, b: Int, a: Int? = null) { asDynamic().stroke(r, g, b, a ?: undefined) }

inline fun p5.Renderer2D.stroke(grayscale: Int, a: Int? = null) { asDynamic().stroke(grayscale, a ?: undefined) }

inline fun p5.Renderer2D.stroke(color: Array<Int>) { asDynamic().stroke(color) }

inline fun p5.Renderer2D.stroke(color: String) { asDynamic().stroke(color) }

inline fun p5.Renderer2D.stroke(color: p5.Color) { asDynamic().stroke(color) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.erase(opacityFill: Int, opacityStroke: Int) { asDynamic().erase(opacityFill, opacityStroke) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.noErase() { asDynamic().noErase() }

//////////////////////////////////////////////
// IMAGE | Loading & Displaying
//////////////////////////////////////////////


/**
 * TODO docs
 */
inline fun p5.Renderer2D.image(
    img: p5.Image,
    sx: Int,
    sy: Int,
    sWidth: Int,
    sHeight: Int,
    dx: Int,
    dy: Int,
    dWidth: Int,
    dHeight: Int
) {
    asDynamic().image(img, sx, sy, sWidth, sHeight, dx, dy, dWidth, dHeight)
}

//////////////////////////////////////////////
// IMAGE | Pixels
//////////////////////////////////////////////


/**
 * TODO docs
 */
inline fun p5.Renderer2D.blendMode(mode: String) { asDynamic().blendMoade(mode) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.blend(
    srcImage: p5.Image,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    dx: Int,
    dy: Int,
    dw: Int,
    dh: Int,
    blendMode: String
) {
    asDynamic().blend(srcImage, sx, sy, sw, sh, dx, dy, dw, dh, blendMode)
}

inline fun p5.Renderer2D.blend(
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    dx: Int,
    dy: Int,
    dw: Int,
    dh: Int,
    blendMode: String
) {
    asDynamic().blend(sx, sy, sw, sh, dx, dy, dw, dh, blendMode)
}

/**
 * TODO docs
 */
inline fun p5.Renderer2D.loadPixels() { asDynamic().loadPixels() }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.set(x: Int, y: Int, imgOrCol: Int) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.Renderer2D.set(x: Int, y: Int, imgOrCol: Array<Int>) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.Renderer2D.set(x: Int, y: Int, imgOrCol: p5.Image) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.Renderer2D.set(x: Int, y: Int, imgOrCol: p5.Color) { asDynamic().set(x, y, imgOrCol) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.updatePixels(x: Int, y: Int, w: Int, h: Int) {
    asDynamic().updatePixels(x, y, w, h)
}

inline fun p5.Renderer2D.updatePixels() {
    asDynamic().updatePixels()
}

//////////////////////////////////////////////
// SHAPE | 2D Primitives
//////////////////////////////////////////////

/**
 * This function requires that:
 *
 *   0 <= start < TWO_PI
 *
 *   start <= stop < start + TWO_PI
 */
inline fun p5.Renderer2D.arc(x: Double, y: Double, w: Double, h: Double, start: Double, stop: Double, mode: String) {
    asDynamic().arc(x, y, w, h, start, stop, mode)
}


/**
 * TODO docs
 */
inline fun p5.Renderer2D.ellipse(x: Double, y: Double, w: Double, h: Double) { asDynamic().ellipse(x, y, w, h) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.line(x1: Double, y1: Double, x2: Double, y2: Double) { asDynamic().line(x1, y1, x2, y2) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.point(x: Double, y: Double) { asDynamic().point(x, y) }


/**
 * TODo docs
 */
inline fun p5.Renderer2D.quad(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double
) {
    asDynamic().quad(x1, y1, x2, y2, x3, y3, x4, y4)
}


/**
 * TODo docs
 */
inline fun p5.Renderer2D.rect(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    tl: Double? = null,
    tr: Double? = null,
    br: Double? = null,
    bl: Double? = null
) {
    asDynamic().rect(x, y, w, h, tl ?: undefined, tr ?: undefined, br ?: undefined, bl ?: undefined)
}

/**
 * TODo docs
 */
inline fun p5.Renderer2D.triangle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double) {
    asDynamic().triangle(x1, y1, x2, y2, x3, y3)
}


/**
 * TODO docs
 */
inline fun p5.Renderer2D.endShape(
    mode: String,
    vertices: Array<Array<Int>>,
    isCurve: Boolean = false,
    isBezier: Boolean = false,
    isQuadratic: Boolean = false,
    isContour: Boolean = false,
    shapeKind: String
) {
    asDynamic().endShape(mode, vertices, isCurve, isBezier, isQuadratic, isContour, shapeKind)
}


//////////////////////////////////////////////
// SHAPE | Attributes
//////////////////////////////////////////////


/**
 * TODO docs
 */
inline fun p5.Renderer2D.strokeCap(cap: String) { asDynamic().strokeCap(cap) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.strokeJoin(join: String) { asDynamic().strokeJoin(join) }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.strokeWeight(w: Double? = null) { asDynamic().strokeWeight(w ?: undefined) }


//////////////////////////////////////////////
// SHAPE | Curves
//////////////////////////////////////////////

/**
 * TODO docs
 */
inline fun p5.Renderer2D.bezier(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double
) {
    asDynamic().bezier(x1, y1, x2, y2, x3, y3, x4, y4)
}


/**
 * TODO docs
 */
inline fun p5.Renderer2D.curve(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double
) {
    asDynamic().curve(x1, y1, x2, y2, x3, y3, x4, y4)
}


//////////////////////////////////////////////
// TRANSFORM
//////////////////////////////////////////////

/**
 * TODO docs
 */
inline fun p5.Renderer2D.applyMatrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double) {
    asDynamic().applyMatrix(a, b, c, d, e, f)
}


/**
 * TODO docs
 */
inline fun p5.Renderer2D.resetMatrix() { asDynamic().resetMatrix() }


/**
 * TODO docs
 */
inline fun p5.Renderer2D.rotate(rad: Double) {
    asDynamic().rotate(rad)
}


/**
 * TODO docs
 */
inline fun p5.Renderer2D.scale(x: Double, y: Double) {
    asDynamic().scale(x, y)
}


/**
 * TODO docs
 */
inline fun p5.Renderer2D.translate(x: Double, y: Double) { asDynamic().translate(x, y) }

inline fun p5.Renderer2D.translate(x: p5.Vector) { asDynamic().translate(x) }


//////////////////////////////////////////////
// TYPOGRAPHY
//////////////////////////////////////////////


/**
 * TODO docs
 */
inline fun p5.Renderer2D.text(str: String, x: Int, y: Int, maxWidth: Int? = null, maxHeight: Int? = null) {
    asDynamic().text(str, x, y, maxWidth ?: undefined, maxHeight ?: undefined)
}


/**
 * TODO docs
 */
inline fun p5.Renderer2D.textWidth(s: Int) { asDynamic().textWidth(s) }


//////////////////////////////////////////////
// STRUCTURE
//////////////////////////////////////////////


// a push() operation is in progress.
// the renderer should return a 'style' object that it wishes to
// store on the push stack.
// derived renderers should call the base class' push() method
// to fetch the base style object.
inline fun p5.Renderer2D.push(): dynamic = asDynamic().push()


// a pop() operation is in progress
// the renderer is passed the 'style' object that it returned
// from its push() method.
// derived renderers should pass this object to their base
// class' pop method
inline fun p5.Renderer2D.pop(style: dynamic) { asDynamic().pop(style) }