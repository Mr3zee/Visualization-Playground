@file:Suppress("unused")

package p5.math

import p5.core.p5


/**
 * The inverse of <a href="#/p5/cos">cos()</a>, returns the arc cosine of a value.
 * This function expects the values in the range of -1 to 1 and values are returned in
 * the range 0 to PI (3.1415927) if the <a href="#/p5/angleMode">angleMode()</a> is RADIANS
 * or 0 to 180 if the <a href="#/p5/angleMode">angleMode()</a> is DEGREES.
 *
 * @method acos
 * @param  {Number} [value] the value whose arc cosine is to be returned
 * @return {Number}       the arc cosine of the given value
 *
 * @example
 * <div class= “norender">
 * <code>
 * let a = PI;
 * let c = cos(a);
 * let ac = acos(c);
 * // Prints: "3.1415927 : -1.0 : 3.1415927"
 * print(a + ' : ' + c + ' : ' + ac);
 * </code>
 * </div>
 *
 * <div class= “norender">
 * <code>
 * let a = PI + PI / 4.0;
 * let c = cos(a);
 * let ac = acos(c);
 * // Prints: "3.926991 : -0.70710665 : 2.3561943"
 * print(a + ' : ' + c + ' : ' + ac);
 * </code>
 * </div>
 */
inline fun p5.acos(value: Double): Double = asDynamic().acos(value) as Double

inline fun p5.acos(value: Float): Double = asDynamic().acos(value) as Double

inline fun p5.acos(value: Int): Double = asDynamic().acos(value) as Double

inline fun p5.acos(value: Long): Double = asDynamic().acos(value) as Double


/**
 * The inverse of <a href="#/p5/sin">sin()</a>, returns the arc sine of a value.
 * This function expects the values in the range of -1 to 1 and values are returned
 * in the range -PI/2 to PI/2 if the angleMode is RADIANS or -90 to 90 if the angle
 * mode is DEGREES.
 *
 * @method asin
 * @param  {Number} [value] the value whose arc sine is to be returned
 * @return {Number}       the arc sine of the given value
 *
 * @example
 * <div class= “norender">
 * <code>
 * let a = PI / 3.0;
 * let s = sin(a);
 * let as = asin(s);
 * // Prints: "1.0471975 : 0.86602540 : 1.0471975"
 * print(a + ' : ' + s + ' : ' + as);
 * </code>
 * </div>
 *
 * <div class= “norender">
 * <code>
 * let a = PI + PI / 3.0;
 * let s = sin(a);
 * let as = asin(s);
 * // Prints: "4.1887902 : -0.86602540 : -1.0471975"
 * print(a + ' : ' + s + ' : ' + as);
 * </code>
 * </div>
 */
inline fun p5.asin(value: Double): Double = asDynamic().asin(value) as Double

inline fun p5.asin(value: Float): Double = asDynamic().asin(value) as Double

inline fun p5.asin(value: Int): Double = asDynamic().asin(value) as Double

inline fun p5.asin(value: Long): Double = asDynamic().asin(value) as Double


/**
 * The inverse of <a href="#/p5/tan">tan()</a>, returns the arc tangent of a value.
 * This function expects the values in the range of -Infinity to Infinity (exclusive) and
 * values are returned in the range -PI/2 to PI/2 if the angleMode is RADIANS or
 * -90 to 90 if the angle mode is DEGREES.
 *
 * @method atan
 * @param  {Number} [value] the value whose arc tangent is to be returned
 * @return {Number}       the arc tangent of the given value
 *
 * @example
 * <div class= “norender">
 * <code>
 * let a = PI / 3.0;
 * let t = tan(a);
 * let at = atan(t);
 * // Prints: "1.0471975 : 1.7320508 : 1.0471975"
 * print(a + ' : ' + t + ' : ' + at);
 * </code>
 * </div>
 *
 * <div class= “norender">
 * <code>
 * let a = PI + PI / 3.0;
 * let t = tan(a);
 * let at = atan(t);
 * // Prints: "4.1887902 : 1.7320508 : 1.0471975"
 * print(a + ' : ' + t + ' : ' + at);
 * </code>
 * </div>
 */
inline fun p5.atan(value: Double): Double = asDynamic().atan(value) as Double

