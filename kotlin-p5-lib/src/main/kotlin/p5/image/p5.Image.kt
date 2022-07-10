/**
 * @file This module defines the <a href="#/p5.Image">p5.Image</a> class and P5 methods for
 * drawing images to the main display canvas.
 */

@file:Suppress("KDocUnresolvedReference", "unused")

package p5.image

import p5.core.p5

/**
 * Loads the pixels data for this image into the [pixels] attribute.
 *
 * @method loadPixels
 * @example
 * <div><code>
 * let myImage;
 * let halfImage;
 *
 * function preload() {
 *   myImage = loadImage('assets/rockies.jpg');
 * }
 *
 * function setup() {
 *   myImage.loadPixels();
 *   halfImage = 4 * myImage.width * myImage.height / 2;
 *   for (let i = 0; i < halfImage; i++) {
 *     myImage.pixels[i + halfImage] = myImage.pixels[i];
 *   }
 *   myImage.updatePixels();
 * }
 *
 * function draw() {
 *   image(myImage, 0, 0, width, height);
 * }
 * </code></div>
 *
 * @alt
 * 2 images of rocky mountains vertically stacked
 */
inline fun p5.Image.loadPixels() { asDynamic().loadPixels() }

/**
 * Updates the backing canvas for this image with the contents of
 * the [pixels] array.
 *
 * If this image is an animated GIF then the pixels will be updated
 * in the frame that is currently displayed.
 *
 * @method updatePixels
 * @param {Integer} [x] x-offset of the target update area for the
 *                              underlying canvas
 * @param {Integer} [y] y-offset of the target update area for the
 *                              underlying canvas
 * @param {Integer} [w] width of the target update area for the
 *                              underlying canvas
 * @param {Integer} [h] height of the target update area for the
 *                              underlying canvas
 * @example
 * <div><code>
 * let myImage;
 * let halfImage;
 *
 * function preload() {
 *   myImage = loadImage('assets/rockies.jpg');
 * }
 *
 * function setup() {
 *   myImage.loadPixels();
 *   halfImage = 4 * myImage.width * myImage.height / 2;
 *   for (let i = 0; i < halfImage; i++) {
 *     myImage.pixels[i + halfImage] = myImage.pixels[i];
 *   }
 *   myImage.updatePixels();
 * }
 *
 * function draw() {
 *   image(myImage, 0, 0, width, height);
 * }
 * </code></div>
 *
 * @alt
 * 2 images of rocky mountains vertically stacked
 */
/**
 * @method updatePixels
 */
inline fun p5.Image.updatePixels(x: Int, y: Int, w: Int, h: Int) {
    asDynamic().updatePixels(x, y, w, h)
}

inline fun p5.Image.updatePixels() {
    asDynamic().updatePixels()
}

/**
 * Get a region of pixels from an image.
 *
 * If no params are passed, the whole image is returned.
 * If x and y are the only params passed a single pixel is extracted.
 * If all params are passed a rectangle region is extracted and a <a href="#/p5.Image">p5.Image</a>
 * is returned.
 *
 * @method get
 * @param  {Number}               x x-coordinate of the pixel
 * @param  {Number}               y y-coordinate of the pixel
 * @param  {Number}               w width
 * @param  {Number}               h height
 * @return {p5.Image}             the rectangle <a href="#/p5.Image">p5.Image</a>
 * @example
 * <div><code>
 * let myImage;
 * let c;
 *
 * function preload() {
 *   myImage = loadImage('assets/rockies.jpg');
 * }
 *
 * function setup() {
 *   background(myImage);
 *   noStroke();
 *   c = myImage.get(60, 90);
 *   fill(c);
 *   rect(25, 25, 50, 50);
 * }
 *
 * //get() returns color here
 * </code></div>
 *
 * @alt
 * image of rocky mountains with 50×50 green rect in front
 */
/**
 * @method get
 * @return {p5.Image}      the whole <a href="#/p5.Image">p5.Image</a>
 */
/**
 * @method get
 * @param  {Number}        x
 * @param  {Number}        y
 * @return {Number[]}      color of pixel at x,y in array format [R, G, B, A]
 */
inline fun p5.Image.get(x: Int, y: Int): Array<Int> = asDynamic().get(x, y) as Array<Int>

inline fun p5.Image.get(x: Int, y: Int, w: Int, h: Int): p5.Image = asDynamic().get(x, y, w, h) as p5.Image

