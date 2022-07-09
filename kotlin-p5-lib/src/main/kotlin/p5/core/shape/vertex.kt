/**
 * @file The vertex.js module handles points and coordinates for drawing curves and shapes.
 */

@file:Suppress("unused")

package p5.core.shape

import p5.core.p5


/**
 * Use the <a href="#/p5/beginContour">beginContour()</a> and
 * <a href="#/p5/endContour">endContour()</a> functions to create negative shapes
 * within shapes such as the center of the letter 'O'. <a href="#/p5/beginContour">beginContour()</a>
 * begins recording vertices for the shape and <a href="#/p5/endContour">endContour()</a> stops recording.
 * The vertices that define a negative shape must "wind" in the opposite direction
 * from the exterior shape. First draw vertices for the exterior clockwise order, then for internal shapes, draw vertices
 * shape in counter-clockwise.
 *
 * These functions can only be used within a <a href="#/p5/beginShape">beginShape()</a>/<a href="#/p5/endShape">endShape()</a> pair and
 * transformations such as <a href="#/p5/translate">translate()</a>, <a href="#/p5/rotate">rotate()</a>, and <a href="#/p5/scale">scale()</a> do not work
 * within a <a href="#/p5/beginContour">beginContour()</a>/<a href="#/p5/endContour">endContour()</a> pair. It is also not possible to use
 * other shapes, such as <a href="#/p5/ellipse">ellipse()</a> or <a href="#/p5/rect">rect()</a> within.
 *
 * @method beginContour
 * @chainable
 * @example
 * <div>
 * <code>
 * translate(50, 50);
 * stroke(255, 0, 0);
 * beginShape();
 * // Exterior part of shape, clockwise winding
 * vertex(-40, -40);
 * vertex(40, -40);
 * vertex(40, 40);
 * vertex(-40, 40);
 * // Interior part of shape, counter-clockwise winding
 * beginContour();
 * vertex(-20, -20);
 * vertex(-20, 20);
 * vertex(20, 20);
 * vertex(20, -20);
 * endContour();
 * endShape(CLOSE);
 * </code>
 * </div>
 *
 * @alt
 * white rect and smaller grey rect with red outlines in center of canvas.
 */
inline fun p5.beginContour(): p5 = asDynamic().beginContour() as p5


