/**
 * @file The transform.js module implements logic for scaling, rotation, and matrix transformations.
 */

@file:Suppress("unused")

package p5.core


/**
 * Multiplies the current matrix by the one specified through the parameters.
 * This is a powerful operation that can perform the equivalent of translate,
 * scale, shear and rotate all at once. You can learn more about transformation
 * matrices on <a href="https://en.wikipedia.org/wiki/Transformation_matrix">
 * Wikipedia</a>.
 *
 * The naming of the arguments here follows the naming of the <a href=
 * "https://html.spec.whatwg.org/multipage/canvas.html#dom-context-2d-transform">
 * WHATWG specification</a> and corresponds to a
 * transformation matrix of the
 * form:
 *
 * > <img style="max-width: 150px" src="assets/transformation-matrix.png"
 * alt="The transformation matrix used when applyMatrix is called"/>
 *
 * <img style="max-width: 300px" src="assets/transformation-matrix-4-4.png"
 * alt="The transformation matrix used when applyMatrix is called with 4x4 matrix"/>
 *
 * @method applyMatrix
 * @param  {Array} arr an array of numbers - should be 6 or 16 length (2*3 or 4*4 matrix values)
 * @chainable
 *
 * or
 *
 * @method applyMatrix
 * @param  {Number} a numbers which define the 2×3 or 4x4 matrix to be multiplied
 * @param  {Number} b numbers which define the 2×3 or 4x4 matrix to be multiplied
 * @param  {Number} c numbers which define the 2×3 or 4x4 matrix to be multiplied
 * @param  {Number} d numbers which define the 2×3 or 4x4 matrix to be multiplied
 * @param  {Number} e numbers which define the 2×3 or 4x4 matrix to be multiplied
 * @param  {Number} f numbers which define the 2×3 or 4x4 matrix to be multiplied
 * @chainable
 *
 * or
 *
 * @method applyMatrix
 * @param  {Number} a
 * @param  {Number} b
 * @param  {Number} c
 * @param  {Number} d
 * @param  {Number} e
 * @param  {Number} f
 * @param  {Number} g numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} h numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} i numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} j numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} k numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} l numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} m numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} n numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} o numbers which define the 4x4 matrix to be multiplied
 * @param  {Number} p numbers which define the 4x4 matrix to be multiplied
 * @chainable
 * @example
 * <div>
 * <code>
 * function setup() {
 *   frameRate(10);
 *   rectMode(CENTER);
 * }
 *
 * function draw() {
 *   let step = frameCount % 20;
 *   background(200);
 *   // Equivalent to translate(x, y);
 *   applyMatrix(1, 0, 0, 1, 40 + step, 50);
 *   rect(0, 0, 50, 50);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function setup() {
 *   frameRate(10);
 *   rectMode(CENTER);
 * }
 *
 * function draw() {
 *   let step = frameCount % 20;
 *   background(200);
 *   translate(50, 50);
 *   // Equivalent to scale(x, y);
 *   applyMatrix(1 / step, 0, 0, 1 / step, 0, 0);
 *   rect(0, 0, 50, 50);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function setup() {
 *   frameRate(10);
 *   rectMode(CENTER);
 * }
 *
 * function draw() {
 *   let step = frameCount % 20;
 *   let angle = map(step, 0, 20, 0, TWO_PI);
 *   let cos_a = cos(angle);
 *   let sin_a = sin(angle);
 *   background(200);
 *   translate(50, 50);
 *   // Equivalent to rotate(angle);
 *   applyMatrix(cos_a, sin_a, -sin_a, cos_a, 0, 0);
 *   rect(0, 0, 50, 50);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function setup() {
 *   frameRate(10);
 *   rectMode(CENTER);
 * }
 *
 * function draw() {
 *   let step = frameCount % 20;
 *   let angle = map(step, 0, 20, -PI / 4, PI / 4);
 *   background(200);
 *   translate(50, 50);
 *   // equivalent to shearX(angle);
 *   let shear_factor = 1 / tan(PI / 2 - angle);
 *   applyMatrix(1, 0, shear_factor, 1, 0, 0);
 *   rect(0, 0, 50, 50);
 * }
 * </code>
 * </div>
 *
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   noFill();
 * }
 *
 * function draw() {
 *   background(200);
 *   rotateY(PI / 6);
 *   stroke(153);
 *   box(35);
 *   let rad = millis() / 1000;
 *   // Set rotation angles
 *   let ct = cos(rad);
 *   let st = sin(rad);
 *   // Matrix for rotation around the Y axis
 *   // prettier-ignore
 *   applyMatrix(  ct, 0.0,  st,  0.0,
 *                0.0, 1.0, 0.0,  0.0,
 *                -st, 0.0,  ct,  0.0,
 *                0.0, 0.0, 0.0,  1.0);
 *   stroke(255);
 *   box(50);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(200);
 *   let testMatrix = [1, 0, 0, 1, 0, 0];
 *   applyMatrix(testMatrix);
 *   rect(0, 0, 50, 50);
 * }
 * </code>
 * </div>
 *
 * @alt
 * A rectangle translating to the right
 * A rectangle shrinking to the center
 * A rectangle rotating clockwise about the center
 * A rectangle shearing
 * A rectangle in the upper left corner
 */
