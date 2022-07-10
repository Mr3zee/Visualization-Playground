@file:Suppress("unused")

package p5.image

import org.w3c.dom.ErrorEvent
import p5.core.p5


/**
 * Loads an image from a path and creates a <a href="#/p5.Image">p5.Image</a> from it.
 *
 * The image may not be immediately available for rendering.
 * If you want to ensure that the image is ready before doing
 * anything with it, place the <a href="#/p5/loadImage">loadImage()</a> call in <a href="#/p5/preload">preload()</a>.
 * You may also supply a callback function to handle the image when it's ready.
 *
 * The path to the image should be relative to the HTML file
 * that links in your sketch. Loading an image from a URL or other
 * remote location may be blocked due to your browser's built-in
 * security.

 * You can also pass in a string of a base64 encoded image as an alternative to the file path.
 * Remember to add "data:image/png;base64," in front of the string.
 *
 * @method loadImage
 * @param  {String} [path] Path of the image to be loaded
 * @param  {function(p5.Image)} [successCallback] Function to be called once
 *                                the image is loaded. Will be passed the
 *                                <a href="#/p5.Image">p5.Image</a>.
 * @param  {function(Event)}    [failureCallback] called with event error if
 *                                the image fails to load.
 * @return {p5.Image}             the <a href="#/p5.Image">p5.Image</a> object
 * @example
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/laDefense.jpg');
 * }
 * function setup() {
 *   image(img, 0, 0);
 * }
 * </code>
 * </div>
 * <div>
 * <code>
 * function setup() {
 *   // here we use a callback to display the image after loading
 *   loadImage('assets/laDefense.jpg', img => {
 *     image(img, 0, 0);
 *   });
 * }
 * </code>
 * </div>
 *
 * @alt
 * image of the underside of a white umbrella and grided ceililng above
 * image of the underside of a white umbrella and grided ceililng above
 */
inline fun p5.loadImage(
    path: String,
    noinline successCallback: (p5.Image) -> Unit = { _ -> },
    noinline failureCallback: (ErrorEvent) -> Unit = { _ -> }
): p5.Image = asDynamic().loadImage(path, successCallback, failureCallback) as p5.Image


/**
 * Draw an image to the p5.js canvas.
 *
 * This function can be used with different numbers of parameters. The
 * simplest use requires only three parameters: img, x, and y—where (x, y) is
 * the position of the image. Two more parameters can optionally be added to
 * specify the width and height of the image.
 *
 * This function can also be used with all eight Number parameters. To
 * differentiate between all these parameters, p5.js uses the language of
 * "destination rectangle" (which corresponds to "dx", "dy", etc.) and "source
 * image" (which corresponds to "sx", "sy", etc.) below. Specifying the
 * "source image" dimensions can be useful when you want to display a
 * subsection of the source image instead of the whole thing. Here's a diagram
 * to explain further:
 * <img src="assets/drawImage.png"></img>
 *
 * @method image
 * @param  {p5.Image|p5.Element|p5.Texture} [img]
 * @param  {Number}   [dx] the x-coordinate of the destination
 *                         rectangle in which to draw the source image
 * @param  {Number}   [dy] the y-coordinate of the destination
 *                         rectangle in which to draw the source image
 * @param  {Number}   [dWidth] the width of the destination rectangle
 * @param  {Number}   [dHeight] the height of the destination rectangle
 * @param  {Number}   [sx] the x-coordinate of the subsection of the source
 *                         image to draw into the destination rectangle
 * @param  {Number}   [sy] the y-coordinate of the subsection of the source
 *                         image to draw into the destination rectangle
 * @param {Number}    [sWidth] the width of the subsection of the
 *                             source image to draw into the destination
 *                             rectangle
 * @param {Number}    [sHeight] the height of the subsection of the
 *                              source image to draw into the destination rectangle
 * @example
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/laDefense.jpg');
 * }
 * function setup() {
 *   // Top-left corner of the img is at (0, 0)
 *   // Width and height are the image's original width and height
 *   image(img, 0, 0);
 * }
 * </code>
 * </div>
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/laDefense.jpg');
 * }
 * function setup() {
 *   background(50);
 *   // Top-left corner of the img is at (10, 10)
 *   // Width and height are 50×50
 *   image(img, 10, 10, 50, 50);
 * }
 * </code>
 * </div>
 * <div>
 * <code>
 * function setup() {
 *   // Here, we use a callback to display the image after loading
 *   loadImage('assets/laDefense.jpg', img => {
 *     image(img, 0, 0);
 *   });
 * }
 * </code>
 * </div>
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/gradient.png');
 * }
 * function setup() {
 *   // 1. Background image
 *   // Top-left corner of the img is at (0, 0)
 *   // Width and height are the image's original width and height, 100×100
 *   image(img, 0, 0);
 *   // 2. Top right image
 *   // Top-left corner of destination rectangle is at (50, 0)
 *   // Destination rectangle width and height are 40×20
 *   // The next parameters are relative to the source image:
 *   // - Starting at position (50, 50) on the source image, capture a 50×50
 *   // subsection
 *   // - Draw this subsection to fill the dimensions of the destination rectangle
 *   image(img, 50, 0, 40, 20, 50, 50, 50, 50);
 * }
 * </code>
 * </div>
 * @alt
 * image of the underside of a white umbrella and gridded ceiling above
 * image of the underside of a white umbrella and gridded ceiling above
 */