/**
 * Using the <a href="#/p5/beginShape">beginShape()</a> and <a href="#/p5/endShape">endShape()</a> functions allow creating more
 * complex forms. <a href="#/p5/beginShape">beginShape()</a> begins recording vertices for a shape and
 * <a href="#/p5/endShape">endShape()</a> stops recording. The value of the kind parameter tells it which
 * types of shapes to create from the provided vertices. With no mode
 * specified, the shape can be any irregular polygon.
 *
 * The parameters available for <a href="#/p5/beginShape">beginShape()</a> are:
 *
 * POINTS
 * Draw a series of points
 *
 * LINES
 * Draw a series of unconnected line segments (individual lines)
 *
 * TRIANGLES
 * Draw a series of separate triangles
 *
 * TRIANGLE_FAN
 * Draw a series of connected triangles sharing the first vertex in a fan-like fashion
 *
 * TRIANGLE_STRIP
 * Draw a series of connected triangles in strip fashion
 *
 * QUADS
 * Draw a series of separate quads
 *
 * QUAD_STRIP
 * Draw quad strip using adjacent edges to form the next quad
 *
 * TESS (WEBGL only)
 * Handle irregular polygon for filling curve by explicit tessellation
 *
 * After calling the <a href="#/p5/beginShape">beginShape()</a> function, a series of <a href="#/p5/vertex">vertex()</a> commands must follow. To stop
 * drawing the shape, call <a href="#/p5/endShape">endShape()</a>. Each shape will be outlined with the
 * current stroke color and filled with the fill color.
 *
 * Transformations such as <a href="#/p5/translate">translate()</a>, <a href="#/p5/rotate">rotate()</a>, and <a href="#/p5/scale">scale()</a> do not work
 * within <a href="#/p5/beginShape">beginShape()</a>. It is also not possible to use other shapes, such as
 * <a href="#/p5/ellipse">ellipse()</a> or <a href="#/p5/rect">rect()</a> within <a href="#/p5/beginShape">beginShape()</a>.
 *
 * @method beginShape
 * @param  {Constant} [kind] either POINTS, LINES, TRIANGLES, TRIANGLE_FAN
 *                                TRIANGLE_STRIP, QUADS, QUAD_STRIP or TESS
 * @chainable
 * @example
 * <div>
 * <code>
 * beginShape();
 * vertex(30, 20);
 * vertex(85, 20);
 * vertex(85, 75);
 * vertex(30, 75);
 * endShape(CLOSE);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape(POINTS);
 * vertex(30, 20);
 * vertex(85, 20);
 * vertex(85, 75);
 * vertex(30, 75);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape(LINES);
 * vertex(30, 20);
 * vertex(85, 20);
 * vertex(85, 75);
 * vertex(30, 75);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * noFill();
 * beginShape();
 * vertex(30, 20);
 * vertex(85, 20);
 * vertex(85, 75);
 * vertex(30, 75);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * noFill();
 * beginShape();
 * vertex(30, 20);
 * vertex(85, 20);
 * vertex(85, 75);
 * vertex(30, 75);
 * endShape(CLOSE);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape(TRIANGLES);
 * vertex(30, 75);
 * vertex(40, 20);
 * vertex(50, 75);
 * vertex(60, 20);
 * vertex(70, 75);
 * vertex(80, 20);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape(TRIANGLE_STRIP);
 * vertex(30, 75);
 * vertex(40, 20);
 * vertex(50, 75);
 * vertex(60, 20);
 * vertex(70, 75);
 * vertex(80, 20);
 * vertex(90, 75);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape(TRIANGLE_FAN);
 * vertex(57.5, 50);
 * vertex(57.5, 15);
 * vertex(92, 50);
 * vertex(57.5, 85);
 * vertex(22, 50);
 * vertex(57.5, 15);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape(QUADS);
 * vertex(30, 20);
 * vertex(30, 75);
 * vertex(50, 75);
 * vertex(50, 20);
 * vertex(65, 20);
 * vertex(65, 75);
 * vertex(85, 75);
 * vertex(85, 20);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape(QUAD_STRIP);
 * vertex(30, 20);
 * vertex(30, 75);
 * vertex(50, 20);
 * vertex(50, 75);
 * vertex(65, 20);
 * vertex(65, 75);
 * vertex(85, 20);
 * vertex(85, 75);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape(TESS);
 * vertex(20, 20);
 * vertex(80, 20);
 * vertex(80, 40);
 * vertex(40, 40);
 * vertex(40, 60);
 * vertex(80, 60);
 * vertex(80, 80);
 * vertex(20, 80);
 * endShape(CLOSE);
 * </code>
 * </div>
 *
 * @alt
 * white square-shape with black outline in middle-right of canvas.
 * 4 black points in a square shape in middle-right of canvas.
 * 2 horizontal black lines. In the top-right and bottom-right of canvas.
 * 3 line shape with horizontal on top, vertical in middle and horizontal bottom.
 * square line shape in middle-right of canvas.
 * 2 white triangle shapes mid-right canvas. left one pointing up and right down.
 * 5 horizontal interlocking and alternating white triangles in mid-right canvas.
 * 4 interlocking white triangles in 45 degree rotated square-shape.
 * 2 white rectangle shapes in mid-right canvas. Both 20×55.
 * 3 side-by-side white rectangles center rect is smaller in mid-right canvas.
 * Thick white l-shape with black outline mid-top-left of canvas.
 */
inline fun p5.beginShape(kind: String): p5 = asDynamic().beginShape(kind) as p5