inline fun p5.applyMatrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): p5 =
    asDynamic().appluMatrix(a, b, c, d, e, f) as p5

inline fun p5.applyMatrix(
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    e: Double,
    f: Double,
    g: Double,
    h: Double,
    i: Double,
    j: Double,
    k: Double,
    l: Double,
    m: Double,
    n: Double,
    o: Double,
    p: Double
): p5 = asDynamic().appluMatrix(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p) as p5

inline fun p5.applyMatrix(a: Array<Double>): p5 =
    asDynamic().appluMatrix(a) as p5


/**
 * Replaces the current matrix with the identity matrix.
 *
 * @method resetMatrix
 * @chainable
 * @example
 * <div>
 * <code>
 * translate(50, 50);
 * applyMatrix(0.5, 0.5, -0.5, 0.5, 0, 0);
 * rect(0, 0, 20, 20);
 * // Note that the translate is also reset.
 * resetMatrix();
 * rect(0, 0, 20, 20);
 * </code>
 * </div>
 *
 * @alt
 * A rotated rectangle in the center with another in the top left corner
 */
inline fun p5.resetMatrix(): p5 = asDynamic().resetMatrix() as p5


/**
 * Rotates a shape by the amount specified by the angle parameter. This
 * function accounts for <a href="#/p5/angleMode">angleMode</a>, so angles
 * can be entered in either RADIANS or DEGREES.
 *
 * Objects are always rotated around their relative position to the
 * origin and positive numbers rotate objects in a clockwise direction.
 * Transformations apply to everything that happens after and subsequent
 * calls to the function accumulate the effect. For example, calling
 * rotate(HALF_PI) and then rotate(HALF_PI) is the same as rotate(PI).
 * All transformations are reset when <a href="#/p5/draw">draw()</a> begins again.
 *
 * Technically, <a href="#/p5/rotate">rotate()</a> multiplies the current transformation matrix
 * by a rotation matrix. This function can be further controlled by
 * <a href="#/p5/push">push()</a> and <a href="#/p5/pop">pop()</a>.
 *
 * @method rotate
 * @param  {Number} angle the angle of rotation, specified in radians
 *                        or degrees, depending on current angleMode
 * @param  {p5.Vector|Number[]} [axis] (in 3d) the axis to rotate around
 * @chainable
 * @example
 * <div>
 * <code>
 * translate(width / 2, height / 2);
 * rotate(PI / 3.0);
 * rect(-26, -26, 52, 52);
 * </code>
 * </div>
 *
 * @alt
 * white 52×52 rect with black outline at center rotated counter 45 degrees
 */
inline fun p5.rotate(angle: Double, axis: p5.Vector? = null): p5 = asDynamic().rotate(angle, axis ?: undefined) as p5

inline fun p5.rotate(angle: Double, axis: Array<Double>? = null): p5 = asDynamic().rotate(angle, axis ?: undefined) as p5


/**
 * Rotates a shape around X axis by the amount specified in angle parameter.
 * The angles can be entered in either RADIANS or DEGREES.
 *
 * Objects are always rotated around their relative position to the
 * origin and positive numbers rotate objects in a clockwise direction.
 * All transformations are reset when <a href="#/p5/draw">draw()</a> begins again.
 *
 * @method  rotateX
 * @param  {Number} angle the angle of rotation, specified in radians
 *                        or degrees, depending on current angleMode
 * @chainable
 * @example
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 * }
 * function draw() {
 *   background(255);
 *   rotateX(millis() / 1000);
 *   box();
 * }
 * </code>
 * </div>
 *
 * @alt
 * 3d box rotating around the x axis.
 */
