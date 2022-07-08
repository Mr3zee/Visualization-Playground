/**
 * @file The 2d_primitives.js module provides helper functions for drawing common shapes.
 * The resulting drawing commands are sent to the currently active renderer.
 */

@file:Suppress("unused")

package p5.core.shape

import p5.core.p5

/**
 * Draw an arc to the screen. If called with only x, y, w, h, start and stop,
 * the arc will be drawn and filled as an open pie segment. If a mode parameter
 * is provided, the arc will be filled like an open semicircle (OPEN), a closed
 * semicircle (CHORD), or as a closed pie segment (PIE). The origin may be changed
 * with the <a href="#/p5/ellipseMode">ellipseMode()</a> function.
 *
 * The arc is always drawn clockwise from wherever start falls to wherever stop
 * falls on the ellipse. Adding or subtracting TWO_PI to either angle does not
 * change where they fall. If both start and stop fall at the same place, a full
 * ellipse will be drawn. Be aware that the y-axis increases in the downward
 * direction, therefore angles are measured clockwise from the positive
 * x-direction ("3 o'clock").
 *
 * @method arc
 * @param  {Number} [x]       x-coordinate of the arc's ellipse
 * @param  {Number} [y]       y-coordinate of the arc's ellipse
 * @param  {Number} [w]       width of the arc's ellipse by default
 * @param  {Number} [h]       height of the arc's ellipse by default
 * @param  {Number} [start]   angle to start the arc, specified in radians
 * @param  {Number} [stop]    angle to stop the arc, specified in radians
 * @param  {Constant} [mode]  optional parameter to determine the way of drawing
 *                            the arc. either CHORD, PIE or OPEN
 * @param  {Integer} [detail] optional parameter for WebGL mode only. This is to
 *                            specify the number of vertices that makes up the
 *                            perimeter of the arc. Default value is 25. Won't
 *                            draw a stroke for a detail of more than 50.
 * @chainable
 *
 * @example
 * <div>
 * <code>
 * arc(50, 55, 50, 50, 0, HALF_PI);
 * noFill();
 * arc(50, 55, 60, 60, HALF_PI, PI);
 * arc(50, 55, 70, 70, PI, PI + QUARTER_PI);
 * arc(50, 55, 80, 80, PI + QUARTER_PI, TWO_PI);
 * describe(
 *   'shattered outline of ellipse with a quarter of a white circle bottom-right'
 * );
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * arc(50, 50, 80, 80, 0, PI + QUARTER_PI);
 * describe('white ellipse with top right quarter missing');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * arc(50, 50, 80, 80, 0, PI + QUARTER_PI, OPEN);
 * describe('white ellipse with black outline with top right missing');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * arc(50, 50, 80, 80, 0, PI + QUARTER_PI, CHORD);
 * describe('white open arc with black outline with top right missing');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * arc(50, 50, 80, 80, 0, PI + QUARTER_PI, PIE);
 * describe(
 *   'white ellipse with top right quarter missing with black outline around the shape'
 * );
 * </code>
 * </div>
 *
 */
inline fun p5.arc(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    start: Double,
    stop: Double,
    mode: String? = null,
    detail: Int? = null
): p5 = asDynamic().arc(x, y, w, h, start, stop, mode ?: undefined, detail ?: undefined) as p5


/**
 * Draws an ellipse (oval) to the screen. By default, the first two parameters
 * set the location of the center of the ellipse, and the third and fourth
 * parameters set the shape's width and height. If no height is specified, the
 * value of width is used for both the width and height. If a negative height or
 * width is specified, the absolute value is taken.
 *
 * An ellipse with equal width and height is a circle. The origin may be changed
 * with the <a href="#/p5/ellipseMode">ellipseMode()</a> function.
 *
 * @method ellipse
 * @param  {Number} [x] x-coordinate of the center of the ellipse.
 * @param  {Number} [y] y-coordinate of the center of the ellipse.
 * @param  {Number} [w] width of the ellipse.
 * @param  {Number} [h] height of the ellipse.
 * @param  {Integer} [detail] optional parameter for WEBGL mode only. This is to
 *                            specify the number of vertices that makes up the
 *                            perimeter of the ellipse. Default value is 25. Won't
 *                            draw a stroke for a detail of more than 50.
 * @chainable
 * @example
 * <div>
 * <code>
 * ellipse(56, 46, 55, 55);
 * describe('white ellipse with black outline in middle of a gray canvas');
 * </code>
 * </div>
 *
 */