inline fun p5.image(
    img: p5.Image,
    dx: Int,
    dy: Int,
    dWidth: Int? = undefined,
    dHeight: Int? = undefined,
    sx: Int? = undefined,
    sy: Int? = undefined,
    sWidth: Int? = undefined,
    sHeight: Int? = undefined,
) { asDynamic().image(img, dx, dy, dWidth, dHeight, sx, sy, sWidth, sHeight) }


/**
 * Sets the fill value for displaying images. Images can be tinted to
 * specified colors or made transparent by including an alpha value.
 *
 * To apply transparency to an image without affecting its color, use
 * white as the tint color and specify an alpha value. For instance,
 * tint(255, 128) will make an image 50% transparent (assuming the default
 * alpha range of 0-255, which can be changed with <a href="#/p5/colorMode">colorMode()</a>).
 *
 * The value for the gray parameter must be less than or equal to the current
 * maximum value as specified by <a href="#/p5/colorMode">colorMode()</a>. The default maximum value is
 * 255.
 *
 * @method tint
 * @param  {Number}        [v1]      red or hue value relative to
 *                                 the current color range
 * @param  {Number}        [v2]      green or saturation value
 *                                 relative to the current color range
 * @param  {Number}        [v3]      blue or brightness value
 *                                 relative to the current color range
 * @param  {Number}        [alpha]
 *
 * @example
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/laDefense.jpg');
 * }
 * function setup() {
 *   image(img, 0, 0);
 *   tint(0, 153, 204); // Tint blue
 *   image(img, 50, 0);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/laDefense.jpg');
 * }
 * function setup() {
 *   image(img, 0, 0);
 *   tint(0, 153, 204, 126); // Tint blue and set transparency
 *   image(img, 50, 0);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/laDefense.jpg');
 * }
 * function setup() {
 *   image(img, 0, 0);
 *   tint(255, 126); // Apply transparency without changing color
 *   image(img, 50, 0);
 * }
 * </code>
 * </div>
 *
 * @alt
 * 2 side by side images of umbrella and ceiling, one image with blue tint
 * Images of umbrella and ceiling, one half of image with blue tint
 * 2 side by side images of umbrella and ceiling, one image translucent
 */
inline fun p5.Renderer2D.tint(v1: Int, v2: Int, v3: Int, alpha: Int? = undefined) { asDynamic().tint(v1, v2, v3, alpha) }

inline fun p5.Renderer2D.tint(grayscale: Int, a: Int? = undefined) { asDynamic().tint(grayscale, a) }

inline fun p5.Renderer2D.tint(color: Array<Int>) { asDynamic().tint(color) }

inline fun p5.Renderer2D.tint(color: String) { asDynamic().tint(color) }

inline fun p5.Renderer2D.tint(color: p5.Color) { asDynamic().tint(color) }


/**
 * Removes the current fill value for displaying images and reverts to
 * displaying images with their original hues.
 *
 * @method noTint
 * @example
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/bricks.jpg');
 * }
 * function setup() {
 *   tint(0, 153, 204); // Tint blue
 *   image(img, 0, 0);
 *   noTint(); // Disable tint
 *   image(img, 50, 0);
 * }
 * </code>
 * </div>
 *
 * @alt
 * 2 side by side images of bricks, left image with blue tint
 */
inline fun p5.noTint() { asDynamic().noTint() }


/**
 * Set image mode. Modifies the location from which images are drawn by
 * changing the way in which parameters given to <a href="#/p5/image">image()</a> are interpreted.
 * The default mode is imageMode(CORNER), which interprets the second and
 * third parameters of <a href="#/p5/image">image()</a> as the upper-left corner of the image. If
 * two additional parameters are specified, they are used to set the image's
 * width and height.
 *
 * imageMode(CORNERS) interprets the second and third parameters of <a href="#/p5/image">image()</a>
 * as the location of one corner, and the fourth and fifth parameters as the
 * opposite corner.
 *
 * imageMode(CENTER) interprets the second and third parameters of <a href="#/p5/image">image()</a>
 * as the image's center point. If two additional parameters are specified,
 * they are used to set the image's width and height.
 *
 * @method imageMode
 * @param {Constant} [m] either CORNER, CORNERS, or CENTER
 * @example
 *
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/bricks.jpg');
 * }
 * function setup() {
 *   imageMode(CORNER);
 *   image(img, 10, 10, 50, 50);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/bricks.jpg');
 * }
 * function setup() {
 *   imageMode(CORNERS);
 *   image(img, 10, 10, 90, 40);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let img;
 * function preload() {
 *   img = loadImage('assets/bricks.jpg');
 * }
 * function setup() {
 *   imageMode(CENTER);
 *   image(img, 50, 50, 80, 80);
 * }
 * </code>
 * </div>
 *
 * @alt
 * small square image of bricks
 * horizontal rectangle image of bricks
 * large square image of bricks
 */
inline fun p5.imageMode(m: String) { asDynamic().imageMode(m) }