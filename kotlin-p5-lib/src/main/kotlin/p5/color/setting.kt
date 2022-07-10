@file:Suppress("unused")

package p5.color

import p5.core.p5


/**
 * The <a href="#/p5/background">background()</a> function sets the color used
 * for the background of the p5.js canvas. The default background is transparent.
 * This function is typically used within <a href="#/p5/draw">draw()</a> to clear
 * the display window at the beginning of each frame, but it can be used inside
 * <a href="#/p5/setup">setup()</a> to set the background on the first frame of
 * animation or if the background need only be set once.
 *
 * The color is either specified in terms of the RGB, HSB, or HSL color depending
 * on the current <a href="#/p5/colorMode">colorMode</a>. (The default color space
 * is RGB, with each value in the range from 0 to 255). The alpha range by default
 * is also 0 to 255.<br><br>
 *
 * If a single string argument is provided, RGB, RGBA and Hex CSS color strings
 * and all named color strings are supported. In this case, an alpha number
 * value as a second argument is not supported, the RGBA form should be used.
 *
 * A <a href="#/p5.Color">p5.Color</a> object can also be provided to set the background color.
 *
 * A <a href="#/p5.Image">p5.Image</a> can also be provided to set the background image.
 *
 * @method background
 * @param {p5.Color} [color]  any value created by the <a href="#/p5/color">color()</a> function
 * @chainable
 *
 * @example
 * <div>
 * <code>
 * // Grayscale integer value
 * background(51);
 * describe('canvas with darkest charcoal grey background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // R, G & B integer values
 * background(255, 204, 0);
 * describe('canvas with yellow background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // H, S & B integer values
 * colorMode(HSB);
 * background(255, 204, 100);
 * describe('canvas with royal blue background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Named SVG/CSS color string
 * background('red');
 * describe('canvas with red background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // three-digit hexadecimal RGB notation
 * background('#fae');
 * describe('canvas with pink background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // six-digit hexadecimal RGB notation
 * background('#222222');
 * describe('canvas with black background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // integer RGB notation
 * background('rgb(0,255,0)');
 * describe('canvas with bright green background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // integer RGBA notation
 * background('rgba(0,255,0, 0.25)');
 * describe('canvas with soft green background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // percentage RGB notation
 * background('rgb(100%,0%,10%)');
 * describe('canvas with red background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // percentage RGBA notation
 * background('rgba(100%,0%,100%,0.5)');
 * describe('canvas with light purple background');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // p5 Color object
 * background(color(0, 0, 255));
 * describe('canvas with blue background');
 * </code>
 * </div>
 *
 */
inline fun p5.background(color: p5.Color): p5 = asDynamic().background(color) as p5

inline fun p5.background(v1: Int, v2: Int, v3: Int, a: Int? = null): p5 =
    asDynamic().background(v1, v2, v3, a ?: undefined) as p5

inline fun p5.background(grayscale: Int, a: Int? = null): p5 =
    asDynamic().background(grayscale, a ?: undefined) as p5

inline fun p5.background(color: Array<Int>): p5 = asDynamic().background(color) as p5

inline fun p5.background(color: String, a: Int? = null): p5 = asDynamic().background(color, a) as p5

inline fun p5.background(image: p5.Image, a: Int? = null): p5 = asDynamic().background(image, a) as p5