inline fun p5.atan(value: Float): Double = asDynamic().atan(value) as Double

inline fun p5.atan(value: Int): Double = asDynamic().atan(value) as Double

inline fun p5.atan(value: Long): Double = asDynamic().atan(value) as Double


/**
 * Calculates the angle (in radians) from a specified point to the coordinate
 * origin as measured from the positive x-axis. Values are returned as a
 * float in the range from PI to -PI if the <a href="#/p5/angleMode">angleMode()</a>
 * is RADIANS or 180 to -180 if the <a href="#/p5/angleMode">angleMode()</a> is DEGREES.
 * The <a href="#/p5/">atan2()</a> function is most often used for orienting geometry
 * to the position of the cursor.
 *
 * Note: The y-coordinate of the point is the first parameter, and the
 * x-coordinate is the second parameter, due to the structure of calculating
 * the tangent.
 *
 * @method atan2
 * @param  {Number} [y] y-coordinate of the point
 * @param  {Number} [x] x-coordinate of the point
 * @return {Number}   the arc tangent of the given point
 *
 * @example
 * <div>
 * <code>
 * function draw() {
 *   background(204);
 *   translate(width / 2, height / 2);
 *   let a = atan2(mouseY - height / 2, mouseX - width / 2);
 *   rotate(a);
 *   rect(-30, -5, 60, 10);
 *   describe(`60×10 rect at center of canvas rotates with mouse movements`);
 * }
 * </code>
 * </div>
 */
inline fun p5.atan2(x: Double, y: Double): Double = asDynamic().atan2(x, y) as Double

inline fun p5.atan2(x: Float, y: Float): Double = asDynamic().atan2(x, y) as Double

inline fun p5.atan2(x: Int, y: Int): Double = asDynamic().atan2(x, y) as Double

inline fun p5.atan2(x: Long, y: Long): Double = asDynamic().atan2(x, y) as Double


/**
 * Calculates the cosine of an angle. This function takes into account the
 * current <a href="#/p5/angleMode">angleMode</a>. Values are returned in the range -1 to 1.
 *
 * @method cos
 * @param  {Number} [angle] the angle
 * @return {Number}       the cosine of the angle
 *
 * @example
 * <div>
 * <code>
 * let a = 0.0;
 * let inc = TWO_PI / 25.0;
 * for (let i = 0; i < 25; i++) {
 *   line(i * 4, 50, i * 4, 50 + cos(a) * 40.0);
 *   a = a + inc;
 * }
 * describe(`vertical black lines form wave patterns, extend-down on
 *   left and right side`);
 * </code>
 * </div>
 */
inline fun p5.cos(angle: Double): Double = asDynamic().cos(angle) as Double

inline fun p5.cos(angle: Float): Double = asDynamic().cos(angle) as Double

inline fun p5.cos(angle: Int): Double = asDynamic().cos(angle) as Double

inline fun p5.cos(angle: Long): Double = asDynamic().cos(angle) as Double


/**
 * Calculates the sine of an angle. This function takes into account the
 * current <a href="#/p5/angleMode">angleMode</a>. Values are returned in the range -1 to 1.
 *
 * @method sin
 * @param  {Number} [angle] the angle
 * @return {Number}       the sine of the angle
 *
 * @example
 * <div>
 * <code>
 * let a = 0.0;
 * let inc = TWO_PI / 25.0;
 * for (let i = 0; i < 25; i++) {
 *   line(i * 4, 50, i * 4, 50 + sin(a) * 40.0);
 *   a = a + inc;
 * }
 * describe(`vertical black lines extend down and up from center
 *   to form wave pattern.`);
 * </code>
 * </div>
 */
inline fun p5.sin(angle: Double): Double = asDynamic().sin(angle) as Double

inline fun p5.sin(angle: Float): Double = asDynamic().sin(angle) as Double

inline fun p5.sin(angle: Int): Double = asDynamic().sin(angle) as Double

inline fun p5.sin(angle: Long): Double = asDynamic().sin(angle) as Double