inline fun p5.rotateX(angle: Double): p5 = asDynamic().rotateX(angle) as p5


/**
 * Rotates a shape around Y axis by the amount specified in angle parameter.
 * The angles can be entered in either RADIANS or DEGREES.
 *
 * Objects are always rotated around their relative position to the
 * origin and positive numbers rotate objects in a clockwise direction.
 * All transformations are reset when <a href="#/p5/draw">draw()</a> begins again.
 *
 * @method rotateY
 * @param  {Number} angle the angle of rotation, specified in radians
 *                        or degrees, depending on current angleMode
 * @chainable
 * @example
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 * }
 * function draw() {
 *   background(255);
 *   rotateY(millis() / 1000);
 *   box();
 * }
 * </code>
 * </div>
 *
 * @alt
 * 3d box rotating around the y axis.
 */
inline fun p5.rotateY(angle: Double): p5 = asDynamic().rotateY(angle) as p5


/**
 * Rotates a shape around Z axis by the amount specified in angle parameter.
 * The angles can be entered in either RADIANS or DEGREES.
 *
 * This method works in WEBGL mode only.
 *
 * Objects are always rotated around their relative position to the
 * origin and positive numbers rotate objects in a clockwise direction.
 * All transformations are reset when <a href="#/p5/draw">draw()</a> begins again.
 *
 * @method rotateZ
 * @param  {Number} angle the angle of rotation, specified in radians
 *                        or degrees, depending on current angleMode
 * @chainable
 * @example
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 * }
 * function draw() {
 *   background(255);
 *   rotateZ(millis() / 1000);
 *   box();
 * }
 * </code>
 * </div>
 *
 * @alt
 * 3d box rotating around the z axis.
 */
inline fun p5.rotateZ(angle: Double): p5 = asDynamic().rotateZ(angle) as p5


/**
 * Increases or decreases the size of a shape by expanding or contracting
 * vertices. Objects always scale from their relative origin to the
 * coordinate system. Scale values are specified as decimal percentages.
 * For example, the function call scale(2.0) increases the dimension of a
 * shape by 200%.
 *
 * Transformations apply to everything that happens after and subsequent
 * calls to the function multiply the effect. For example, calling scale(2.0)
 * and then scale(1.5) is the same as scale(3.0). If <a href="#/p5/scale">scale()</a> is called
 * within <a href="#/p5/draw">draw()</a>, the transformation is reset when the loop begins again.
 *
 * Using this function with the z parameter is only available in WEBGL mode.
 * This function can be further controlled with <a href="#/p5/push">push()</a> and <a href="#/p5/pop">pop()</a>.
 *
 * @method scale
 * @param  {Number|p5.Vector|Number[]} s
 *                      percent to scale the object, or percentage to
 *                      scale the object in the x-axis if multiple arguments
 *                      are given
 * @param  {Number} [y] percent to scale the object in the y-axis
 * @param  {Number} [z] percent to scale the object in the z-axis (webgl only)
 * @chainable
 * @example
 * <div>
 * <code>
 * rect(30, 20, 50, 50);
 * scale(0.5);
 * rect(30, 20, 50, 50);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * rect(30, 20, 50, 50);
 * scale(0.5, 1.3);
 * rect(30, 20, 50, 50);
 * </code>
 * </div>
 *
 * @alt
 * white 52×52 rect with black outline at center rotated counter 45 degrees
 * 2 white rects with black outline- 1 50×50 at center. other 25×65 bottom left
 */
inline fun p5.scale(x: Double, y: Double, z: Double): p5 = asDynamic().scale(x, y, z) as p5

inline fun p5.scale(x: Double, y: Double): p5 = asDynamic().scale(x, y) as p5

inline fun p5.scale(x: Double): p5 = asDynamic().scale(x) as p5

inline fun p5.scale(x: p5.Vector): p5 = asDynamic().scale(x) as p5

inline fun p5.scale(x: Array<Double>): p5 = asDynamic().scale(x) as p5