/**
 * Set the color of a single pixel or write an image into
 * this <a href="#/p5.Image">p5.Image</a>.
 *
 * Note that for a large number of pixels this will
 * be slower than directly manipulating the pixels array
 * and then calling <a href="#/p5.Image/updatePixels">updatePixels()</a>.
 *
 * @method set
 * @param {Number}              x x-coordinate of the pixel
 * @param {Number}              y y-coordinate of the pixel
 * @param {Number|Number[]|Object}   a grayscale value | pixel array |
 *                                a <a href="#/p5.Color">p5.Color</a> | image to copy
 * @example
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
 * @alt
 * 2 gradated dark turquoise rects fade left. 1 center 1 bottom right of canvas
 */
inline fun p5.Image.set(x: Int, y: Int, imgOrCol: Int) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.Image.set(x: Int, y: Int, imgOrCol: Array<Int>) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.Image.set(x: Int, y: Int, imgOrCol: p5.Image) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.Image.set(x: Int, y: Int, imgOrCol: p5.Color) { asDynamic().set(x, y, imgOrCol) }

/**
 * Resize the image to a new width and height. To make the image scale
 * proportionally, use 0 as the value for the wide or high parameter.
 * For instance, to make the width of an image 150 pixels, and change
 * the height using the same proportion, use resize(150, 0).
 *
 * @method resize
 * @param {Number} [width] the resized image width
 * @param {Number} [height] the resized image height
 * @example
 * <div><code>
 * let img;
 *
 * function preload() {
 *   img = loadImage('assets/rockies.jpg');
 * }

 * function draw() {
 *   image(img, 0, 0);
 * }
 *
 * function mousePressed() {
 *   img.resize(50, 100);
 * }
 * </code></div>
 *
 * @alt
 * image of rocky mountains. zoomed in
 */
inline fun p5.Image.resize(width: Int, height: Int) { asDynamic().resize(width, height) }

/**
 * Copies a region of pixels from one image to another. If no
 * srcImage is specified this is used as the source. If the source
 * and destination regions aren't the same size, it will
 * automatically resize source pixels to fit the specified
 * target region.
 *
 * @method copy
 * @param  {p5.Image|p5.Element} [srcImage] source image
 * @param  {Integer} [sx] X coordinate of the source's upper left corner
 * @param  {Integer} [sy] Y coordinate of the source's upper left corner
 * @param  {Integer} [sw] source image width
 * @param  {Integer} [sh] source image height
 * @param  {Integer} [dx] X coordinate of the destination's upper left corner
 * @param  {Integer} [dy] Y coordinate of the destination's upper left corner
 * @param  {Integer} [dw] destination image width
 * @param  {Integer} [dh] destination image height
 * @example
 * <div><code>
 * let photo;
 * let bricks;
 * let x;
 * let y;
 *
 * function preload() {
 *   photo = loadImage('assets/rockies.jpg');
 *   bricks = loadImage('assets/bricks.jpg');
 * }
 *
 * function setup() {
 *   x = bricks.width / 2;
 *   y = bricks.height / 2;
 *   photo.copy(bricks, 0, 0, x, y, 0, 0, x, y);
 *   image(photo, 0, 0);
 * }
 * </code></div>
 *
 * @alt
 * image of rocky mountains and smaller image on top of bricks at top left
 */
/**
 * @method copy
 * @param  {Integer} sx
 * @param  {Integer} sy
 * @param  {Integer} sw
 * @param  {Integer} sh
 * @param  {Integer} dx
 * @param  {Integer} dy
 * @param  {Integer} dw
 * @param  {Integer} dh
 */
inline fun p5.Image.copy(srcImage: p5.Image, sx: Int, sy: Int, sw: Int, sh: Int, dx: Int, dy: Int, dw: Int, dh: Int) {
    asDynamic().copy(srcImage, sx, sy, sw, sh, dx, dy, dw, dh)
}

inline fun p5.Image.copy(sx: Int, sy: Int, sw: Int, sh: Int, dx: Int, dy: Int, dw: Int, dh: Int) {
    asDynamic().copy(sx, sy, sw, sh, dx, dy, dw, dh)
}

/**
 * !!! NOTE: at the moment this method does not match native processing's original functionality exactly.
 *
 * Masks part of an image from displaying by loading another
 * image and using its alpha channel as an alpha channel for
 * this image. Masks are cumulative, once applied to an image
 * object, they cannot be removed.
 *
 * @method mask
 * @param {p5.Image} srcImage source image
 * @example
 * <div><code>
 * let photo, maskImage;
 * function preload() {
 *   photo = loadImage('assets/rockies.jpg');
 *   maskImage = loadImage('assets/mask2.png');
 * }
 *
 * function setup() {
 *   createCanvas(100, 100);
 *   photo.mask(maskImage);
 *   image(photo, 0, 0);
 * }
 * </code></div>
 *
 * @alt
 * image of rocky mountains with white at right
 *
 * http://blogs.adobe.com/webplatform/2013/01/28/blending-features-in-canvas/
 */
