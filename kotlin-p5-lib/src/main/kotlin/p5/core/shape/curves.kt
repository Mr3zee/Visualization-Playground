/**
 * @file The curves.js module draws curves based on a set of vertices.
 */

@file:Suppress("unused")

package p5.core.shape

import p5.core.p5


/**
 * Draws a cubic Bézier curve on the screen. These curves are defined by a
 * series of anchor and control points. The first two parameters specify
 * the first anchor point and the last two parameters specify the other
 * anchor point, which become the first and last points on the curve. The
 * middle parameters specify the two control points which define the shape
 * of the curve. Approximately speaking, control points "pull" the curve
 * towards them.
 *
 * Bézier curves were developed by French automotive engineer Pierre Bezier,
 * and are commonly used in computer graphics to define gently sloping curves.
 * See also <a href="#/p5/curve">curve()</a>.
 *
 * @method bezier
 * @param  {Number} [x1] x-coordinate for the first anchor point
 * @param  {Number} [y1] y-coordinate for the first anchor point
 * @param  {Number} [z1] z-coordinate for the first anchor point
 * @param  {Number} [x2] x-coordinate for the first control point
 * @param  {Number} [y2] y-coordinate for the first control point
 * @param  {Number} [z2] z-coordinate for the first control point
 * @param  {Number} [x3] x-coordinate for the second control point
 * @param  {Number} [y3] y-coordinate for the second control point
 * @param  {Number} [z3] z-coordinate for the second control point
 * @param  {Number} [x4] x-coordinate for the second anchor point
 * @param  {Number} [y4] y-coordinate for the second anchor point
 * @param  {Number} [z4] z-coordinate for the second anchor point
 * @chainable
 * @example
 * <div>
 * <code>
 * noFill();
 * stroke(255, 102, 0);
 * line(85, 20, 10, 10);
 * line(90, 90, 15, 80);
 * stroke(0, 0, 0);
 * bezier(85, 20, 10, 10, 90, 90, 15, 80);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * background(0, 0, 0);
 * noFill();
 * stroke(255);
 * bezier(250, 250, 0, 100, 100, 0, 100, 0, 0, 0, 100, 0);
 * </code>
 * </div>
 *
 * @alt
 * stretched black s-shape in center with orange lines extending from end points.
 * a white colored curve on black background from the upper-right corner to the lower right corner.
 */
inline fun p5.bezier(
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
    z4: Double
): p5 = asDynamic().bezier(x1, y1, z1, x2, y2, z2, x3 ,y3, z3, x4, y4, z4) as p5

inline fun p5.bezier(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
): p5 = asDynamic().bezier(x1, y1, x2, y2, x3 ,y3, x4, y4) as p5


/**
 * Sets the resolution at which Bezier's curve is displayed. The default value is 20.
 *
 * Note, This function is only useful when using the WEBGL renderer
 * as the default canvas renderer does not use this information.
 *
 * @method bezierDetail
 * @param {Number} detail resolution of the curves
 * @chainable
 * @example
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   noFill();
 *   bezierDetail(5);
 * }
 *
 * function draw() {
 *   background(200);
 *   // prettier-ignore
 *   bezier(-40, -40, 0,
 *           90, -40, 0,
 *          -90,  40, 0,
 *           40,  40, 0);
 * }
 * </code>
 * </div>
 *
 * @alt
 * stretched black s-shape with a low level of bezier detail
 */
inline fun p5.bezierDetail(d: Int): p5 = asDynamic().bezierDetail(d) as p5