/**
 * Calculates the tangent of an angle. This function takes into account
 * the current <a href="#/p5/angleMode">angleMode</a>. Values are returned in the range of all real numbers.
 *
 * @method tan
 * @param  {Number} [angle] the angle
 * @return {Number}       the tangent of the angle
 *
 * @example
 * <div>
 * <code>
 * let a = 0.0;
 * let inc = TWO_PI / 50.0;
 * for (let i = 0; i < 100; i = i + 2) {
 *   line(i, 50, i, 50 + tan(a) * 2.0);
 *   a = a + inc;
 * }
 * describe(`vertical black lines end down and up from center to
 *   form spike pattern.`);
 * </code>
 */
inline fun p5.tan(angle: Double): Double = asDynamic().tan(angle) as Double

inline fun p5.tan(angle: Float): Double = asDynamic().tan(angle) as Double

inline fun p5.tan(angle: Int): Double = asDynamic().tan(angle) as Double

inline fun p5.tan(angle: Long): Double = asDynamic().tan(angle) as Double


/**
 * Converts a radian measurement to its corresponding value in degrees.
 * Radians and degrees are two ways of measuring the same thing. There are
 * 360 degrees in a circle and 2*PI radians in a circle. For example,
 * 90° = PI/2 = 1.5707964. This function does not take into account the
 * current <a href="#/p5/angleMode">angleMode()</a>.
 *
 * @method degrees
 * @param  {Number} [radians] the radians value to convert to degrees
 * @return {Number}         the converted angle
 *
 * @example
 * <div class= “norender">
 * <code>
 * let rad = PI / 4;
 * let deg = degrees(rad);
 * print(rad + ' radians is ' + deg + ' degrees');
 * // Prints: 0.7853981633974483 radians is 45 degrees
 * </code>
 * </div>
 */
inline fun p5.degrees(radians: Double): Double = asDynamic().degrees(radians) as Double

inline fun p5.degrees(radians: Float): Double = asDynamic().degrees(radians) as Double

inline fun p5.degrees(radians: Int): Double = asDynamic().degrees(radians) as Double

inline fun p5.degrees(radians: Long): Double = asDynamic().degrees(radians) as Double


/**
 * Converts a degree measurement to its corresponding value in radians.
 * Radians and degrees are two ways of measuring the same thing. There are
 * 360 degrees in a circle and 2*PI radians in a circle. For example,
 * 90° = PI/2 = 1.5707964. This function does not take into account the
 * current <a href="#/p5/angleMode">angleMode</a>.
 *
 * @method radians
 * @param  {Number} degrees the degree value to convert to radians
 * @return {Number}         the converted angle
 *
 * @example
 * <div class= “norender">
 * <code>
 * let deg = 45.0;
 * let rad = radians(deg);
 * print(deg + ' degrees is ' + rad + ' radians');
 * // Prints: 45 degrees is 0.7853981633974483 radians
 * </code>
 * </div>
 */
inline fun p5.radians(degrees: Double): Double = asDynamic().radians(degrees) as Double

inline fun p5.radians(degrees: Float): Double = asDynamic().radians(degrees) as Double

inline fun p5.radians(degrees: Int): Double = asDynamic().radians(degrees) as Double

inline fun p5.radians(degrees: Long): Double = asDynamic().radians(degrees) as Double


/**
 * Sets the current mode of p5 to the given mode. Default mode is RADIANS.
 *
 * @method angleMode
 * @param {Constant} mode either RADIANS or DEGREES
 *
 * @example
 * <div>
 * <code>
 * function draw() {
 *   background(204);
 *   angleMode(DEGREES); // Change the mode to DEGREES
 *   let a = atan2(mouseY - height / 2, mouseX - width / 2);
 *   translate(width / 2, height / 2);
 *   push();
 *   rotate(a);
 *   rect(-20, -5, 40, 10); // Larger rectangle is rotating in degrees
 *   pop();
 *   angleMode(RADIANS); // Change the mode to RADIANS
 *   rotate(a); // variable a stays the same
 *   rect(-40, -5, 20, 10); // Smaller rectangle is rotating in radians
 *   describe(`40×10 rect in center rotates with mouse moves.
 *     20×10 rect moves faster.`);
 * }
 * </code>
 * </div>
 *
 */
inline fun p5.angleMode(mode: String) { asDynamic().angleMode(mode) }