inline fun p5.ellipse(x: Double, y: Double, w: Double, h: Double, detail: Int? = null): p5 =
    asDynamic().ellipse(x, y, w, h, detail ?: undefined) as p5


/**
 * Draws a circle to the screen. A circle is a simple, closed shape. It is the set
 * of all points in a plane that are at a given distance from a given point,
 * the center. This function is a special case of the
 * <a href="#/p5/ellipse">ellipse()</a> function, where the width and height
 * of the ellipse are the same. Height and width of the ellipse correspond to
 * the diameter of the circle. By default, the first two parameters set the
 * location of the center of the circle, the third sets the diameter of the
 * circle.
 *
 * @method circle
 * @param  {Number} x  x-coordinate of the center of the circle.
 * @param  {Number} y  y-coordinate of the center of the circle.
 * @param  {Number} d  diameter of the circle.
 * @chainable
 * @example
 * <div>
 * <code>
 * // Draw a circle at location (30, 30) with a diameter of 20.
 * circle(30, 30, 20);
 * describe('white circle with black outline in mid of gray canvas');
 * </code>
 * </div>
 *
 */
inline fun p5.circle(x: Double, y: Double, d: Double): p5 = asDynamic().circle(x, y, d) as p5


/**
 * Draws a line (a direct path between two points) to the screen. If called with
 * only 4 parameters, it will draw a line in 2D with a default width of 1 pixel.
 * This width can be modified by using the <a href="#/p5/strokeWeight">
 * strokeWeight()</a> function. A line cannot be filled, therefore the <a
 * href="#/p5/fill">fill()</a> function will not affect the color of a line. So to
 * color a line, use the <a href="#/p5/stroke">stroke()</a> function.
 *
 * @method line
 * @param  {Number} x1
 * @param  {Number} y1
 * @param  {Number} z1 the z-coordinate of the first point
 * @param  {Number} x2
 * @param  {Number} y2
 * @param  {Number} z2 the z-coordinate of the second point
 * @chainable
 * @example
 * <div>
 * <code>
 * line(30, 20, 85, 75);
 * describe(
 *   'a 78 pixels long line running from mid-top to bottom-right of canvas'
 * );
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * line(30, 20, 85, 20);
 * stroke(126);
 * line(85, 20, 85, 75);
 * stroke(255);
 * line(85, 75, 30, 75);
 * describe(
 *   '3 lines of various stroke sizes. Form top, bottom and right sides of a square'
 * );
 * </code>
 * </div>
 *
 */
inline fun p5.line(x1: Double, y1: Double, z1: Double, x2: Double, y2: Double, z2: Double): p5 =
    asDynamic().line(x1, y1, z1, x2, y2, z2) as p5

inline fun p5.line(x1: Double, y1: Double, x2: Double, y2: Double): p5 =
    asDynamic().line(x1, y1, x2, y2) as p5


/**
 * Draws a point, a coordinate in space at the dimension of one pixel.
 * The first parameter is the horizontal value for the point, the second
 * param is the vertical value for the point. The color of the point is
 * changed with the <a href="#/p5/stroke">stroke()</a> function. The size of the point
 * can be changed with the <a href="#/p5/strokeWeight">strokeWeight()</a> function.
 *
 * @method point
 * @param  {Number} [x] the x-coordinate
 * @param  {Number} [y] the y-coordinate
 * @param  {Number} [z] the z-coordinate (for WebGL mode)
 * @chainable
 * @example
 * <div>
 * <code>
 * point(30, 20);
 * point(85, 20);
 * point(85, 75);
 * point(30, 75);
 * describe('4 points create the corners of a square');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * point(30, 20);
 * point(85, 20);
 * stroke('purple'); // Change the color
 * strokeWeight(10); // Make the points 10 pixels in size
 * point(85, 75);
 * point(30, 75);
 * describe('2 points and 2 large purple points in middle-right of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let a = createVector(10, 10);
 * point(a);
 * let b = createVector(10, 20);
 * point(b);
 * point(createVector(20, 10));
 * point(createVector(20, 20));
 * describe(
 *   'four points create vertices of 10x10 pixel square on top-left of canvas'
 * );
 * </code>
 * </div>
 *
 */
