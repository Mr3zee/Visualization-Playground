@file:Suppress("unused")

package p5.core

/**
 * Resets certain values such as those modified by functions in the Transform category
 * and in the Lights category that are not automatically reset
 * with graphics buffer objects. Calling this in <a href='#/p5/draw'>draw()</a> will copy the behavior
 * of the standard canvas.
 *
 * @method reset
 * @example
 *
 * <div><code>
 * let pg;
 * function setup() {
 *   createCanvas(100, 100);
 *   background(0);
 *   pg = createGraphics(50, 100);
 *   pg.fill(0);
 *   frameRate(5);
 * }
 *
 * function draw() {
 *   image(pg, width / 2, 0);
 *   pg.background(255);
 *   // p5.Graphics object behave a bit differently in some cases
 *   // The normal canvas on the left resets the translate
 *   // with every loop through draw()
 *   // the graphics object on the right doesn't automatically reset
 *   // so translate() is additive, and it moves down the screen
 *   rect(0, 0, width / 2, 5);
 *   pg.rect(0, 0, width / 2, 5);
 *   translate(0, 5, 0);
 *   pg.translate(0, 5, 0);
 * }
 * function mouseClicked() {
 *   // if you click you will see that
 *   // reset() resets the translate back to the initial state
 *   // of the Graphics object
 *   pg.reset();
 * }
 * </code></div>
 *
 * @alt
 * A white line on a black background stays still on the top-left half.
 * A black line animates from top to bottom on a white background on the right half.
 * When clicked, the black line starts back over at the top.
 */
inline fun p5.Graphics.reset() { asDynamic().reset() }

/**
 * Removes a Graphics object from the page and frees any resources
 * associated with it.
 *
 * @method remove
 *
 * @example
 * <div class='norender'><code>
 * let bg;
 * function setup() {
 *   bg = createCanvas(100, 100);
 *   bg.background(0);
 *   image(bg, 0, 0);
 *   bg.remove();
 * }
 * </code></div>
 *
 * <div><code>
 * let bg;
 * function setup() {
 *   pixelDensity(1);
 *   createCanvas(100, 100);
 *   stroke(255);
 *   fill(0);
 *
 *   // create and draw the background image
 *   bg = createGraphics(100, 100);
 *   bg.background(200);
 *   bg.ellipse(50, 50, 80, 80);
 * }
 * function draw() {
 *   let t = millis() / 1000;
 *   // draw the background
 *   if (bg) {
 *     image(bg, frameCount % 100, 0);
 *     image(bg, frameCount % 100 - 100, 0);
 *   }
 *   // draw the foreground
 *   let p = p5.Vector.fromAngle(t, 35).add(50, 50);
 *   ellipse(p.x, p.y, 30);
 * }
 * function mouseClicked() {
 *   // remove the background
 *   if (bg) {
 *     bg.remove();
 *     bg = null;
 *   }
 * }
 * </code></div>
 *
 * @alt
 * no image
 * a multicolored circle moving back and forth over a scrolling background.
 */
inline fun p5.Graphics.remove() { asDynamic().remove() }