/**
 * Specifies vertex coordinates for Bézier curves. Each call to
 * bezierVertex() defines the position of two control points and
 * one anchor point of a Bézier curve, adding a new segment to a
 * line or shape. For WebGL mode bezierVertex() can be used in 2D
 * as well as 3D mode. 2D mode expects 6 parameters, while 3D mode
 * expects 9 parameters (including z coordinates).
 *
 * The first time bezierVertex() is used within a <a href="#/p5/beginShape">beginShape()</a>
 * call, it must be prefaced with a call to <a href="#/p5/vertex">vertex()</a> to set the first anchor
 * point. This function must be used between <a href="#/p5/beginShape">beginShape()</a> and <a href="#/p5/endShape">endShape()</a>
 * and only when there is no MODE or POINTS parameter specified to
 * <a href="#/p5/beginShape">beginShape()</a>.
 *
 * @method bezierVertex
 * @param  {Number} [x2] x-coordinate for the first control point
 * @param  {Number} [y2] y-coordinate for the first control point
 * @param  {Number} [z2] z-coordinate for the first control point (for WebGL mode)
 * @param  {Number} [x3] x-coordinate for the second control point
 * @param  {Number} [y3] y-coordinate for the second control point
 * @param  {Number} [z3] z-coordinate for the second control point (for WebGL mode)
 * @param  {Number} [x4] x-coordinate for the anchor point
 * @param  {Number} [y4] y-coordinate for the anchor point
 * @param  {Number} [z4] z-coordinate for the anchor point (for WebGL mode)
 * @chainable
 *
 * @example
 * <div>
 * <code>
 * noFill();
 * beginShape();
 * vertex(30, 20);
 * bezierVertex(80, 0, 80, 75, 30, 75);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * beginShape();
 * vertex(30, 20);
 * bezierVertex(80, 0, 80, 75, 30, 75);
 * bezierVertex(50, 80, 60, 25, 30, 20);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   setAttributes('antialias', true);
 * }
 * function draw() {
 *   orbitControl();
 *   background(50);
 *   strokeWeight(4);
 *   stroke(255);
 *   point(-25, 30);
 *   point(25, 30);
 *   point(25, -30);
 *   point(-25, -30);
 *
 *   strokeWeight(1);
 *   noFill();
 *
 *   beginShape();
 *   vertex(-25, 30);
 *   bezierVertex(25, 30, 25, -30, -25, -30);
 *   endShape();
 *
 *   beginShape();
 *   vertex(-25, 30, 20);
 *   bezierVertex(25, 30, 20, 25, -30, 20, -25, -30, 20);
 *   endShape();
 * }
 * </code>
 * </div>
 *
 * @alt
 * crescent-shaped line in middle of canvas. Points facing left.
 * white crescent shape in middle of canvas. Points facing left.
 * crescent shape in middle of canvas with another crescent shape on positive z-axis.
 */
inline fun p5.bezierVertex(
    x2: Double,
    y2: Double,
    z2: Double,
    x3: Double,
    y3: Double,
    z3: Double,
    x4: Double,
    y4: Double,
    z4: Double
): p5 = asDynamic().bezierVertex(x2, y2, z2, x3, y3, z3, x4, y4, z4) as p5

inline fun p5.bezierVertex(
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
): p5 = asDynamic().bezierVertex(x2, y2, x3, y3, x4, y4) as p5


/**
 * Specifies vertex coordinates for curves. This function may only
 * be used between <a href="#/p5/beginShape">beginShape()</a> and <a href="#/p5/endShape">endShape()</a> and only when there
 * is no MODE parameter specified to <a href="#/p5/beginShape">beginShape()</a>.
 * For WebGL mode curveVertex() can be used in 2D as well as 3D mode.
 * 2D mode expects 2 parameters, while 3D mode expects 3 parameters.
 *
 * The first and last points in a series of curveVertex() lines will be used to
 * guide the beginning and end of the curve. A minimum of four
 * points is required to draw a tiny curve between the second and
 * third points. Adding a fifth point with curveVertex() will draw
 * the curve between the second, third, and fourth points. The
 * curveVertex() function is an implementation of Catmull-Rom
 * splines.
 *
 * @method curveVertex
 * @param {Number} [x]
 * @param {Number} [y]
 * @param {Number} [z] z-coordinate of the vertex (for WebGL mode)
 * @chainable
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   setAttributes('antialias', true);
 * }
 * function draw() {
 *   orbitControl();
 *   background(50);
 *   strokeWeight(4);
 *   stroke(255);
 *
 *   point(-25, 25);
 *   point(-25, 25);
 *   point(-25, -25);
 *   point(25, -25);
 *   point(25, 25);
 *   point(25, 25);
 *
 *   strokeWeight(1);
 *   noFill();
 *
 *   beginShape();
 *   curveVertex(-25, 25);
 *   curveVertex(-25, 25);
 *   curveVertex(-25, -25);
 *   curveVertex(25, -25);
 *   curveVertex(25, 25);
 *   curveVertex(25, 25);
 *   endShape();
 *
 *   beginShape();
 *   curveVertex(-25, 25, 20);
 *   curveVertex(-25, 25, 20);
 *   curveVertex(-25, -25, 20);
 *   curveVertex(25, -25, 20);
 *   curveVertex(25, 25, 20);
 *   curveVertex(25, 25, 20);
 *   endShape();
 * }
 * </code>
 * </div>
 *
 * @alt
 * Upside-down u-shape line, mid-canvas with the same shape in positive z-axis.
 */