inline fun p5.Image.mask(p5Image: p5.Image) { asDynamic().mask(p5Image) }

/**
 * Applies an image filter to a <a href="#/p5.Image">p5.Image</a>
 *
 * THRESHOLD
 * Converts the image to black and white pixels depending if they are above or
 * below the threshold defined by the level parameter. The parameter must be
 * between 0.0 (black) and 1.0 (white). If no level is specified, 0.5 is used.
 *
 * GRAY
 * Converts any colors in the image to grayscale equivalents. No parameter
 * is used.
 *
 * OPAQUE
 * Sets the alpha channel to entirely opaque. No parameter is used.
 *
 * INVERT
 * Sets each pixel to its inverse value. No parameter is used.
 *
 * POSTERIZE
 * Limits each channel of the image to the number of colors specified as the
 * parameter. The parameter can be set to values between 2 and 255, but
 * results are most noticeable in the lower ranges.
 *
 * BLUR
 * Executes a Gaussian blur with the level parameter specifying the extent
 * of the blurring. If no parameter is used, the blur is equivalent to
 * Gaussian blur of radius 1. Larger values increase the blur.
 *
 * ERODE
 * Reduces the light areas. No parameter is used.
 *
 * DILATE
 * Increases the light areas. No parameter is used.
 *
 * filter() does not work in WEBGL mode.
 * A similar effect can be achieved in WEBGL mode using custom
 * shaders. Adam Ferriss has written
 * a <a href="https://github.com/aferriss/p5jsShaderExamples"
 * target='_blank'>selection of shader examples</a> that contains many
 * of the effects present in the filter examples.
 *
 * @method filter
 * @param  {Constant} [filterType]  either THRESHOLD, GRAY, OPAQUE, INVERT,
 *                                POSTERIZE, ERODE, DILATE or BLUR.
 *                                See Filters.js for docs on
 *                                each available filter
 * @param  {Number} [filterParam] an optional parameter unique
 *                                to each filter, see above
 * @example
 * <div><code>
 * let photo1;
 * let photo2;
 *
 * function preload() {
 *   photo1 = loadImage('assets/rockies.jpg');
 *   photo2 = loadImage('assets/rockies.jpg');
 * }
 *
 * function setup() {
 *   photo2.filter(GRAY);
 *   image(photo1, 0, 0);
 *   image(photo2, width / 2, 0);
 * }
 * </code></div>
 *
 * @alt
 * 2 images of rocky mountains left one in color, right in black and white
 */
inline fun p5.Image.filter(filterType: String, filterParam: dynamic = undefined) {
    asDynamic().filter(filterType, filterParam)
}

/**
 * Copies a region of pixels from one image to another, using a specified
 * blend mode to do the operation.
 *
 * @method blend
 * @param  {p5.Image} [srcImage] source image
 * @param  {Integer} [sx] X coordinate of the source's upper left corner
 * @param  {Integer} [sy] Y coordinate of the source's upper left corner
 * @param  {Integer} [sw] source image width
 * @param  {Integer} [sh] source image height
 * @param  {Integer} [dx] X coordinate of the destination's upper left corner
 * @param  {Integer} [dy] Y coordinate of the destination's upper left corner
 * @param  {Integer} [dw] destination image width
 * @param  {Integer} [dh] destination image height
 * @param  {Constant} [blendMode] the blend mode. either
 *     BLEND, DARKEST, LIGHTEST, DIFFERENCE,
 *     MULTIPLY, EXCLUSION, SCREEN, REPLACE, OVERLAY, HARD_LIGHT,
 *     SOFT_LIGHT, DODGE, BURN, ADD or NORMAL.
 *
 * Available blend modes are: normal | multiply | screen | overlay |
 *            darken | lighten | color-dodge | color-burn | hard-light |
 *            soft-light | difference | exclusion | hue | saturation |
 *            color | luminosity
 *
 * http://blogs.adobe.com/webplatform/2013/01/28/blending-features-in-canvas/
 * @example
 * <div><code>
 * let mountains;
 * let bricks;
 *
 * function preload() {
 *   mountains = loadImage('assets/rockies.jpg');
 *   bricks = loadImage('assets/bricks_third.jpg');
 * }
 *
 * function setup() {
 *   mountains.blend(bricks, 0, 0, 33, 100, 67, 0, 33, 100, ADD);
 *   image(mountains, 0, 0);
 *   image(bricks, 0, 0);
 * }
 * </code></div>
 * <div><code>
 * let mountains;
 * let bricks;
 *
 * function preload() {
 *   mountains = loadImage('assets/rockies.jpg');
 *   bricks = loadImage('assets/bricks_third.jpg');
 * }
 *
 * function setup() {
 *   mountains.blend(bricks, 0, 0, 33, 100, 67, 0, 33, 100, DARKEST);
 *   image(mountains, 0, 0);
 *   image(bricks, 0, 0);
 * }
 * </code></div>
 * <div><code>
 * let mountains;
 * let bricks;
 *
 * function preload() {
 *   mountains = loadImage('assets/rockies.jpg');
 *   bricks = loadImage('assets/bricks_third.jpg');
 * }
 *
 * function setup() {
 *   mountains.blend(bricks, 0, 0, 33, 100, 67, 0, 33, 100, LIGHTEST);
 *   image(mountains, 0, 0);
 *   image(bricks, 0, 0);
 * }
 * </code></div>
 *
 * @alt
 * image of rocky mountains. Brick images on left and right. Right overexposed
 * image of rockies. Brickwall images on left and right. Right mortar transparent
 * image of rockies. Brickwall images on left and right. Right translucent
 */