/**
 * Clears the pixels within a buffer. This function only clears the canvas.
 * It will not clear objects created by createX() methods such as
 * <a href="#/p5/createVideo">createVideo()</a> or <a href="#/p5/createDiv">createDiv()</a>.
 * Unlike the main graphics context, pixels in additional graphics areas created
 * with <a href="#/p5/createGraphics">createGraphics()</a> can be entirely
 * or partially transparent. This function clears everything to make all the pixels 100% transparent.
 *
 * Note: In WebGL mode, this function can be passed normalized RGBA color values in
 * order to clear the screen to a specific color. In addition to color, it will also
 * clear the depth buffer. If you are not using the webGL renderer
 * these color values will have no effect.
 *
 * @method clear
 * @chainable
 * @example
 * <div>
 * <code>
 * // Clear the screen on mouse press.
 * function draw() {
 *   ellipse(mouseX, mouseY, 20, 20);
 *   describe(`small white ellipses are continually drawn at mouse’s x and y
 *   coordinates.`);
 * }
 * function mousePressed() {
 *   clear();
 *   background(128);
 *   describe(
 *     'canvas is cleared, small white ellipse is drawn at mouse X and mouse Y'
 *   );
 * }
 * </code>
 * </div>
 *
 * @param {Number} r normalized red val.
 * @param {Number} g normalized green val.
 * @param {Number} b normalized blue val.
 * @param {Number} a normalized alpha val.
 */
inline fun p5.clear(): p5 = asDynamic().clear() as p5

inline fun p5.clear(r: Int? = null, g: Int? = null, b: Int? = null, a: Int? = null): p5 =
    asDynamic().clear(r ?: undefined, g ?: undefined, b ?: undefined, a ?: undefined) as p5


/**
 * <a href="#/p5/colorMode">colorMode()</a> changes the way p5.js interprets
 * color data. By default, the parameters for <a href="#/p5/fill">fill()</a>,
 * <a href="#/p5/stroke">stroke()</a>, <a href="#/p5/background">background()</a>,
 * and <a href="#/p5/color">color()</a> are defined by values between 0 and 255
 * using the RGB color model. This is equivalent to setting colorMode(RGB, 255).
 * Setting colorMode(HSB) lets you use the HSB system instead. By default, this
 * is colorMode(HSB, 360, 100, 100, 1). You can also use HSL.
 *
 * Note: existing color objects remember the mode that they were created in,
 * so you can change modes as you like without affecting their appearance.
 *
 * @method colorMode
 * @param {Constant} [mode] either RGB, HSB or HSL, corresponding to
 *                          Red/Green/Blue and Hue/Saturation/Brightness (or Lightness)
 * @param {Number} [max1] range for the red or hue depending on the
 *                        current color mode
 * @param {Number} [max2] range for the green or saturation depending
 *                        on the current color mode
 * @param {Number} [max3] range for the blue or brightness/lightness
 *                        depending on the current color mode
 * @param {Number} [maxA] range for the alpha

 * @chainable
 *
 * @example
 * <div>
 * <code>
 * noStroke();
 * colorMode(RGB, 100);
 * for (let i = 0; i < 100; i++) {
 *   for (let j = 0; j < 100; j++) {
 *     stroke(i, j, 0);
 *     point(i, j);
 *   }
 * }
 * describe(
 *   'Green to red gradient from bottom left to top right with shading from top left'
 * );
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * noStroke();
 * colorMode(HSB, 100);
 * for (let i = 0; i < 100; i++) {
 *   for (let j = 0; j < 100; j++) {
 *     stroke(i, j, 100);
 *     point(i, j);
 *   }
 * }
 * describe(`Rainbow gradient from left to right.
 * Brightness increasing to white at top.`);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * colorMode(RGB, 255);
 * let c = color(127, 255, 0);
 * colorMode(RGB, 1);
 * let myColor = c._getRed();
 * text(myColor, 10, 10, 80, 80);
 * describe('value of color red 0.4980... written on canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * noFill();
 * colorMode(RGB, 255, 255, 255, 1);
 * background(255);
 * strokeWeight(4);
 * stroke(255, 0, 10, 0.3);
 * ellipse(40, 40, 50, 50);
 * ellipse(50, 50, 40, 40);
 * describe('two translucent pink ellipse outlines at middle left and at center');
 * </code>
 * </div>
 *
 */
inline fun p5.colorMode(mode: String, max1: Int, max2: Int, max3: Int, maxA: Int): p5 =
    asDynamic().colorMode(mode, max1, max2, max3, maxA) as p5