inline fun p5.curveVertex(x: Double, y: Double, z: Double): p5 = asDynamic().curveVertex(x, y, z) as p5

inline fun p5.curveVertex(x: Double, y: Double): p5 = asDynamic().curveVertex(x, y) as p5


/**
 * Use the <a href="#/p5/beginContour">beginContour()</a> and <a href="#/p5/endContour">endContour()</a> functions to create negative
 * shapes within shapes such as the center of the letter 'O'. <a href="#/p5/beginContour">beginContour()</a>
 * begins recording vertices for the shape and <a href="#/p5/endContour">endContour()</a> stops recording.
 * The vertices that define a negative shape must "wind" in the opposite
 * direction from the exterior shape. First draw vertices for the exterior
 * clockwise order, then for internal shapes, draw vertices
 * shape in counter-clockwise.
 *
 * These functions can only be used within a <a href="#/p5/beginShape">beginShape()</a>/<a href="#/p5/endShape">endShape()</a> pair and
 * transformations such as <a href="#/p5/translate">translate()</a>, <a href="#/p5/rotate">rotate()</a>, and <a href="#/p5/scale">scale()</a> do not work
 * within a <a href="#/p5/beginContour">beginContour()</a>/<a href="#/p5/endContour">endContour()</a> pair. It is also not possible to use
 * other shapes, such as <a href="#/p5/ellipse">ellipse()</a> or <a href="#/p5/rect">rect()</a> within.
 *
 * @method endContour
 * @chainable
 * @example
 * <div>
 * <code>
 * translate(50, 50);
 * stroke(255, 0, 0);
 * beginShape();
 * // Exterior part of shape, clockwise winding
 * vertex(-40, -40);
 * vertex(40, -40);
 * vertex(40, 40);
 * vertex(-40, 40);
 * // Interior part of shape, counter-clockwise winding
 * beginContour();
 * vertex(-20, -20);
 * vertex(-20, 20);
 * vertex(20, 20);
 * vertex(20, -20);
 * endContour();
 * endShape(CLOSE);
 * </code>
 * </div>
 *
 * @alt
 * white rect and smaller grey rect with red outlines in center of canvas.
 */
inline fun p5.endContour(): p5 = asDynamic().endContour() as p5


/**
 * The <a href="#/p5/endShape">endShape()</a> function is the companion to <a href="#/p5/beginShape">beginShape()</a> and may only be
 * called after <a href="#/p5/beginShape">beginShape()</a>. When <a href="#/p5/endshape">endShape()</a> is called, all of the image
 * data defined since the previous call to <a href="#/p5/beginShape">beginShape()</a> is written into the image
 * buffer. The constant CLOSE as the value for the `mode` parameter to close
 * the shape (to connect the beginning and the end).
 *
 * @method endShape
 * @param  {Constant} [mode] use CLOSE to close the shape
 * @chainable
 * @example
 * <div>
 * <code>
 * noFill();
 *
 * beginShape();
 * vertex(20, 20);
 * vertex(45, 20);
 * vertex(45, 80);
 * endShape(CLOSE);
 *
 * beginShape();
 * vertex(50, 20);
 * vertex(75, 20);
 * vertex(75, 80);
 * endShape();
 * </code>
 * </div>
 *
 * @alt
 * Triangle line shape with the smallest interior angle on bottom and upside-down L.
 */
inline fun p5.endShape(mode: String): p5 = asDynamic().endShape(mode) as p5