inline fun p5.Image.blend(srcImage: p5.Image, sx: Int, sy: Int, sw: Int, sh: Int, dx: Int, dy: Int, dw: Int, dh: Int, blendMode: String) {
    asDynamic().blend(srcImage, sx, sy, sw, sh, dx, dy, dw, dh, blendMode)
}

inline fun p5.Image.blend(sx: Int, sy: Int, sw: Int, sh: Int, dx: Int, dy: Int, dw: Int, dh: Int, blendMode: String) {
    asDynamic().blend(sx, sy, sw, sh, dx, dy, dw, dh, blendMode)
}

/**
 * Saves the image to a file and force the browser to download it.
 * Accepts two strings for filename and file extension
 * Supports png (default), jpg, and gif
 *<br><br>
 * Note that the file will only be downloaded as an animated GIF
 * if the p5.Image was loaded from a GIF file.
 * @method save
 * @param {String} [filename] give your file a name
 * @param  {String} [extension] 'png' or 'jpg'
 * @example
 * <div><code>
 * let photo;
 *
 * function preload() {
 *   photo = loadImage('assets/rockies.jpg');
 * }
 *
 * function draw() {
 *   image(photo, 0, 0);
 * }
 *
 * function keyTyped() {
 *   if (key === 's') {
 *     photo.save('photo', 'png');
 *   }
 * }
 * </code></div>
 *
 * @alt
 * image of rocky mountains.
 */
inline fun p5.Image.save(filename: String, extension: String) { asDynamic().save(filename, extension) }

// GIF Section
/**
 * Starts an animated GIF over at the beginning state.
 *
 * @method reset
 * @example
 * <div><code>
 * let gif;
 *
 * function preload() {
 *   gif = loadImage('assets/arnott-wallace-wink-loop-once.gif');
 * }
 *
 * function draw() {
 *   background(255);
 *   // The GIF file that we loaded only loops once
 *   // so it freezes on the last frame after playing through
 *   image(gif, 0, 0);
 * }
 *
 * function mousePressed() {
 *   // Click to reset the GIF and begin playback from start
 *   gif.reset();
 * }
 * </code></div>
 * @alt
 * Animated image of a cartoon face that winks once and then freezes
 * When you click it animates again, winks once and freezes
 */
inline fun p5.Image.reset() { asDynamic().reset() }

/**
 * Gets the index for the frame that is currently visible in an animated GIF.
 *
 * @method getCurrentFrame
 * @return {Number} The index for the currently displaying frame in animated GIF
 * @example
 * <div><code>
 * let gif;
 *
 * function preload() {
 *   gif = loadImage('assets/arnott-wallace-eye-loop-forever.gif');
 * }
 *
 * function draw() {
 *   let frame = gif.getCurrentFrame();
 *   image(gif, 0, 0);
 *   text(frame, 10, 90);
 * }
 * </code></div>
 * @alt
 * Animated image of a cartoon eye looking around and then
 * looking outwards, in the lower-left hand corner a number counts
 * up quickly to 124 and then starts back over at 0
 */
inline fun p5.Image.getCurrentFrame(): Int? = asDynamic().getCurrentFrame as Int?

