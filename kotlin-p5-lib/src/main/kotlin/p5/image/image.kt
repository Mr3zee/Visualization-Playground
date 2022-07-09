/**
 * @file This module defines the p5 methods for the <a href="#/p5.Image">p5.Image</a> class
 * for drawing images to the main display canvas.
 */

@file:Suppress("unused")

package p5.image

import org.w3c.dom.HTMLCanvasElement
import p5.core.p5


/**
 * Creates a new <a href="#/p5.Image">p5.Image</a> (the datatype for storing images). This provides a
 * fresh buffer of pixels to play with. Set the size of the buffer with the
 * width and height parameters.
 *
 * .<a href="#/p5.Image/pixels">pixels</a> gives access to an array containing the values for all the pixels
 * in the display window.
 * These values are numbers. This array is the size (including an appropriate
 * factor for the <a href="#/p5/pixelDensity">pixelDensity</a>) of the display window x4,
 * representing the R, G, B, A values in order for each pixel, moving from
 * left to right across each row, then down each column. See .<a href="#/p5.Image/pixels">pixels</a> for
 * more info. It may also be simpler to use <a href="#/p5.Image/set">set()</a> or <a href="#/p5.Image/get">get()</a>.
 *
 * Before accessing the pixels of an image, the data must loaded with the
 * <a href="#/p5.Image/loadPixels">loadPixels()</a> function. After the array data has been modified, the
 * <a href="#/p5.Image/updatePixels">updatePixels()</a> function must be run to update the changes.
 *
 * @method createImage
 * @param  {Integer} [width]  width in pixels
 * @param  {Integer} [height] height in pixels
 * @return {p5.Image} the <a href="#/p5.Image">p5.Image</a> object
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
 *
 * <div>
 * <code>
 * let img = createImage(66, 66);
 * img.loadPixels();
 * for (let i = 0; i < img.width; i++) {
 *   for (let j = 0; j < img.height; j++) {
 *     img.set(i, j, color(0, 90, 102, (i % img.width) * 2));
 *   }
 * }
 * img.updatePixels();
 * image(img, 17, 17);
 * image(img, 34, 34);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let pink = color(255, 102, 204);
 * let img = createImage(66, 66);
 * img.loadPixels();
 * let d = pixelDensity();
 * let halfImage = 4 * (img.width * d) * (img.height / 2 * d);
 * for (let i = 0; i < halfImage; i += 4) {
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
 * 66×66 dark turquoise rect in center of canvas.
 * 2 gradated dark turquoise rects fade left. 1 center 1 bottom right of canvas
 * no image displayed
 */
@Suppress("KDocUnresolvedReference")
inline fun p5.createImage(width: Double, height: Double): p5.Image = asDynamic().createImage(width, height) as p5.Image


/**
 *  Save the current canvas as an image. The browser will either save the
 *  file immediately, or prompt the user with a dialogue window.
 *
 *  @method saveCanvas
 *  @param  {p5.Element|HTMLCanvasElement} [selectedCanvas] a variable representing a specific html5 canvas (optional)
 *  @param  {String} [filename]
 *  @param  {String} [extension] 'jpg' or 'png'
 *
 *  @example
 * <div class='norender notest'><code>
 * function setup() {
 *   let c = createCanvas(100, 100);
 *   background(255, 0, 0);
 *   saveCanvas(c, 'myCanvas', 'jpg');
 * }
 * </code></div>
 * <div class='norender notest'><code>
 * // note that this example has the same result as above
 * // if no canvas is specified, defaults to main canvas
 * function setup() {
 *   let c = createCanvas(100, 100);
 *   background(255, 0, 0);
 *   saveCanvas('myCanvas', 'jpg');
 *
 *   // all of the following are valid
 *   saveCanvas(c, 'myCanvas', 'jpg');
 *   saveCanvas(c, 'myCanvas.jpg');
 *   saveCanvas(c, 'myCanvas');
 *   saveCanvas(c);
 *   saveCanvas('myCanvas', 'png');
 *   saveCanvas('myCanvas');
 *   saveCanvas();
 * }
 * </code></div>
 *
 * @alt
 * no image displayed
 * no image displayed
 * no image displayed
 */
inline fun p5.saveCanvas(selectedCanvas: HTMLCanvasElement, filename: String, extension: String) {
    asDynamic().saveCanvas(selectedCanvas, filename, extension)
}

inline fun p5.saveCanvas(selectedCanvas: p5.Element, filename: String, extension: String) {
    asDynamic().saveCanvas(selectedCanvas, filename, extension)
}

inline fun p5.saveCanvas(filename: String, extension: String) {
    asDynamic().saveCanvas(filename, extension)
}

/**
 * TODO docs
 */
inline fun p5.saveGif(pImg: p5.Image, filename: String) { asDynamic().saveGif(pImg, filename) }


/**
 *  Capture a sequence of frames that can be used to create a movie.
 *  Accepts a callback. For example, you may wish to send the frames
 *  to a server where they can be stored or converted into a movie.
 *  If no callback is provided, the browser will pop up save dialogues in an
 *  attempt to download all the images that have just been created. With the
 *  callback provided the image data isn't saved by default but instead passed
 *  as an argument to the callback function as an array of objects, with the
 *  size of array equal to the total number of frames.
 *
 *  The arguments `duration` and `framerate` are constrained to be less or equal to 15 and 22, respectively, which means you
 *  can only download a maximum of 15 seconds worth of frames at 22 frames per second, adding up to 330 frames.
 *  This is done in order to avoid memory problems since a large enough canvas can fill up the memory in your computer
 *  very easily and crash your program or even your browser.
 *
 *  To export longer animations, you might look into a library like
 *  <a href="https://github.com/spite/ccapture.js/">ccapture.js</a>.
 *
 *  @method saveFrames
 *  @param  {String} [filename]
 *  @param  {String} [extension] 'jpg' or 'png'
 *  @param  {Number} [duration]  Duration in seconds to save the frames for. This parameter will be constrained to be less or equal to 15.
 *  @param  {Number} [framerate]  Framerate to save the frames in. This parameter will be constrained to be less or equal to 22.
 *  @param  {function(Array)} [callback] A callback function that will be executed
 *
 *  to handle the image data. This function
 *  should accept an array as argument. The
 *  array will contain the specified number of
 *  frames of objects. Each object has three
 *  properties: imageData - an
 *  image/octet-stream, filename and extension.
 *  @example
 *  <div><code>
 *  function draw() {
 *    background(mouseX);
 *  }
 *
 *  function mousePressed() {
 *    saveFrames('out', 'png', 1, 25, data => {
 *      print(data);
 *    });
 *  }
 *  </code></div>
 *
 * @alt
 * canvas background goes from light to dark with mouse x.
 */
inline fun p5.saveFrames(
    filename: String,
    extension: String,
    duration: Int? = undefined,
    framerate: Int? = undefined,
    noinline callback: (Array<FrameData>) -> Unit = {}
) { asDynamic().saveFrames(filename, extension, duration, framerate, callback) }

@JsModule("p5")
external interface FrameData {
    val imageData: String
    val filename: String
    val ext: String
}