inline fun p5.colorMode(mode: String, max1: Int, max2: Int, max3: Int): p5 =
    asDynamic().colorMode(mode, max1, max2, max3) as p5

inline fun p5.colorMode(mode: String, max1: Int): p5 =
    asDynamic().colorMode(mode, max1) as p5


/**
 * Sets the color used to fill shapes. For example, if you run fill(204, 102, 0),
 * all shapes drawn after the fill command will be filled with the color orange.
 * This color is either specified in terms of the RGB or HSB color depending on
 * the current <a href="#/p5/colorMode">colorMode()</a>. (The default color space
 * is RGB, with each value in the range from 0 to 255). The alpha range by default
 * is also 0 to 255.
 *
 * If a single string argument is provided, RGB, RGBA and Hex CSS color strings
 * and all named color strings are supported. In this case, an alpha number
 * value as a second argument is not supported, the RGBA form should be used.
 *
 * A <a href="#/p5.Color">p5.Color</a> object can also be provided to set the fill color.
 *
 * @method fill
 * @param  {Number} [v1] red or hue value relative to
 *                       the current color range
 * @param  {Number} [v2] green or saturation value
 *                       relative to the current color range
 * @param  {Number} [v3] blue or brightness value
 *                       relative to the current color range
 * @param  {Number} [alpha]
 * @chainable
 * @example
 * <div>
 * <code>
 * // Grayscale integer value
 * fill(51);
 * rect(20, 20, 60, 60);
 * describe('dark charcoal grey rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // R, G & B integer values
 * fill(255, 204, 0);
 * rect(20, 20, 60, 60);
 * describe('yellow rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // H, S & B integer values
 * colorMode(HSB);
 * fill(255, 204, 100);
 * rect(20, 20, 60, 60);
 * describe('royal blue rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Named SVG/CSS color string
 * fill('red');
 * rect(20, 20, 60, 60);
 * describe('red rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // three-digit hexadecimal RGB notation
 * fill('#fae');
 * rect(20, 20, 60, 60);
 * describe('pink rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // six-digit hexadecimal RGB notation
 * fill('#222222');
 * rect(20, 20, 60, 60);
 * describe('black rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // integer RGB notation
 * fill('rgb(0,255,0)');
 * rect(20, 20, 60, 60);
 * describe('bright green rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // integer RGBA notation
 * fill('rgba(0,255,0, 0.25)');
 * rect(20, 20, 60, 60);
 * describe('soft green rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // percentage RGB notation
 * fill('rgb(100%,0%,10%)');
 * rect(20, 20, 60, 60);
 * describe('red rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // percentage RGBA notation
 * fill('rgba(100%,0%,100%,0.5)');
 * rect(20, 20, 60, 60);
 * describe('dark fuchsia rect with black outline in center of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // p5 Color object
 * fill(color(0, 0, 255));
 * rect(20, 20, 60, 60);
 * describe('blue rect with black outline in center of canvas');
 * </code>
 * </div>
 */
inline fun p5.fill(v1: Int, v2: Int, v3: Int, alpha: Int? = null) { asDynamic().fill(v1, v2, v3, alpha ?: undefined) }

inline fun p5.fill(grayscale: Int, a: Int? = null) { asDynamic().fill(grayscale, a ?: undefined) }

inline fun p5.fill(color: Array<Int>) { asDynamic().fill(color) }

inline fun p5.fill(color: String) { asDynamic().fill(color) }

inline fun p5.fill(color: p5.Color) { asDynamic().fill(color) }