/**
 * Specifies vertex coordinates for quadratic Bézier curves. Each call to
 * quadraticVertex() defines the position of one control points and one
 * anchor point of a Bézier curve, adding a new segment to a line or shape.
 * The first time quadraticVertex() is used within a <a href="#/p5/beginShape">beginShape()</a> call, it
 * must be prefaced with a call to <a href="#/p5/vertex">vertex()</a> to set the first anchor point.
 * For WebGL mode quadraticVertex() can be used in 2D as well as 3D mode.
 * 2D mode expects 4 parameters, while 3D mode expects 6 parameters
 * (including z coordinates).
 *
 * This function must be used between <a href="#/p5/beginShape">beginShape()</a> and <a href="#/p5/endShape">endShape()</a>
 * and only when there is no MODE or POINTS parameter specified to
 * <a href="#/p5/beginShape">beginShape()</a>.
 *
 * @method quadraticVertex
 * @param  {Number} cx x-coordinate for the control point
 * @param  {Number} cy y-coordinate for the control point
 * @param  {Number} cz z-coordinate for the control point (for WebGL mode)
 * @param  {Number} x3 x-coordinate for the anchor point
 * @param  {Number} y3 y-coordinate for the anchor point
 * @param  {Number} cz z-coordinate for the anchor point (for WebGL mode)
 * @chainable
 *
 * @example
 * <div>
 * <code>
 * strokeWeight(5);
 * point(20, 20);
 * point(80, 20);
 * point(50, 50);
 *
 * noFill();
 * strokeWeight(1);
 * beginShape();
 * vertex(20, 20);
 * quadraticVertex(80, 20, 50, 50);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * strokeWeight(5);
 * point(20, 20);
 * point(80, 20);
 * point(50, 50);
 *
 * point(20, 80);
 * point(80, 80);
 * point(80, 60);
 *
 * noFill();
 * strokeWeight(1);
 * beginShape();
 * vertex(20, 20);
 * quadraticVertex(80, 20, 50, 50);
 * quadraticVertex(20, 80, 80, 80);
 * vertex(80, 60);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   setAttributes('antialias', true);
 * }
 * function draw() {
 *   orbitControl();
 *   background(50);
 *   strokeWeight(4);
 *   stroke(255);
 *
 *   point(-35, -35);
 *   point(35, -35);
 *   point(0, 0);
 *   point(-35, 35);
 *   point(35, 35);
 *   point(35, 10);
 *
 *   strokeWeight(1);
 *   noFill();
 *
 *   beginShape();
 *   vertex(-35, -35);
 *   quadraticVertex(35, -35, 0, 0);
 *   quadraticVertex(-35, 35, 35, 35);
 *   vertex(35, 10);
 *   endShape();
 *
 *   beginShape();
 *   vertex(-35, -35, 20);
 *   quadraticVertex(35, -35, 20, 0, 0, 20);
 *   quadraticVertex(-35, 35, 20, 35, 35, 20);
 *   vertex(35, 10, 20);
 *   endShape();
 * }
 * </code>
 * </div>
 *
 * @alt
 * arched-shaped black line with 4 pixel thick stroke weight.
 * backwards s-shaped black line with 4 pixel thick stroke weight.
 * backwards s-shaped black line with the same s-shaped line in positive z-axis.
 */
inline fun p5.quadraticVertex(cx: Double, cy: Double, cz: Double, x3: Double, y3: Double, z3: Double): p5 =
    asDynamic().quadraticVertex(cx, cy, cz, x3, y3, z3) as p5

inline fun p5.quadraticVertex(cx: Double, cy: Double, x3: Double, y3: Double): p5 =
    asDynamic().quadraticVertex(cx, cy, x3, y3) as p5