/**
 * Given the x or y co-ordinate values of control and anchor points of a Bézier
 * curve, it evaluates the x or y coordinate of the bezier at position t. The
 * parameters a and d are the x or y coordinates of first and last points on the
 * curve while b and c are of the control points.The final parameter t is the
 * position of the resultant point which is given between 0 and 1.
 * This can be done once with the x coordinates and a second time
 * with the y coordinates to get the location of a Bézier curve at t.
 *
 * @method bezierPoint
 * @param {Number} [a] coordinate of first point on the curve
 * @param {Number} [b] coordinate of first control point
 * @param {Number} [c] coordinate of second control point
 * @param {Number} [d] coordinate of second point on the curve
 * @param {Number} [t] value between 0 and 1
 * @return {Number} the value of the Bezier at position t
 * @example
 * <div>
 * <code>
 * noFill();
 * let x1 = 85,
 * x2 = 10,
 * x3 = 90,
 * x4 = 15;
 * let y1 = 20,
 * y2 = 10,
 * y3 = 90,
 * y4 = 80;
 * bezier(x1, y1, x2, y2, x3, y3, x4, y4);
 * fill(255);
 * let steps = 10;
 * for (let i = 0; i <= steps; i++) {
 *   let t = i / steps;
 *   let x = bezierPoint(x1, x2, x3, x4, t);
 *   let y = bezierPoint(y1, y2, y3, y4, t);
 *   circle(x, y, 5);
 * }
 * </code>
 * </div>
 *
 * @alt
 * 10 points plotted on a given bezier at equal distances.
 */
inline fun p5.bezierPoint(a: Double, b: Double, c: Double, d: Double, t: Double): Double =
    asDynamic().bezierPoint(a, b, c, d, t) as Double

/**
 * Evaluates the tangent to the Bezier at position t for points a, b, c, d.
 * The parameters a and d are the first and last points
 * on the curve, and b and c are the control points.
 * The final parameter t varies between 0 and 1.
 *
 * @method bezierTangent
 * @param {Number} [a] coordinate of first point on the curve
 * @param {Number} [b] coordinate of first control point
 * @param {Number} [c] coordinate of second control point
 * @param {Number} [d] coordinate of second point on the curve
 * @param {Number} [t] value between 0 and 1
 * @return {Number} the tangent at position t
 * @example
 * <div>
 * <code>
 * noFill();
 * bezier(85, 20, 10, 10, 90, 90, 15, 80);
 * let steps = 6;
 * fill(255);
 * for (let i = 0; i <= steps; i++) {
 *   let t = i / steps;
 *   // Get the location of the point
 *   let x = bezierPoint(85, 10, 90, 15, t);
 *   let y = bezierPoint(20, 10, 90, 80, t);
 *   // Get the tangent points
 *   let tx = bezierTangent(85, 10, 90, 15, t);
 *   let ty = bezierTangent(20, 10, 90, 80, t);
 *   // Calculate an angle from the tangent points
 *   let a = atan2(ty, tx);
 *   a += PI;
 *   stroke(255, 102, 0);
 *   line(x, y, cos(a) * 30 + x, sin(a) * 30 + y);
 *   // The following line of code makes a line
 *   // inverse of the above line
 *   //line(x, y, cos(a)*-30 + x, sin(a)*-30 + y);
 *   stroke(0);
 *   ellipse(x, y, 5, 5);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * noFill();
 * bezier(85, 20, 10, 10, 90, 90, 15, 80);
 * stroke(255, 102, 0);
 * let steps = 16;
 * for (let i = 0; i <= steps; i++) {
 *   let t = i / steps;
 *   let x = bezierPoint(85, 10, 90, 15, t);
 *   let y = bezierPoint(20, 10, 90, 80, t);
 *   let tx = bezierTangent(85, 10, 90, 15, t);
 *   let ty = bezierTangent(20, 10, 90, 80, t);
 *   let a = atan2(ty, tx);
 *   a -= HALF_PI;
 *   line(x, y, cos(a) * 8 + x, sin(a) * 8 + y);
 * }
 * </code>
 * </div>
 *
 * @alt
 * s-shaped line with 6 short orange lines showing the tangents at those points.
 * s-shaped line with 6 short orange lines showing lines coming out the underside of the bezier.
 */
inline fun p5.bezierTangent(a: Double, b: Double, c: Double, d: Double, t: Double): Double =
    asDynamic().bezierTangent(a, b, c, d, t) as Double