/**
 * Disables filling geometry. If both <a href="#/p5/noStroke">noStroke()</a> and <a href="#/p5/noFill">noFill()</a> are called,
 * nothing will be drawn to the screen.
 *
 * @method noFill
 * @chainable
 * @example
 * <div>
 * <code>
 * rect(15, 10, 55, 55);
 * noFill();
 * rect(20, 20, 60, 60);
 * describe(`White rect at top middle and noFill rect center,
 * both with black outlines.`);
 * </code>
 * </div>
 *
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 * }
 *
 * function draw() {
 *   background(0);
 *   noFill();
 *   stroke(100, 100, 240);
 *   rotateX(frameCount * 0.01);
 *   rotateY(frameCount * 0.01);
 *   box(45, 45, 45);
 *   describe('black canvas with purple cube wireframe spinning');
 * }
 * </code>
 * </div>
 */
inline fun p5.noFill(): p5 = asDynamic().noFill() as p5


/**
 * Disables drawing the stroke (outline). If both <a href="#/p5/noStroke">noStroke()</a> and <a href="#/p5/noFill">noFill()</a>
 * are called, nothing will be drawn to the screen.
 *
 * @method noStroke
 * @chainable
 * @example
 * <div>
 * <code>
 * noStroke();
 * rect(20, 20, 60, 60);
 * describe('White rect at center; no outline.');
 * </code>
 * </div>
 *
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 * }
 *
 * function draw() {
 *   background(0);
 *   noStroke();
 *   fill(240, 150, 150);
 *   rotateX(frameCount * 0.01);
 *   rotateY(frameCount * 0.01);
 *   box(45, 45, 45);
 *   describe('black canvas with pink cube spinning');
 * }
 * </code>
 * </div>
 */
inline fun p5.noStroke(): p5 = asDynamic().noStroke() as p5


/**
 * Sets the color used to draw lines and borders around shapes. This color
 * is either specified in terms of the RGB or HSB color depending on the
 * current <a href="#/p5/colorMode">colorMode()</a> (the default color space
 * is RGB, with each value in the range from 0 to 255). The alpha range by
 * default is also 0 to 255.
 *
 * If a single string argument is provided, RGB, RGBA and Hex CSS color
 * strings and all named color strings are supported. In this case, an alpha
 * number value as a second argument is not supported, the RGBA form should be
 * used.
 *
 * A <a href="#/p5.Color">p5.Color</a> object can also be provided to set the stroke color.
 *
 * @method stroke
 * @param  {Number}        v1      red or hue value relative to
 *                                 the current color range
 * @param  {Number}        v2      green or saturation value
 *                                 relative to the current color range
 * @param  {Number}        v3      blue or brightness value
 *                                 relative to the current color range
 * @param  {Number}        [alpha]
 * @chainable
 *
 * @example
 * <div>
 * <code>
 * // Grayscale integer value
 * strokeWeight(4);
 * stroke(51);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with dark charcoal grey outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // R, G & B integer values
 * stroke(255, 204, 0);
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with yellow outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // H, S & B integer values
 * colorMode(HSB);
 * strokeWeight(4);
 * stroke(255, 204, 100);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with royal blue outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Named SVG/CSS color string
 * stroke('red');
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with red outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // three-digit hexadecimal RGB notation
 * stroke('#fae');
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with pink outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // six-digit hexadecimal RGB notation
 * stroke('#222222');
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with black outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // integer RGB notation
 * stroke('rgb(0,255,0)');
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with bright green outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // integer RGBA notation
 * stroke('rgba(0,255,0,0.25)');
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with soft green outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // percentage RGB notation
 * stroke('rgb(100%,0%,10%)');
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with red outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // percentage RGBA notation
 * stroke('rgba(100%,0%,100%,0.5)');
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with dark fuchsia outline.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // p5 Color object
 * stroke(color(0, 0, 255));
 * strokeWeight(4);
 * rect(20, 20, 60, 60);
 * describe('White rect at center with blue outline.');
 * </code>
 * </div>
 */
inline fun p5.stroke(v1: Int, v2: Int, v3: Int, alpha: Int? = undefined): p5 = asDynamic().stroke(v1, v2, v3, alpha) as p5

inline fun p5.stroke(grayscale: Int, a: Int? = undefined): p5 = asDynamic().stroke(grayscale, a) as p5