inline fun p5.point(x: Double, y: Double, z: Double): p5 = asDynamic().point(x, y, z) as p5

inline fun p5.point(x: Double, y: Double): p5 = asDynamic().point(x, y) as p5

inline fun p5.point(v: p5.Vector): p5 = asDynamic().point(v) as p5


/**
 * Draws a quad on the canvas. A quad is a quadrilateral, a four-sided polygon. It is
 * similar to a rectangle, but the angles between its edges are not
 * constrained to ninety degrees. The first pair of parameters (x1,y1)
 * sets the first vertex and the subsequent pairs should proceed
 * clockwise or counter-clockwise around the defined shape.
 * z-arguments only work when quad() is used in WEBGL mode.
 *
 * @method quad
 * @param {Number} [x1] the x-coordinate of the first point
 * @param {Number} [y1] the y-coordinate of the first point
 * @param {Number} [z1] the y-coordinate of the first point
 * @param {Number} [x2] the x-coordinate of the second point
 * @param {Number} [y2] the y-coordinate of the second point
 * @param {Number} [z2] the y-coordinate of the second point
 * @param {Number} [x3] the x-coordinate of the third point
 * @param {Number} [y3] the y-coordinate of the third point
 * @param {Number} [z3] the y-coordinate of the third point
 * @param {Number} [x4] the x-coordinate of the fourth point
 * @param {Number} [y4] the y-coordinate of the fourth point
 * @param {Number} [z4] the y-coordinate of the fourth point
 * @param {Integer} [detailX] number of segments in the x-direction
 * @param {Integer} [detailY] number of segments in the y-direction
 * @chainable
 * @example
 * <div>
 * <code>
 * quad(38, 31, 86, 20, 69, 63, 30, 76);
 * describe('irregular white quadrilateral with black outline');
 * </code>
 * </div>
 */
inline fun p5.quad(
    x1: Double,
    y1: Double,
    z1: Double,
    x2: Double,
    y2: Double,
    z2: Double,
    x3: Double,
    y3: Double,
    z3: Double,
    x4: Double,
    y4: Double,
    z4: Double,
    detailX: Int? = null,
    detailY: Int? = null,
): p5 = asDynamic().quad(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4, detailX ?: undefined, detailY ?: undefined) as p5

inline fun p5.quad(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    detailX: Int? = null,
    detailY: Int? = null,
): p5 = asDynamic().quad(x1, y1, x2, y2, x3, y3, x4, y4, detailX ?: undefined, detailY ?: undefined) as p5


/**
 * Draws a rectangle on the canvas. A rectangle is a four-sided closed shape with
 * every angle at ninety degrees. By default, the first two parameters set
 * the location of the upper-left corner, the third sets the width, and the
 * fourth sets the height. The way these parameters are interpreted may be
 * changed with the <a href="#/p5/rectMode">rectMode()</a> function.
 *
 * The fifth, sixth, seventh and eighth parameters, if specified,
 * determine corner radius for the top-left, top-right, lower-right and
 * lower-left corners, respectively. An omitted corner radius parameter is set
 * to the value of the previously specified radius value in the parameter list.
 *
 * @method rect
 * @param  {Number} x  x-coordinate of the rectangle.
 * @param  {Number} y  y-coordinate of the rectangle.
 * @param  {Number} w  width of the rectangle.
 * @param  {Number} [h]  height of the rectangle.
 * @param  {Number} [tl] optional radius of top-left corner.
 * @param  {Number} [tr] optional radius of top-right corner.
 * @param  {Number} [br] optional radius of bottom-right corner.
 * @param  {Number} [bl] optional radius of bottom-left corner.
 * @chainable
 * @example
 * <div>
 * <code>
 * // Draw a rectangle at location (30, 20) with a width and height of 55.
 * rect(30, 20, 55, 55);
 * describe('white rect with black outline in mid-right of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Draw a rectangle with rounded corners, each having a radius of 20.
 * rect(30, 20, 55, 55, 20);
 * describe(
 *   'white rect with black outline and round edges in mid-right of canvas'
 * );
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Draw a rectangle with rounded corners having the following radii:
 * // top-left = 20, top-right = 15, bottom-right = 10, bottom-left = 5.
 * rect(30, 20, 55, 55, 20, 15, 10, 5);
 * describe('white rect with black outline and round edges of different radii');
 * </code>
 * </div>
 *
 */

