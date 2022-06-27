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
    class Element(elt: HTMLElement, pInst: p5) {
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
}