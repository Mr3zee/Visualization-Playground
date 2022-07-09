/**
 * @file The rendering.js module presents the user-facing API for p5's various graphical output options.
 * In the overwhelming majority of cases, a p5.js sketch will be output to a <canvas> tag on the current web page,
 * but it is also possible to do "headless" output using nocanvas mode or "render" to a graphics buffer
 * that is computed but never actually appears on the screen.
 */

@file:Suppress("unused")

package p5.core

/**
 * Creates a canvas element in the document and sets its dimensions
 * in pixels. This method should be called only once at the start of <a href="#/p5/setup">setup()</a>.
 * Calling <a href="#/p5/createCanvas">createCanvas</a> more than once in a
 * sketch will result in very unpredictable behavior. If you want more than
 * one drawing canvas you could use <a href="#/p5/createGraphics">createGraphics()</a>
 * (hidden by default, but it can be shown).
 *
 * Important note: in 2D mode (i.e. when `p5.Renderer` is not set) the origin (0,0)
 * is positioned at the top left of the screen. In 3D mode (i.e. when `p5.Renderer`
 * is set to `WEBGL`), the origin is positioned at the center of the canvas.
 * See [this issue](https://github.com/processing/p5.js/issues/1545) for more information.
 *
 * The system variables width and height are set by the parameters passed to this
 * function. If <a href="#/p5/createCanvas">createCanvas()</a> is not used, the
 * window will be given a default size of 100×100 pixels.
 *
 * For more ways to position the canvas, see the
 * <a href='https://github.com/processing/p5.js/wiki/Positioning-your-canvas'>
 * positioning the canvas</a> wiki page.
 *
 * @method createCanvas
 * @param  {Number} [w] width of the canvas
 * @param  {Number} [h] height of the canvas
 * @param  {Constant} [renderer] either P2D or WEBGL
 * @return {p5.Renderer} pointer to p5.Renderer holding canvas
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 50);
 *   background(153);
 *   line(0, 0, width, height);
 * }
 * </code>
 * </div>
 *
 * @alt
 * Black line extending from top-left of canvas to bottom right.
 */
inline fun p5.createCanvas(w: Int, h: Int, renderer: String? = undefined): p5.Renderer = asDynamic().createCanvas(w, h, renderer) as p5.Renderer


/**
 * Resizes the canvas to given width and height. The canvas will be cleared
 * and draw will be called immediately, allowing the sketch to re-render itself
 * in the resized canvas.
 * @method resizeCanvas
 * @param  {Number} [w] width of the canvas
 * @param  {Number} [h] height of the canvas
 * @param  {Boolean} [noRedraw] don't redraw the canvas immediately
 * @example
 * <div class="norender"><code>
 * function setup() {
 *   createCanvas(windowWidth, windowHeight);
 * }
 *
 * function draw() {
 *   background(0, 100, 200);
 * }
 *
 * function windowResized() {
 *   resizeCanvas(windowWidth, windowHeight);
 * }
 * </code></div>
 *
 * @alt
 * No image displayed.
 */
inline fun p5.resizeCanvas(w: Int, h: Int, noRedraw: Boolean) { asDynamic().resizeCanvas(w, h, noRedraw) }

/**
 * Removes the default canvas for a p5 sketch that doesn't require a canvas
 * @method noCanvas
 * @example
 * <div>
 * <code>
 * function setup() {
 *   noCanvas();
 * }
 * </code>
 * </div>
 *
 * @alt
 * no image displayed
 */
inline fun p5.noCanvas() { asDynamic().noCanvas() }


/**
 * Creates and returns a new p5.Renderer object. Use this class if you need
 * to draw into an off-screen graphics buffer. The two parameters define the
 * width and height in pixels.
 *
 * @method createGraphics
 * @param  {Number} w width of the offscreen graphics buffer
 * @param  {Number} h height of the offscreen graphics buffer
 * @param  {Constant} [renderer] either P2D or WEBGL
 *                               undefined defaults to p2d
 * @return {p5.Graphics} offscreen graphics buffer
 * @example
 * <div>
 * <code>
 * let pg;
 * function setup() {
 *   createCanvas(100, 100);
 *   pg = createGraphics(100, 100);
 * }
 *
 * function draw() {
 *   background(200);
 *   pg.background(100);
 *   pg.noStroke();
 *   pg.ellipse(pg.width / 2, pg.height / 2, 50, 50);
 *   image(pg, 50, 50);
 *   image(pg, 0, 0, 50, 50);
 * }
 * </code>
 * </div>
 *
 * @alt
 * 4 grey squares alternating light and dark grey. White quarter circle mid-left.
 */