/**
 * Draws a curved line on the screen between two points, given as the
 * middle four parameters. The first two parameters are a control point, as
 * if the curve came from this point even though it's not drawn. The last
 * two parameters similarly describe the other control point. <br /><br />
 * Longer curves can be created by putting a series of <a href="#/p5/curve">curve()</a> functions
 * together or using <a href="#/p5/curveVertex">curveVertex()</a>. An additional function called
 * <a href="#/p5/curveTightness">curveTightness()</a> provides control for the visual quality of the curve.
 * The <a href="#/p5/curve">curve()</a> function is an implementation of Catmull-Rom splines.
 *
 * @method curve
 * @param  {Number} [x1] x-coordinate for the beginning control point
 * @param  {Number} [y1] y-coordinate for the beginning control point
 * @param  {Number} [z1] z-coordinate for the beginning control point
 * @param  {Number} [x2] x-coordinate for the first point
 * @param  {Number} [y2] y-coordinate for the first point
 * @param  {Number} [z2] z-coordinate for the first point
 * @param  {Number} [x3] x-coordinate for the second point
 * @param  {Number} [y3] y-coordinate for the second point
 * @param  {Number} [z3] z-coordinate for the second point
 * @param  {Number} [x4] x-coordinate for the ending control point
 * @param  {Number} [y4] y-coordinate for the ending control point
 * @param  {Number} [z4] z-coordinate for the ending control point
 * @chainable
 * @example
 * <div>
 * <code>
 * noFill();
 * stroke(255, 102, 0);
 * curve(5, 26, 5, 26, 73, 24, 73, 61);
 * stroke(0);
 * curve(5, 26, 73, 24, 73, 61, 15, 65);
 * stroke(255, 102, 0);
 * curve(73, 24, 73, 61, 15, 65, 15, 65);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // Define the curve points as JavaScript objects
 * let p1 = { x: 5, y: 26 };
 * let p2 = { x: 73, y: 24 };
 * let p3 = { x: 73, y: 61 };
 * let p4 = { x: 15, y: 65 };
 * noFill();
 * stroke(255, 102, 0);
 * curve(p1.x, p1.y, p1.x, p1.y, p2.x, p2.y, p3.x, p3.y);
 * stroke(0);
 * curve(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y, p4.x, p4.y);
 * stroke(255, 102, 0);
 * curve(p2.x, p2.y, p3.x, p3.y, p4.x, p4.y, p4.x, p4.y);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * noFill();
 * stroke(255, 102, 0);
 * curve(5, 26, 0, 5, 26, 0, 73, 24, 0, 73, 61, 0);
 * stroke(0);
 * curve(5, 26, 0, 73, 24, 0, 73, 61, 0, 15, 65, 0);
 * stroke(255, 102, 0);
 * curve(73, 24, 0, 73, 61, 0, 15, 65, 0, 15, 65, 0);
 * </code>
 * </div>
 *
 * @alt
 * horseshoe shape with orange ends facing left and black curved center.
 * horseshoe shape with orange ends facing left and black curved center.
 * curving black and orange lines.
 */
inline fun p5.curve(
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
    z4: Double
): p5 = asDynamic().curve(x1, y1, z1, x2, y2, z2, x3 ,y3, z3, x4, y4, z4) as p5

inline fun p5.curve(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
): p5 = asDynamic().curve(x1, y1, x2, y2, x3 ,y3, x4, y4) as p5


/**
 * Sets the resolution at which curves display. The default value is 20 while
 * the minimum value is 3.
 *
 * This function is only useful when using the WEBGL renderer
 * as the default canvas renderer does not use this
 * information.
 *
 * @method curveDetail
 * @param {Number} [d] resolution of the curves
 * @chainable
 * @example
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *
 *   curveDetail(5);
 * }
 * function draw() {
 *   background(200);
 *
 *   curve(250, 600, 0, -30, 40, 0, 30, 30, 0, -250, 600, 0);
 * }
 * </code>
 * </div>
 *
 * @alt
 * white arch shape with a low level of curve detail.
 */
inline fun p5.curveDetail(d: Int): p5 = asDynamic().curveDetail(d) as p5