/**
 * All shapes are constructed by connecting a series of vertices. <a href="#/p5/vertex">vertex()</a>
 * is used to specify the vertex coordinates for points, lines, triangles,
 * quads, and polygons. It is used exclusively within the <a href="#/p5/beginShape">beginShape()</a> and
 * <a href="#/p5/endShape">endShape()</a> functions.
 *
 * @method vertex
 * @param  {Number} [x] x-coordinate of the vertex
 * @param  {Number} [y] y-coordinate of the vertex
 * @param  {Number} [z] z-coordinate of the vertex. Defaults to 0 if not specified.
 * @param  {Number} [u] the vertex's texture u-coordinate
 * @param  {Number} [v] the vertex's texture v-coordinate
 * @chainable
 * @example
 * <div>
 * <code>
 * strokeWeight(3);
 * beginShape(POINTS);
 * vertex(30, 20);
 * vertex(85, 20);
 * vertex(85, 75);
 * vertex(30, 75);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * createCanvas(100, 100, WEBGL);
 * background(240, 240, 240);
 * fill(237, 34, 93);
 * noStroke();
 * beginShape();
 * vertex(0, 35);
 * vertex(35, 0);
 * vertex(0, -35);
 * vertex(-35, 0);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * createCanvas(100, 100, WEBGL);
 * background(240, 240, 240);
 * fill(237, 34, 93);
 * noStroke();
 * beginShape();
 * vertex(-10, 10);
 * vertex(0, 35);
 * vertex(10, 10);
 * vertex(35, 0);
 * vertex(10, -8);
 * vertex(0, -35);
 * vertex(-10, -8);
 * vertex(-35, 0);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * strokeWeight(3);
 * stroke(237, 34, 93);
 * beginShape(LINES);
 * vertex(10, 35);
 * vertex(90, 35);
 * vertex(10, 65);
 * vertex(90, 65);
 * vertex(35, 10);
 * vertex(35, 90);
 * vertex(65, 10);
 * vertex(65, 90);
 * endShape();
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Click to change the number of sides.
 * // In WebGL mode, custom shapes will only
 * // display hollow fill sections when
 * // all calls to vertex() use the same z-value.
 *
 * let sides = 3;
 * let angle, px, py;
 *
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   setAttributes('antialias', true);
 *   fill(237, 34, 93);
 *   strokeWeight(3);
 * }
 *
 * function draw() {
 *   background(200);
 *   rotateX(frameCount * 0.01);
 *   rotateZ(frameCount * 0.01);
 *   ngon(sides, 0, 0, 80);
 * }
 *
 * function mouseClicked() {
 *   if (sides > 6) {
 *     sides = 3;
 *   } else {
 *     sides++;
 *   }
 * }
 *
 * function ngon(n, x, y, d) {
 *   beginShape(TESS);
 *   for (let i = 0; i < n + 1; i++) {
 *     angle = TWO_PI / n * i;
 *     px = x + sin(angle) * d / 2;
 *     py = y - cos(angle) * d / 2;
 *     vertex(px, py, 0);
 *   }
 *   for (let i = 0; i < n + 1; i++) {
 *     angle = TWO_PI / n * i;
 *     px = x + sin(angle) * d / 4;
 *     py = y - cos(angle) * d / 4;
 *     vertex(px, py, 0);
 *   }
 *   endShape();
 * }
 * </code>
 * </div>
 * @alt
 * 4 black points in a square shape in middle-right of canvas.
 * 4 points making a diamond shape.
 * 8 points making a star.
 * 8 points making 4 lines.
 * A rotating 3D shape with a hollow section in the middle.
 */
inline fun p5.vertex(x: Double, y: Double, z: Double, u: Double, v: Double): p5 = asDynamic().vertex(x, y, z, u, v) as p5

inline fun p5.vertex(x: Double, y: Double, u: Double, v: Double): p5 = asDynamic().vertex(x, y, u, v) as p5

inline fun p5.vertex(x: Double, y: Double, z: Double): p5 = asDynamic().vertex(x, y, z) as p5

inline fun p5.vertex(x: Double, y: Double): p5 = asDynamic().vertex(x, y) as p5


/**
 * Sets the 3d vertex normal to use for subsequent vertices drawn with
 * <a href="#/p5/vertex">vertex()</a>. A normal is a vector that is generally
 * nearly perpendicular to a shape's surface which controls how much light will
 * be reflected from that part of the surface.
 *
 * @method normal
 * @param  {Number} x The x component of the vertex normal.
 * @param  {Number} y The y component of the vertex normal.
 * @param  {Number} z The z component of the vertex normal.
 * @chainable
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   noStroke();
 * }
 *
 * function draw() {
 *   background(255);
 *   rotateY(frameCount / 100);
 *   normalMaterial();
 *   beginShape(TRIANGLE_STRIP);
 *   normal(-0.4, 0.4, 0.8);
 *   vertex(-30, 30, 0);
 *
 *   normal(0, 0, 1);
 *   vertex(-30, -30, 30);
 *   vertex(30, 30, 30);
 *
 *   normal(0.4, -0.4, 0.8);
 *   vertex(30, -30, 0);
 *   endShape();
 * }
 * </code>
 * </div>
 */
inline fun p5.normal(x: Double, y: Double, z: Double): p5 = asDynamic().normal(x, y, z) as p5

inline fun p5.normal(v: p5.Vector): p5 = asDynamic().normal(v) as p5