/**
 * Shears a shape around the x-axis by the amount specified by the angle
 * parameter. Angles should be specified in the current angleMode.
 * Objects are always sheared around their relative position to the origin
 * and positive numbers shear objects in a clockwise direction.
 *
 * Transformations apply to everything that happens after and subsequent
 * calls to the function accumulates the effect. For example, calling
 * shearX(PI/2) and then shearX(PI/2) is the same as shearX(PI).
 * If <a href="#/p5/shearX">shearX()</a> is called within the <a href="#/p5/draw">draw()</a>,
 * the transformation is reset when the loop begins again.
 *
 * Technically, <a href="#/p5/shearX">shearX()</a> multiplies the current
 * transformation matrix by a rotation matrix. This function can be further
 * controlled by the <a href="#/p5/push">push()</a> and <a href="#/p5/pop">pop()</a> functions.
 *
 * @method shearX
 * @param  {Number} angle of shear specified in radians or degrees,
 *                        depending on current angleMode
 * @chainable
 * @example
 * <div>
 * <code>
 * translate(width / 4, height / 4);
 * shearX(PI / 4.0);
 * rect(0, 0, 30, 30);
 * </code>
 * </div>
 *
 * @alt
 * white irregular quadrilateral with black outline at top middle.
 */
inline fun p5.shearX(angle: Double): p5 = asDynamic().shearX(angle) as p5


/**
 * Shears a shape around the y-axis the amount specified by the angle
 * parameter. Angles should be specified in the current angleMode. Objects
 * are always sheared around their relative position to the origin and
 * positive numbers shear objects in a clockwise direction.
 *
 * Transformations apply to everything that happens after and subsequent
 * calls to the function accumulates the effect. For example, calling
 * shearY(PI/2) and then shearY(PI/2) is the same as shearY(PI). If
 * <a href="#/p5/shearY">shearY()</a> is called within the <a href="#/p5/draw">draw()</a>, the transformation is reset when
 * the loop begins again.
 *
 * Technically, <a href="#/p5/shearY">shearY()</a> multiplies the current transformation matrix by a
 * rotation matrix. This function can be further controlled by the
 * <a href="#/p5/push">push()</a> and <a href="#/p5/pop">pop()</a> functions.
 *
 * @method shearY
 * @param  {Number} angle of shear specified in radians or degrees,
 *                        depending on current angleMode
 * @chainable
 * @example
 * <div>
 * <code>
 * translate(width / 4, height / 4);
 * shearY(PI / 4.0);
 * rect(0, 0, 30, 30);
 * </code>
 * </div>
 *
 * @alt
 * white irregular quadrilateral with black outline at middle bottom.
 */
inline fun p5.shearY(angle: Double): p5 = asDynamic().shearY(angle) as p5


/**
 * Specifies an amount to displace objects within the display window.
 * The x parameter specifies left/right translation, the y parameter
 * specifies up/down translation.
 *
 * Transformations are cumulative and apply to everything that happens after
 * and subsequent calls to the function accumulates the effect. For example,
 * calling translate(50, 0) and then translate(20, 0) is the same as
 * translate(70, 0). If <a href="#/p5/translate">translate()</a> is called within <a href="#/p5/draw">draw()</a>, the
 * transformation is reset when the loop begins again. This function can be
 * further controlled by using <a href="#/p5/push">push()</a> and <a href="#/p5/pop">pop()</a>.
 *
 * @method translate
 * @param  {Number} [x] left/right translation
 * @param  {Number} [y] up/down translation
 * @param  {Number} [z] forward/backward translation (WEBGL only)
 * @chainable
 * @example
 * <div>
 * <code>
 * translate(30, 20);
 * rect(0, 0, 55, 55);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * rect(0, 0, 55, 55); // Draw rect at original 0,0
 * translate(30, 20);
 * rect(0, 0, 55, 55); // Draw rect at new 0,0
 * translate(14, 14);
 * rect(0, 0, 55, 55); // Draw rect at new 0,0
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(200);
 *   rectMode(CENTER);
 *   translate(width / 2, height / 2);
 *   translate(p5.Vector.fromAngle(millis() / 1000, 40));
 *   rect(0, 0, 20, 20);
 * }
 * </code>
 * </div>
 *
 * @alt
 * white 55×55 rect with black outline at center right.
 * 3 white 55×55 rects with black outlines at top-l, center-r and bottom-r.
 * a 20×20 white rect moving in a circle around the canvas
 */
inline fun p5.translate(x: Double, y: Double, z: Double): p5 = asDynamic().translate(x, y, z) as p5

inline fun p5.translate(x: Double, y: Double): p5 = asDynamic().translate(x, y) as p5