/**
 * Modifies the quality of forms created with <a href="#/p5/curve">curve()</a>
 * and <a href="#/p5/curveVertex">curveVertex()</a>.The parameter tightness
 * determines how the curve fits to the vertex points. The value 0.0 is the
 * default value for tightness (this value defines the curves to be Catmull-Rom
 * splines) and the value 1.0 connects all the points with straight lines.
 * Values within the range -5.0 and 5.0 will deform the curves but will leave
 * them recognizable and as values increase in magnitude, they will continue to deform.
 *
 * @method curveTightness
 * @param {Number} [t] amount of deformation from the original vertices
 * @chainable
 * @example
 * <div>
 * <code>
 * // Move the mouse left and right to see the curve change
 * function setup() {
 *   createCanvas(100, 100);
 *   noFill();
 * }
 *
 * function draw() {
 *   background(204);
 *   let t = map(mouseX, 0, width, -5, 5);
 *   curveTightness(t);
 *   beginShape();
 *   curveVertex(10, 26);
 *   curveVertex(10, 26);
 *   curveVertex(83, 24);
 *   curveVertex(83, 61);
 *   curveVertex(25, 65);
 *   curveVertex(25, 65);
 *   endShape();
 * }
 * </code>
 * </div>
 *
 * @alt
 * Line shaped like right-facing arrow,points move with mouse-x and warp shape.
 */
inline fun p5.curveTightness(t: Double): p5 = asDynamic().curveTightness(t) as p5


/**
 * Evaluates the curve at position t for points a, b, c, d.
 * The parameter t varies between 0 and 1, a and d are control points
 * of the curve, and b and c are the start and end points of the curve.
 * This can be done once with the x coordinates and a second time
 * with the y coordinates to get the location of a curve at t.
 *
 * @method curvePoint
 * @param {Number} [a] coordinate of first control point of the curve
 * @param {Number} [b] coordinate of first point
 * @param {Number} [c] coordinate of second point
 * @param {Number} [d] coordinate of second control point
 * @param {Number} [t] value between 0 and 1
 * @return {Number} <a href="#/p5/curve">Curve</a> value at position t
 * @example
 * <div>
 * <code>
 * noFill();
 * curve(5, 26, 5, 26, 73, 24, 73, 61);
 * curve(5, 26, 73, 24, 73, 61, 15, 65);
 * fill(255);
 * ellipseMode(CENTER);
 * let steps = 6;
 * for (let i = 0; i <= steps; i++) {
 *   let t = i / steps;
 *   let x = curvePoint(5, 5, 73, 73, t);
 *   let y = curvePoint(26, 26, 24, 61, t);
 *   ellipse(x, y, 5, 5);
 *   x = curvePoint(5, 73, 73, 15, t);
 *   y = curvePoint(26, 24, 61, 65, t);
 *   ellipse(x, y, 5, 5);
 * }
 * </code>
 * </div>
 *
 *line hooking down to right-bottom with 13 5×5 white ellipse points
 */
inline fun p5.curvePoint(a: Double, b: Double, c: Double, d: Double, t: Double): Double =
    asDynamic().curvePoint(a, b, c, d, t) as Double


/**
 * Evaluates the tangent to the curve at position t for points a, b, c, d.
 * The parameter t varies between 0 and 1, a and d are points on the curve,
 * and b and c are the control points.
 *
 * @method curveTangent
 * @param {Number} [a] coordinate of first control point
 * @param {Number} [b] coordinate of first point on the curve
 * @param {Number} [c] coordinate of second point on the curve
 * @param {Number} [d] coordinate of second control point
 * @param {Number} [t] value between 0 and 1
 * @return {Number} the tangent at position t
 * @example
 * <div>
 * <code>
 * noFill();
 * curve(5, 26, 73, 24, 73, 61, 15, 65);
 * let steps = 6;
 * for (let i = 0; i <= steps; i++) {
 *   let t = i / steps;
 *   let x = curvePoint(5, 73, 73, 15, t);
 *   let y = curvePoint(26, 24, 61, 65, t);
 *   //ellipse(x, y, 5, 5);
 *   let tx = curveTangent(5, 73, 73, 15, t);
 *   let ty = curveTangent(26, 24, 61, 65, t);
 *   let a = atan2(ty, tx);
 *   a -= PI / 2.0;
 *   line(x, y, cos(a) * 8 + x, sin(a) * 8 + y);
 * }
 * </code>
 * </div>
 *
 * @alt
 * right curving line mid-right of canvas with 7 short lines radiating from it.
 */
inline fun p5.curveTangent(a: Double, b: Double, c: Double, d: Double, t: Double): Double =
    asDynamic().curveTangent(a, b, c, d, t) as Double