inline fun p5.stroke(color: Array<Int>): p5 = asDynamic().stroke(color) as p5

inline fun p5.stroke(color: String): p5 = asDynamic().stroke(color) as p5

inline fun p5.stroke(color: p5.Color): p5 = asDynamic().stroke(color) as p5


/**
 * All drawing that follows <a href="#/p5/erase">erase()</a> will subtract from
 * the canvas.Erased areas will reveal the web page underneath the canvas.Erasing
 * can be canceled with <a href="#/p5/noErase">noErase()</a>.
 *
 * Drawing done with <a href="#/p5/image">image()</a> and <a href="#/p5/background">
 * background()</a> in between <a href="#/p5/erase">erase()</a> and
 * <a href="#/p5/noErase">noErase()</a> will not erase the canvas but works as usual.
 *
 * @method erase
 * @param  {Number}   [strengthFill]      A number (0-255) for the strength of erasing for a shape's fill.
 *                                        This will default to 255 when no argument is given, which
 *                                        is full strength.
 * @param  {Number}   [strengthStroke]    A number (0-255) for the strength of erasing for a shape's stroke.
 *                                        This will default to 255 when no argument is given, which
 *                                        is full strength.
 *
 * @chainable
 * @example
 * <div>
 * <code>
 * background(100, 100, 250);
 * fill(250, 100, 100);
 * rect(20, 20, 60, 60);
 * erase();
 * ellipse(25, 30, 30);
 * noErase();
 * describe(`60×60 centered pink rect, purple background.
 * Elliptical area in top-left of rect is erased white.`);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * background(150, 250, 150);
 * fill(100, 100, 250);
 * rect(20, 20, 60, 60);
 * strokeWeight(5);
 * erase(150, 255);
 * triangle(50, 10, 70, 50, 90, 10);
 * noErase();
 * describe(`60×60 centered purple rect, mint green background.
 * Triangle in top-right is partially erased with fully erased outline.`);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function setup() {
 *   smooth();
 *   createCanvas(100, 100, WEBGL);
 *   // Make a &lt;p&gt; element and put it behind the canvas
 *   let p = createP('I am a dom element');
 *   p.center();
 *   p.style('font-size', '20px');
 *   p.style('text-align', 'center');
 *   p.style('z-index', '-9999');
 * }
 *
 * function draw() {
 *   background(250, 250, 150);
 *   fill(15, 195, 185);
 *   noStroke();
 *   sphere(30);
 *   erase();
 *   rotateY(frameCount * 0.02);
 *   translate(0, 0, 40);
 *   torus(15, 5);
 *   noErase();
 *   describe(`60×60 centered teal sphere, yellow background.
 *   Torus rotating around sphere erases to reveal black text underneath.`);
 * }
 * </code>
 * </div>
 */
inline fun p5.erase(strengthFill: Int? = undefined, strengthStroke: Int? = undefined): p5 = asDynamic().erase(strengthFill, strengthStroke) as p5


/**
 * Ends erasing that was started with <a href="#/p5/erase">erase()</a>.
 * The <a href="#/p5/fill">fill()</a>, <a href="#/p5/stroke">stroke()</a>, and
 * <a href="#/p5/blendMode">blendMode()</a> settings will return to what they were
 * prior to calling <a href="#/p5/erase">erase()</a>.
 *
 * @method noErase
 * @chainable
 * @example
 * <div>
 * <code>
 * background(235, 145, 15);
 * noStroke();
 * fill(30, 45, 220);
 * rect(30, 10, 10, 80);
 * erase();
 * ellipse(50, 50, 60);
 * noErase();
 * rect(70, 10, 10, 80);
 * describe(`Orange background, with two tall blue rectangles.
 * A centered ellipse erased the first blue rect but not the second.`);
 * </code>
 * </div>
 */
inline fun p5.noErase(): p5 = asDynamic().noErase() as p5