inline fun p5.createGraphics(w: Int, h: Int, renderer: String): p5.Graphics = asDynamic().createGraphics(w, h, renderer) as p5.Graphics


/**
 * Blends the pixels in the display window according to the defined mode.
 * There is a choice of the following modes to blend the source pixels (A)
 * with the ones of pixels already in the display window (B):
 * <ul>
 * <li><code>BLEND</code> - linear interpolation of colours: C =
 * A*factor + B. <b>This is the default blending mode.</b></li>
 * <li><code>ADD</code> - sum of A and B</li>
 * <li><code>DARKEST</code> - only the darkest colour succeeds: C =
 * min(A*factor, B).</li>
 * <li><code>LIGHTEST</code> - only the lightest colour succeeds: C =
 * max(A*factor, B).</li>
 * <li><code>DIFFERENCE</code> - subtract colors from underlying image.</li>
 * <li><code>EXCLUSION</code> - similar to <code>DIFFERENCE</code>, but less
 * extreme.</li>
 * <li><code>MULTIPLY</code> - multiply the colors, result will always be
 * darker.</li>
 * <li><code>SCREEN</code> - opposite multiply, uses inverse values of the
 * colors.</li>
 * <li><code>REPLACE</code> - the pixels entirely replace the others and
 * don't utilize alpha (transparency) values.</li>
 * <li><code>REMOVE</code> - removes pixels from B with the alpha strength of A.</li>
 * <li><code>OVERLAY</code> - mix of <code>MULTIPLY</code> and <code>SCREEN
 * </code>. Multiplies dark values, and screens light values. <em>(2D)</em></li>
 * <li><code>HARD_LIGHT</code> - <code>SCREEN</code> when greater than 50%
 * gray, <code>MULTIPLY</code> when lower. <em>(2D)</em></li>
 * <li><code>SOFT_LIGHT</code> - mix of <code>DARKEST</code> and
 * <code>LIGHTEST</code>. Works like <code>OVERLAY</code>, but not as harsh. <em>(2D)</em>
 * </li>
 * <li><code>DODGE</code> - lightens light tones and increases contrast,
 * ignores darks. <em>(2D)</em></li>
 * <li><code>BURN</code> - darker areas are applied, increasing contrast,
 * ignores lights. <em>(2D)</em></li>
 * <li><code>SUBTRACT</code> - remainder of A and B <em>(3D)</em></li>
 * </ul>
 *
 * <em>(2D)</em> indicates that this blend mode <b>only</b> works in the 2D renderer.<br>
 * <em>(3D)</em> indicates that this blend mode <b>only</b> works in the WEBGL renderer.
 *
 * @method blendMode
 * @param  {Constant} mode blend mode to set for canvas.
 *                either BLEND, DARKEST, LIGHTEST, DIFFERENCE, MULTIPLY,
 *                EXCLUSION, SCREEN, REPLACE, OVERLAY, HARD_LIGHT,
 *                SOFT_LIGHT, DODGE, BURN, ADD, REMOVE or SUBTRACT
 * @example
 * <div>
 *  <code>
 *      blendMode(LIGHTEST);
 *      strokeWeight(30);
 *      stroke(80, 150, 255);
 *      line(25, 25, 75, 75);
 *      stroke(255, 50, 50);
 *      line(75, 25, 25, 75);
 * </code>
 * </div>
 *
 * <div>
 *  <code>
 *      blendMode(MULTIPLY);
 *      strokeWeight(30);
 *      stroke(80, 150, 255);
 *      line(25, 25, 75, 75);
 *      stroke(255, 50, 50);
 *      line(75, 25, 25, 75);
 *  </code>
 * </div>
 *
 * @alt
 * translucent image thick red & blue diagonal rounded lines intersecting center
 * Thick red & blue diagonal rounded lines intersecting center. dark at overlap
 */
inline fun p5.blendMode(mode: String) { asDynamic().blendMode(mode) }