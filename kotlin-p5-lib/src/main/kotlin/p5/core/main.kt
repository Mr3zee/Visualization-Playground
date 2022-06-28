/**
 * @file The sole job of the main.js module is to create and then export the constructor
 * function for creating a new p5 object.
 * This constructor function is also called p5, and doesn't use the typical JavaScript
 * convention of capitalizing constructor functions.
 * The constructor handles a number of mechanical startup concerns, including
 * assigning functions and properties from elsewhere in the source code to the newly
 * created p5 object as either public or private methods and properties.
 *
 * Aside from the exported constructor function, the most important thing in this module
 * is the set of functions that define the loop used by nearly every p5.js project:
 * preload(), setup(), draw(), remove(), and so on.
 *
 * @ see <a href="https://github.com/processing/p5.js/blob/main/src/core/main.js">source</a>
 */
@file:Suppress("ClassName", "unused", "MemberVisibilityCanBePrivate", "KDocUnresolvedReference")

package p5.core

import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLElement

@JsModule("p5")
external class p5(sketch: (p5) -> Unit, node: HTMLElement) {
    /**
     * Called directly before <a href="#/p5/setup">setup()</a>, the <a href="#/p5/preload">preload()</a> function is used to handle
     * asynchronous loading of external files in a blocking way. If a preload
     * function is defined, <a href="#/p5/setup">setup()</a> will wait until any load calls within have
     * finished. Nothing besides load calls (<a href="#/p5/loadImage">loadImage</a>, <a href="#/p5/loadJSON">loadJSON</a>, <a href="#/p5/loadFont">loadFont</a>,
     * <a href="#/p5/loadStrings">loadStrings</a>, etc.) should be inside the preload function. If asynchronous
     * loading is preferred, the load methods can instead be called in <a href="#/p5/setup">setup()</a>
     * or anywhere else with the use of a callback parameter.
     *
     * By default the text "loading..." will be displayed. To make your own
     * loading page, include an HTML element with id "p5_loading" in your
     * page. More information <a href="http://bit.ly/2kQ6Nio">here</a>.
     *
     * @method preload
     * @example
     * <div><code>
     * let img;
     * let c;
     * function preload() {
     *   // preload() runs once
     *   img = loadImage('assets/laDefense.jpg');
     * }
     *
     * function setup() {
     *   // setup() waits until preload() is done
     *   img.loadPixels();
     *   // get color of middle pixel
     *   c = img.get(img.width / 2, img.height / 2);
     * }
     *
     * function draw() {
     *   background(c);
     *   image(img, 25, 25, 50, 50);
     * }
     * </code></div>
     *
     * @alt
     * nothing displayed
     *
     */
    var preload: () -> Unit

    /**
     * The <a href="#/p5/setup">setup()</a> function is called once when the program starts. It's used to
     * define initial environment properties such as screen size and background
     * color and to load media such as images and fonts as the program starts.
     * There can only be one <a href="#/p5/setup">setup()</a> function for each program, and it shouldn't
     * be called again after its initial execution.
     *
     * Note: Variables declared within <a href="#/p5/setup">setup()</a> are not accessible within other
     * functions, including <a href="#/p5/draw">draw()</a>.
     *
     * @method setup
     * @example
     * <div><code>
     * let a = 0;
     *
     * function setup() {
     *   background(0);
     *   noStroke();
     *   fill(102);
     * }
     *
     * function draw() {
     *   rect(a++ % width, 10, 2, 80);
     * }
     * </code></div>
     *
     * @alt
     * nothing displayed
     *
     */
    var setup: () -> Unit

    /**
     * Called directly after <a href="#/p5/setup">setup()</a>, the <a href="#/p5/draw">draw()</a> function continuously executes
     * the lines of code contained inside its block until the program is stopped
     * or <a href="#/p5/noLoop">noLoop()</a> is called. Note if <a href="#/p5/noLoop">noLoop()</a> is called in <a href="#/p5/setup">setup()</a>, <a href="#/p5/draw">draw()</a> will
     * still be executed once before stopping. <a href="#/p5/draw">draw()</a> is called automatically and
     * should never be called explicitly.
     *
     * It should always be controlled with <a href="#/p5/noLoop">noLoop()</a>, <a href="#/p5/redraw">redraw()</a> and <a href="#/p5/loop">loop()</a>. After
     * <a href="#/p5/noLoop">noLoop()</a> stops the code in <a href="#/p5/draw">draw()</a> from executing, <a href="#/p5/redraw">redraw()</a> causes the
     * code inside <a href="#/p5/draw">draw()</a> to execute once, and <a href="#/p5/loop">loop()</a> will cause the code
     * inside <a href="#/p5/draw">draw()</a> to resume executing continuously.
     *
     * The number of times <a href="#/p5/draw">draw()</a> executes in each second may be controlled with
     * the <a href="#/p5/frameRate">frameRate()</a> function.
     *
     * There can only be one <a href="#/p5/draw">draw()</a> function for each sketch, and <a href="#/p5/draw">draw()</a> must
     * exist if you want the code to run continuously, or to process events such
     * as <a href="#/p5/mousePressed">mousePressed()</a>. Sometimes, you might have an empty call to <a href="#/p5/draw">draw()</a> in
     * your program, as shown in the above example.
     *
     * It is important to note that the drawing coordinate system will be reset
     * at the beginning of each <a href="#/p5/draw">draw()</a> call. If any transformations are performed
     * within <a href="#/p5/draw">draw()</a> (ex: scale, rotate, translate), their effects will be
     * undone at the beginning of <a href="#/p5/draw">draw()</a>, so transformations will not accumulate
     * over time. On the other hand, styling applied (ex: fill, stroke, etc) will
     * remain in effect.
     *
     * @method draw
     * @example
     * <div><code>
     * let yPos = 0;
     * function setup() {
     *   // setup() runs once
     *   frameRate(30);
     * }
     * function draw() {
     *   // draw() loops forever, until stopped
     *   background(204);
     *   yPos = yPos - 1;
     *   if (yPos < 0) {
     *     yPos = height;
     *   }
     *   line(0, yPos, width, yPos);
     * }
     * </code></div>
     *
     * @alt
     * nothing displayed
     *
     */
    var draw: () -> Unit

    /**
     * Removes the entire p5 sketch. This will remove the canvas and any
     * elements created by p5.js. It will also stop the draw loop and unbind
     * any properties or methods from the window global scope. It will
     * leave a variable p5 in case you wanted to create a new p5 sketch.
     * If you like, you can set p5 = null to erase it. While all functions and
     * variables and objects created by the p5 library will be removed, any
     * other global variables created by your code will remain.
     *
     * @method remove
     * @example
     * <div class='norender'><code>
     * function draw() {
     *   ellipse(50, 50, 10, 10);
     * }
     *
     * function mousePressed() {
     *   remove(); // remove whole sketch on mouse press
     * }
     * </code></div>
     *
     * @alt
     * nothing displayed
     *
     */
    fun remove()

    /**
     * Default value is false
     *
     * Turn off some features of the friendly error system (FES), which can give
     * a significant boost to performance when needed.
     *
     * Note that this will disable the parts of the FES that cause performance
     * slowdown (like argument checking). Friendly errors that have no performance
     * cost (like giving a descriptive error if a file load fails, or warning you
     * if you try to override p5.js functions in the global space),
     * will remain in place.
     *
     * See <a href='https://github.com/processing/p5.js/wiki/Optimizing-p5.js-Code-for-Performance#disable-the-friendly-error-system-fes'>
     * disabling the friendly error system</a>.
     *
     * @property {Boolean} disableFriendlyErrors
     * @example
     * <div class="norender notest"><code>
     * p5.disableFriendlyErrors = true;
     *
     * function setup() {
     *   createCanvas(100, 50);
     * }
     * </code></div>
     *
     */
    var disableFriendlyErrors: Boolean = definedExternally

    /**
     * Base class for all elements added to a sketch, including canvas,
     * graphics buffers, and other HTML elements. It is not called directly, but <a href="#/p5.Element">p5.Element</a>
     * objects are created by calling <a href="#/p5/createCanvas">createCanvas()</a>, <a href="#/p5/createGraphics">createGraphics()</a>,
     * <a href="#/p5/createDiv">createDiv()</a>, <a href="#/p5/createImg">createImg()</a>, <a href="#/p5/createInput">createInput()</a>, etc.
     *
     * @class p5.Element
     * @constructor
     * @param {HTMLElement} [elt] DOM node that is wrapped
     * @param {p5} [pInst] pointer to p5 instance
    */
    open class Element(elt: HTMLElement, pInst: p5) {
        /**
         * Underlying HTML element. All normal HTML methods can be called on this.
         * @example
         * <div>
         * <code>
         * function setup() {
         *   let c = createCanvas(50, 50);
         *   c.elt.style.border = '5px solid red';
         * }
         *
         * function draw() {
         *   background(220);
         * }
         * </code>
         * </div>
         *
         * @property elt
         * @readOnly
         */
        val elt: HTMLElement

        val width: Int

        val height: Int
    }

    /**
     * Main graphics and rendering context, as well as the base API
     * implementation for p5.js "core". To be used as the superclass for
     * Renderer2D and Renderer3D classes, respectively.
     *
     * @class p5.Renderer
     * @constructor
     * @extends p5.Element
     * @param {String} [elt] DOM node that is wrapped
     * @param {p5} [pInst] pointer to p5 instance
     * @param {Boolean} [isMainCanvas] whether we're using it as main canvas
     */
    class Renderer(elt: HTMLElement, pInst: p5, isMainCanvas: Boolean): Element {
        val canvas: HTMLElement
    }

    /**
     * p5.Renderer2D
     * The 2D graphics canvas renderer class.
     * extends p5.Renderer
     */
    class Renderer2D(elt: HTMLElement, pInst: p5, isMainCanvas: Boolean) : Element {
        val drawingContext: CanvasRenderingContext2D?
    }

    /**
     * Thin wrapper around a renderer, to be used for creating a
     * graphics buffer object. Use this class if you need
     * to draw into an off-screen graphics buffer. The two parameters define the
     * width and height in pixels. The fields and methods for this class are
     * extensive, but mirror the normal drawing API for p5.
     *
     * @class p5.Graphics
     * @constructor
     * @extends p5.Element
     * @param {Number} [w]            width
     * @param {Number} [h]            height
     * @param {Constant} [renderer]   the renderer to use, either P2D or WEBGL
     * @param {p5} [pInst]            pointer to p5 instance
     */
    class Graphics(w: Int, h: Int, renderer: String, pInst: p5): Element {
        val canvas: HTMLCanvasElement
    }

    /**
     * Creates a new <a href="#/p5.Image">p5.Image</a>. A <a href="#/p5.Image">p5.Image</a> is a canvas backed representation of an
     * image.
     *
     * p5 can display .gif, .jpg and .png images. Images may be displayed
     * in 2D and 3D space. Before an image is used, it must be loaded with the
     * <a href="#/p5/loadImage">loadImage()</a> function. The <a href="#/p5.Image">p5.Image</a> class contains fields for the width and
     * height of the image, as well as an array called <a href="#/p5.Image/pixels">pixels[]</a> that contains the
     * values for every pixel in the image.
     *
     * The methods described below allow easy access to the image's pixels and
     * alpha channel and simplify the process of compositing.
     *
     * Before using the <a href="#/p5.Image/pixels">pixels[]</a> array, be sure to use the <a href="#/p5.Image/loadPixels">loadPixels()</a> method on
     * the image to make sure that the pixel data is properly loaded.
     * @example
     * <div><code>
     * function setup() {
     *   let img = createImage(100, 100); // same as new p5.Image(100, 100);
     *   img.loadPixels();
     *   createCanvas(100, 100);
     *   background(0);
     *
     *   // helper for writing color to array
     *   function writeColor(image, x, y, red, green, blue, alpha) {
     *     let index = (x + y * width) * 4;
     *     image.pixels[index] = red;
     *     image.pixels[index + 1] = green;
     *     image.pixels[index + 2] = blue;
     *     image.pixels[index + 3] = alpha;
     *   }
     *
     *   let x, y;
     *   // fill with random colors
     *   for (y = 0; y < img.height; y++) {
     *     for (x = 0; x < img.width; x++) {
     *       let red = random(255);
     *       let green = random(255);
     *       let blue = random(255);
     *       let alpha = 255;
     *       writeColor(img, x, y, red, green, blue, alpha);
     *     }
     *   }
     *
     *   // draw a red line
     *   y = 0;
     *   for (x = 0; x < img.width; x++) {
     *     writeColor(img, x, y, 255, 0, 0, 255);
     *   }
     *
     *   // draw a green line
     *   y = img.height - 1;
     *   for (x = 0; x < img.width; x++) {
     *     writeColor(img, x, y, 0, 255, 0, 255);
     *   }
     *
     *   img.updatePixels();
     *   image(img, 0, 0);
     * }
     * </code></div>
     *
     * @class p5.Image
     * @constructor
     * @param {Number} width
     * @param {Number} height
     */
    class Image(width: Int, height: Int) {
        /**
         * Image width.
         * @property {Number} width
         * @readOnly
         * @example
         * <div><code>
         * let img;
         * function preload() {
         *   img = loadImage('assets/rockies.jpg');
         * }
         *
         * function setup() {
         *   createCanvas(100, 100);
         *   image(img, 0, 0);
         *   for (let i = 0; i < img.width; i++) {
         *     let c = img.get(i, img.height / 2);
         *     stroke(c);
         *     line(i, height / 2, i, height);
         *   }
         * }
         * </code></div>
         *
         * @alt
         * rocky mountains in top and horizontal lines in corresponding colors in bottom.
         *
         */
        val width: Int

        /**
         * Image height.
         * @property {Number} height
         * @readOnly
         * @example
         * <div><code>
         * let img;
         * function preload() {
         *   img = loadImage('assets/rockies.jpg');
         * }
         *
         * function setup() {
         *   createCanvas(100, 100);
         *   image(img, 0, 0);
         *   for (let i = 0; i < img.height; i++) {
         *     let c = img.get(img.width / 2, i);
         *     stroke(c);
         *     line(0, i, width / 2, i);
         *   }
         * }
         * </code></div>
         *
         * @alt
         * rocky mountains on right and vertical lines in corresponding colors on left.
         *
         */
        val height: Int

        val canvas: HTMLCanvasElement

        val drawingContext: CanvasRenderingContext2D?

        //Object for working with GIFs, defaults to null
        val gifProperties: dynamic

        /**
         * Array containing the values for all the pixels in the display window.
         * These values are numbers. This array is the size (include an appropriate
         * factor for pixelDensity) of the display window x4,
         * representing the R, G, B, A values in order for each pixel, moving from
         * left to right across each row, then down each column. Retina and other
         * high density displays may have more pixels (by a factor of
         * pixelDensity^2).
         * For example, if the image is 100×100 pixels, there will be 40,000. With
         * pixelDensity = 2, there will be 160,000. The first four values
         * (indices 0-3) in the array will be the R, G, B, A values of the pixel at
         * (0, 0). The second four values (indices 4-7) will contain the R, G, B, A
         * values of the pixel at (1, 0). More generally, to set values for a pixel
         * at (x, y):
         * ```javascript
         * let d = pixelDensity();
         * for (let i = 0; i < d; i++) {
         *   for (let j = 0; j < d; j++) {
         *     // loop over
         *     index = 4 * ((y * d + j) * width * d + (x * d + i));
         *     pixels[index] = r;
         *     pixels[index+1] = g;
         *     pixels[index+2] = b;
         *     pixels[index+3] = a;
         *   }
         * }
         * ```
         *
         * Before accessing this array, the data must loaded with the <a href="#/p5.Image/loadPixels">loadPixels()</a>
         * function. After the array data has been modified, the <a href="#/p5.Image/updatePixels">updatePixels()</a>
         * function must be run to update the changes.
         * @property {Number[]} pixels
         * @example
         * <div>
         * <code>
         * let img = createImage(66, 66);
         * img.loadPixels();
         * for (let i = 0; i < img.width; i++) {
         *   for (let j = 0; j < img.height; j++) {
         *     img.set(i, j, color(0, 90, 102));
         *   }
         * }
         * img.updatePixels();
         * image(img, 17, 17);
         * </code>
         * </div>
         * <div>
         * <code>
         * let pink = color(255, 102, 204);
         * let img = createImage(66, 66);
         * img.loadPixels();
         * for (let i = 0; i < 4 * (width * height / 2); i += 4) {
         *   img.pixels[i] = red(pink);
         *   img.pixels[i + 1] = green(pink);
         *   img.pixels[i + 2] = blue(pink);
         *   img.pixels[i + 3] = alpha(pink);
         * }
         * img.updatePixels();
         * image(img, 17, 17);
         * </code>
         * </div>
         *
         * @alt
         * 66×66 turquoise rect in center of canvas
         * 66×66 pink rect in center of canvas
         *
         */
        val pixels: Array<Array<Int>>
    }


    /**
     * Each color stores the color mode and level maxes that were applied at the
     * time of its construction. These are used to interpret the input arguments
     * (at construction and later for that instance of color) and to format the
     * output e.g. when <a href="#/p5/saturation">saturation()</a> is requested.
     *
     * Internally, we store an array representing the ideal RGBA values in floating
     * point form, normalized from 0 to 1. From this we calculate the closest
     * screen color (RGBA levels from 0 to 255) and expose this to the renderer.
     *
     * We also cache normalized, floating-point components of the color in various
     * representations as they are calculated. This is done to prevent repeating a
     * conversion that has already been performed.
     *
     * @class p5.Color
     * @constructor
     */
    class Color(pInst: p5, vals: Array<Int>) {
        constructor(pInst: p5, vals: String)

        constructor(r: Int, g: Int, b: Int, a: Int)

        constructor(r: Int, g: Int, b: Int)

        constructor(grayscale: Int, a: Int)

        constructor(grayscale: Int)


        val mode: String
    }

    /**
    * A class to describe a two or three-dimensional vector, specifically
    * a Euclidean (also known as geometric) vector. A vector is an entity
    * that has both magnitude and direction. The datatype, however, stores
    * the components of the vector (`x`, `y` for 2D; or `x`, `y`, `z` for 3D). The magnitude
    * and direction can be accessed via the methods <a href="#/p5.Vector/mag">p5.Vector.mag()</a> and <a href="#/p5.Vector/heading">heading()</a>.
    *
    * In many of the p5.js examples, you will see <a href="#/p5.Vector">p5.Vector</a> used to describe a
    * position, velocity, or acceleration. For example, if you consider a rectangle
    * moving across the screen, at any given instant it has a position (a vector
    * that points from the origin to its location), a velocity (the rate at which
    * the object's position changes per time unit, expressed as a vector), and
    * acceleration (the rate at which the object's velocity changes per time
    * unit, expressed as a vector).
    *
    * Since vectors represent groupings of values, we cannot simply use
    * traditional addition/multiplication/etc. Instead, we'll need to do some
    * "vector" math, which is made easy by the methods inside the <a href="#/p5.Vector">p5.Vector</a> class.
    *
    * @class p5.Vector
    * @constructor
    * @param {Number} [x] x component of the vector
    * @param {Number} [y] y component of the vector
    * @param {Number} [z] z component of the vector
    * @example
    * <div>
    * <code>
    * let v1 = createVector(40, 50);
    * let v2 = createVector(40, 50);
    *
    * ellipse(v1.x, v1.y, 50, 50);
    * ellipse(v2.x, v2.y, 50, 50);
    * v1.add(v2);
    * ellipse(v1.x, v1.y, 50, 50);
    *
    * describe(`2 white ellipses. One center-left the other
    *   bottom right and off canvas`);
    * </code>
    * </div>
    */
    class Vector(x: Double, y: Double, z: Double) {
        constructor(x: Double, y: Double)

        constructor(x: Double)

        constructor()

        /**
         * The x component of the vector
         * @property x {Number}
         */
        val x: Double
        /**
         * The y component of the vector
         * @property y {Number}
         */
        val y: Double
        /**
         * The z component of the vector
         * @property z {Number}
         */
        val z: Double

        companion object
    }

}