/**
 * Sets the index of the frame that is currently visible in an animated GIF
 *
 * @method setFrame
 * @param {Number} [index] the index for the frame that should be displayed
 * @example
 * <div><code>
 * let gif;
 *
 * function preload() {
 *   gif = loadImage('assets/arnott-wallace-eye-loop-forever.gif');
 * }
 *
 * // Move your mouse up and down over canvas to see the GIF
 * // frames animate
 * function draw() {
 *   gif.pause();
 *   image(gif, 0, 0);
 *   // Get the highest frame number which is the number of frames - 1
 *   let maxFrame = gif.numFrames() - 1;
 *   // Set the current frame that is mapped to be relative to mouse position
 *   let frameNumber = floor(map(mouseY, 0, height, 0, maxFrame, true));
 *   gif.setFrame(frameNumber);
 * }
 * </code></div>
 * @alt
 * A still image of a cartoon eye that looks around when you move your mouse
 * up and down over the canvas
 */
inline fun p5.Image.setFrame(index: Int) { asDynamic().setFrame(index) }

/**
 * Returns the number of frames in an animated GIF
 *
 * @method numFrames
 * @return {Number}
 * @example The number of frames in the animated GIF
 * <div><code>
 * let gif;
 *
 * function preload() {
 *   gif = loadImage('assets/arnott-wallace-eye-loop-forever.gif');
 * }
 *
 * // Move your mouse up and down over canvas to see the GIF
 * // frames animate
 * function draw() {
 *   gif.pause();
 *   image(gif, 0, 0);
 *   // Get the highest frame number which is the number of frames - 1
 *   let maxFrame = gif.numFrames() - 1;
 *   // Set the current frame that is mapped to be relative to mouse position
 *   let frameNumber = floor(map(mouseY, 0, height, 0, maxFrame, true));
 *   gif.setFrame(frameNumber);
 * }
 * </code></div>
 * @alt
 * A still image of a cartoon eye that looks around when you move your mouse
 * up and down over the canvas
 */
inline fun p5.Image.numFrames(): Int? = asDynamic().numFrames() as Int?

/**
 * Plays an animated GIF that was paused with
 * <a href="#/p5.Image/pause">pause()</a>
 *
 * @method play
 * @example
 * <div><code>
 * let gif;
 *
 * function preload() {
 *   gif = loadImage('assets/nancy-liang-wind-loop-forever.gif');
 * }
 *
 * function draw() {
 *   background(255);
 *   image(gif, 0, 0);
 * }
 *
 * function mousePressed() {
 *   gif.pause();
 * }
 *
 * function mouseReleased() {
 *   gif.play();
 * }
 * </code></div>
 * @alt
 * An animated GIF of a drawing of small child with
 * hair blowing in the wind, when you click the image
 * freezes when you release it animates again
 */
inline fun p5.Image.play() { asDynamic().play() }

/**
 * Pauses an animated GIF.
 *
 * @method pause
 * @example
 * <div><code>
 * let gif;
 *
 * function preload() {
 *   gif = loadImage('assets/nancy-liang-wind-loop-forever.gif');
 * }
 *
 * function draw() {
 *   background(255);
 *   image(gif, 0, 0);
 * }
 *
 * function mousePressed() {
 *   gif.pause();
 * }
 *
 * function mouseReleased() {
 *   gif.play();
 * }
 * </code></div>
 * @alt
 * An animated GIF of a drawing of small child with
 * hair blowing in the wind, when you click the image
 * freezes when you release it animates again
 */
inline fun p5.Image.pause() { asDynamic().pause() }

/**
 * Changes the delay between frames in an animated GIF. There is an optional second parameter that
 * indicates an index for a specific frame that should have its delay modified. If no index is given, all frames
 * will have the new delay.
 *
 * @method delay
 * @param {Number} [d] the amount in milliseconds to delay between switching frames
 * @param {Number} [index] the index of the frame that should have the new delay value {optional}
 * @example
 * <div><code>
 * let gifFast, gifSlow;
 *
 * function preload() {
 *   gifFast = loadImage('assets/arnott-wallace-eye-loop-forever.gif');
 *   gifSlow = loadImage('assets/arnott-wallace-eye-loop-forever.gif');
 * }
 *
 * function setup() {
 *   gifFast.resize(width / 2, height / 2);
 *   gifSlow.resize(width / 2, height / 2);
 *
 *   //Change the delay here
 *   gifFast.delay(10);
 *   gifSlow.delay(100);
 * }
 *
 * function draw() {
 *   background(255);
 *   image(gifFast, 0, 0);
 *   image(gifSlow, width / 2, 0);
 * }
 * </code></div>
 * @alt
 * Two animated gifs of cartoon eyes looking around
 * The gif on the left animates quickly, on the right
 * the animation is much slower
 */
inline fun p5.Image.delay(d: Int, index: Int? = null) { asDynamic().delay(d, index ?: undefined) }