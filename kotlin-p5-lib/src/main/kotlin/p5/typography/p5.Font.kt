/**
 * @file This module defines the <a href="#/p5.Font">p5.Font</a> class and functions for
 * drawing text to the display canvas.
 * @module Typography
 * @submodule Loading & Displaying
 * @requires core
 * @requires constants
 */

@file:Suppress("unused")

package p5.typography

import kotlinx.js.Object
import p5.core.p5


/**
 * Returns a tight bounding box for the given text string using this
 * font
 *
 * @method textBounds
 * @param  {String} [str] a line of text
 * @param  {Number} [x] x-position
 * @param  {Number} [y] y-position
 * @param  {Number} [fontSize] font size to use (optional) Default is 12.
 * @param  {Object} [options] opentype options (optional)
 *                            opentype fonts contains alignment and baseline options.
 *                            Default is 'LEFT' and 'alphabetic'
 *
 * @return {Object}          a rectangle object with properties: x, y, w, h
 *
 * @example
 * <div>
 * <code>
 * let font;
 * let textString = 'Lorem ipsum dolor sit amet.';
 * function preload() {
 *   font = loadFont('./assets/Regular.otf');
 * }
 * function setup() {
 *   background(210);
 *
 *   let bbox = font.textBounds(textString, 10, 30, 12);
 *   fill(255);
 *   stroke(0);
 *   rect(bbox.x, bbox.y, bbox.w, bbox.h);
 *   fill(0);
 *   noStroke();
 *
 *   textFont(font);
 *   textSize(12);
 *   text(textString, 10, 30);
 *
 *   describe(`Words “Lorem ipsum dol” go off canvas and
 *     contained by white bounding box`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Font.textBounds(
    str: String,
    x: Int? = undefined,
    y: Int? = undefined,
    fontSize: Int? = undefined,
    // TODO opentype.js
    options: Object? = undefined
): TextBoundsProps = asDynamic().textBounds(str, x, y, fontSize, options).unsafeCast<TextBoundsProps>()

external interface TextBoundsProps {
    val x: Int
    val y: Int
    val w: Int
    val h: Int
}


/**
 * Computes an array of points following the path for specified text
 *
 * @method textToPoints
 * @param  {String} [str] a line of text
 * @param  {Number} [x] x-position
 * @param  {Number} [y] y-position
 * @param  {Number} [fontSize] font size to use (optional)
 * @param  {Object} [options] an (optional) object that can contain:
 *
 * <br>sampleFactor - the ratio of path-length to number of samples
 * (default=.1); higher values yield more points and are therefore
 * more precise
 *
 * <br>simplifyThreshold - if set to a non-zero value, collinear points will
 * be removed from the polygon; the value represents the threshold angle to use
 * when determining whether two edges are collinear
 *
 * @return {Array} an array of points, each with x, y, alpha (the path angle)
 * @example
 * <div>
 * <code>
 * let font;
 * function preload() {
 *   font = loadFont('assets/inconsolata.otf');
 * }
 *
 * let points;
 * let bounds;
 * function setup() {
 *   createCanvas(100, 100);
 *   stroke(0);
 *   fill(255, 104, 204);
 *
 *   points = font.textToPoints('p5', 0, 0, 10, {
 *     sampleFactor: 5,
 *     simplifyThreshold: 0
 *   });
 *   bounds = font.textBounds(' p5 ', 0, 0, 10);
 * }
 *
 * function draw() {
 *   background(255);
 *   beginShape();
 *   translate(-bounds.x * width / bounds.w, -bounds.y * height / bounds.h);
 *   for (let i = 0; i < points.length; i++) {
 *     let p = points[i];
 *     vertex(
 *       p.x * width / bounds.w +
 *         sin(20 * p.y / bounds.h + millis() / 1000) * width / 30,
 *       p.y * height / bounds.h
 *     );
 *   }
 *   endShape(CLOSE);
 * }
 * </code>
 * </div>
 */
inline fun p5.Font.textToPoints(
    str: String,
    x: Int,
    y: Int,
    fontSize: Int? = undefined,
    options: TextToPointsOptions? = undefined
): Array<PointProps> = asDynamic().textToPoints(str, x, y, fontSize, options).unsafeCast<Array<PointProps>>()

external interface TextToPointsOptions {
    val sampleFactor: Double
    val simplifyThreshold: Double
}

external interface PointProps {
    val x: Int
    val y: Int
    val alpha: Double
}