inline fun p5.rect(
    x: Double,
    y: Double,
    w: Double,
    h: Double,
    tl: Double? = null,
    tr: Double? = null,
    br: Double? = null,
    bl: Double? = null,
): p5 =
    asDynamic().rect(x, y, w, h, tl ?: undefined, tr ?: undefined, br ?: undefined, bl ?: undefined) as p5

inline fun p5.rect(x: Double, y: Double, w: Double, h: Double, detailX: Int? = null, detailY: Int? = null): p5 =
    asDynamic().rect(x, y, w, h, detailX ?: undefined, detailY ?: undefined) as p5

inline fun p5.rect(x: Double, y: Double, w: Double, h: Double? = null): p5 =
    asDynamic().rect(x, y, w, h ?: undefined) as p5


/**
 * Draws a square to the screen. A square is a four-sided shape with every angle
 * at ninety degrees, and equal side size. This function is a special case of the
 * rect() function, where the width and height are the same, and the parameter
 * is called "s" for side size. By default, the first two parameters set the
 * location of the upper-left corner, the third sets the side size of the square.
 * The way these parameters are interpreted, may be changed with the <a
 * href="#/p5/rectMode">rectMode()</a> function.
 *
 * The fourth, fifth, sixth and seventh parameters, if specified,
 * determine corner radius for the top-left, top-right, lower-right and
 * lower-left corners, respectively. An omitted corner radius parameter is set
 * to the value of the previously specified radius value in the parameter list.
 *
 * @method square
 * @param  {Number} x  x-coordinate of the square.
 * @param  {Number} y  y-coordinate of the square.
 * @param  {Number} s  side size of the square.
 * @param  {Number} [tl] optional radius of top-left corner.
 * @param  {Number} [tr] optional radius of top-right corner.
 * @param  {Number} [br] optional radius of bottom-right corner.
 * @param  {Number} [bl] optional radius of bottom-left corner.
 * @chainable
 * @example
 * <div>
 * <code>
 * // Draw a square at location (30, 20) with a side size of 55.
 * square(30, 20, 55);
 * describe('white square with black outline in mid-right of canvas');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Draw a square with rounded corners, each having a radius of 20.
 * square(30, 20, 55, 20);
 * describe(
 *   'white square with black outline and round edges in mid-right of canvas'
 * );
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Draw a square with rounded corners having the following radii:
 * // top-left = 20, top-right = 15, bottom-right = 10, bottom-left = 5.
 * square(30, 20, 55, 20, 15, 10, 5);
 * describe('white square with black outline and round edges of different radii');
 * </code>
 * </div>
 */
inline fun p5.square(
    x: Double,
    y: Double,
    s: Double,
    tl: Double? = null,
    tr: Double? = null,
    br: Double? = null,
    bl: Double? = null
): p5 = asDynamic().square(x, y, s, tl ?: undefined, tr ?: undefined, br ?: undefined, bl ?: undefined) as p5


/**
 * Draws a triangle to the canvas. A triangle is a plane created by connecting
 * three points. The first two arguments specify the first point, the middle two
 * arguments specify the second point, and the last two arguments specify the
 * third point.
 *
 * @method triangle
 * @param  {Number} [x1] x-coordinate of the first point
 * @param  {Number} [y1] y-coordinate of the first point
 * @param  {Number} [x2] x-coordinate of the second point
 * @param  {Number} [y2] y-coordinate of the second point
 * @param  {Number} [x3] x-coordinate of the third point
 * @param  {Number} [y3] y-coordinate of the third point
 * @chainable
 * @example
 * <div>
 * <code>
 * triangle(30, 75, 58, 20, 86, 75);
 * describe('white triangle with black outline in mid-right of canvas');
 * </code>
 * </div>
 *
 */
inline fun p5.triangle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): p5 =
    asDynamic().trianlge(x1, y1, x2, y2, x3, y3) as p5

