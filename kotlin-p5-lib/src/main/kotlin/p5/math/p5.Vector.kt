/**
 * @file methods for p5.Vector
 *
 * @see <a href="https://github.com/processing/p5.js/blob/main/src/math/p5.Vector.js">source</a>
 */

@file:Suppress("EXTENSION_SHADOWED_BY_MEMBER", "unused")

package p5.math

import p5.core.p5

/**
 * Returns a string representation of a vector `v` by calling `String(v)`
 * or `v.toString()`. This method is useful for logging vectors in the
 * console.
 * @method toString
 * @return {String}
 * @example
 * <div class = "norender">
 * <code>
 * function setup() {
 *   let v = createVector(20, 30);
 *   print(String(v)); // prints "p5.Vector Object : [20, 30, 0]"
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 0);
 *   let v1 = createVector(mouseX, mouseY);
 *   drawArrow(v0, v1, 'black');
 *
 *   noStroke();
 *   text(v1.toString(), 10, 25, 90, 75);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.toString() { asDynamic().toString() }

/**
 * Sets the `x`, `y`, and `z` components of the vector using two or three separate
 * variables, the data from a <a href="#/p5.Vector">p5.Vector</a>, or the values from a float array.
 * @method set
 * @param {Number} [x] The x component of the vector
 * @param {Number} [y] The y component of the vector
 * @param {Number} [z] The z component of the vector
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let v = createVector(1, 2, 3);
 *   v.set(4, 5, 6); // Sets vector to [4, 5, 6]
 *
 *   let v1 = createVector(0, 0, 0);
 *   let arr = [1, 2, 3];
 *   v1.set(arr); // Sets vector to [1, 2, 3]
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let v0, v1;
 * function setup() {
 *   createCanvas(100, 100);
 *
 *   v0 = createVector(0, 0);
 *   v1 = createVector(50, 50);
 * }
 *
 * function draw() {
 *   background(240);
 *
 *   drawArrow(v0, v1, 'black');
 *   v1.set(v1.x + random(-1, 1), v1.y + random(-1, 1));
 *
 *   noStroke();
 *   text('x: ' + round(v1.x) + ' y: ' + round(v1.y), 20, 90);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.set(x: Double, y: Double, z: Double): p5.Vector = asDynamic().set(x, y, z) as p5.Vector

inline fun p5.Vector.set(x: Double, y: Double): p5.Vector = asDynamic().set(x, y) as p5.Vector

inline fun p5.Vector.set(v: p5.Vector): p5.Vector = asDynamic().set(v) as p5.Vector

inline fun p5.Vector.set(a: Array<Double>): p5.Vector = asDynamic().set(a) as p5.Vector


/**
 * Gets a copy of the vector, returns a <a href="#/p5.Vector">p5.Vector</a> object.
 *
 * @method copy
 * @return {p5.Vector} A copy of the <a href="#/p5.Vector">p5.Vector</a> object
 * @example
 * <div class="norender">
 * <code>
 * let v1 = createVector(1, 2, 3);
 * let v2 = v1.copy();
 * print(v1.x === v2.x && v1.y === v2.y && v1.z === v2.z);
 * // Prints "true"
 * </code>
 * </div>
 */
inline fun p5.Vector.copy(): p5.Vector = asDynamic().copy() as p5.Vector


/**
 * Adds `x`, `y`, and `z` components to a vector, adds one vector to another, or
 * adds two independent vectors together. The version of the method that adds
 * two vectors together is a static method and returns a <a href="#/p5.Vector">p5.Vector</a>, the others
 * act directly on the vector. Additionally, you may provide arguments to this method as an array.
 * See the examples for more context.
 *
 * @method add
 * @param  {Number} x   The x component of the vector to be added
 * @param  {Number} [y] The y component of the vector to be added
 * @param  {Number} [z] The z component of the vector to be added
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(1, 2, 3);
 * v.add(4, 5, 6);
 * // v's components are set to [5, 7, 9]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v = createVector(1, 2, 3);
 * // Provide arguments as an array
 * let arr = [4, 5, 6];
 * v.add(arr);
 * // v's components are set to [5, 7, 9]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * // Static method
 * let v1 = createVector(1, 2, 3);
 * let v2 = createVector(2, 3, 4);
 *
 * let v3 = p5.Vector.add(v1, v2);
 * // v3 has components [3, 5, 7]
 * print(v3);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // red vector + blue vector = purple vector
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 0);
 *   let v1 = createVector(mouseX, mouseY);
 *   drawArrow(v0, v1, 'red');
 *
 *   let v2 = createVector(-30, 20);
 *   drawArrow(v1, v2, 'blue');
 *
 *   let v3 = p5.Vector.add(v1, v2);
 *   drawArrow(v0, v3, 'purple');
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.add(x: Double, y: Double, z: Double): p5.Vector = asDynamic().add(x, y, z) as p5.Vector

inline fun p5.Vector.add(x: Double, y: Double): p5.Vector = asDynamic().add(x, y) as p5.Vector

inline fun p5.Vector.add(v: p5.Vector): p5.Vector = asDynamic().add(v) as p5.Vector

inline fun p5.Vector.add(a: Array<Double>): p5.Vector = asDynamic().add(a) as p5.Vector

/**
 * Gives the remainder of a vector when it is divided by another vector.
 * See examples for more context.
 *
 * @method rem
 * @param {Number} x The x component of divisor vector
 * @param {Number} y The y component of divisor vector
 * @param {Number} z The z component of divisor vector
 * @chainable
 * @example
 * <div class='norender'>
 * <code>
 * let v = createVector(3, 4, 5);
 * v.rem(2, 3, 4);
 * // v's components are set to [1, 1, 1]
 * </code>
 * </div>
 * <div class="norender">
 * <code>
 * // Static method
 * let v1 = createVector(3, 4, 5);
 * let v2 = createVector(2, 3, 4);
 *
 * let v3 = p5.Vector.rem(v1, v2);
 * // v3 has components [1, 1, 1]
 * print(v3);
 * </code>
 * </div>
 */
inline fun p5.Vector.rem(x: Double, y: Double, z: Double): p5.Vector = asDynamic().rem(x, y, z) as p5.Vector

inline fun p5.Vector.rem(x: Double, y: Double): p5.Vector = asDynamic().rem(x, y) as p5.Vector

inline fun p5.Vector.rem(x: Double): p5.Vector = asDynamic().rem(x) as p5.Vector

inline fun p5.Vector.rem(v: p5.Vector): p5.Vector = asDynamic().rem(v) as p5.Vector

inline fun p5.Vector.rem(a: Array<Double>): p5.Vector = asDynamic().rem(a) as p5.Vector


/**
 * Subtracts `x`, `y`, and `z` components from a vector, subtracts one vector from
 * another, or subtracts two independent vectors. The version of the method
 * that subtracts two vectors is a static method and returns a <a href="#/p5.Vector">p5.Vector</a>, the
 * others act directly on the vector. Additionally, you may provide arguments to this method as an array.
 * See the examples for more context.
 *
 * @method sub
 * @param  {Number} [x]   The x component of the vector to subtract
 * @param  {Number} [y] The y component of the vector to subtract
 * @param  {Number} [z] The z component of the vector to subtract
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(4, 5, 6);
 * v.sub(1, 1, 1);
 * // v's components are set to [3, 4, 5]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v = createVector(4, 5, 6);
 * // Provide arguments as an array
 * let arr = [1, 1, 1];
 * v.sub(arr);
 * // v's components are set to [3, 4, 5]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * // Static method
 * let v1 = createVector(2, 3, 4);
 * let v2 = createVector(1, 2, 3);
 *
 * let v3 = p5.Vector.sub(v1, v2);
 * // v3 has components [1, 1, 1]
 * print(v3);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * // red vector - blue vector = purple vector
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 0);
 *   let v1 = createVector(70, 50);
 *   drawArrow(v0, v1, 'red');
 *
 *   let v2 = createVector(mouseX, mouseY);
 *   drawArrow(v0, v2, 'blue');
 *
 *   let v3 = p5.Vector.sub(v1, v2);
 *   drawArrow(v2, v3, 'purple');
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.sub(x: Double, y: Double, z: Double): p5.Vector = asDynamic().sub(x, y, z) as p5.Vector

inline fun p5.Vector.sub(x: Double, y: Double): p5.Vector = asDynamic().sub(x, y) as p5.Vector

inline fun p5.Vector.sub(v: p5.Vector): p5.Vector = asDynamic().sub(v) as p5.Vector

inline fun p5.Vector.sub(a: Array<Double>): p5.Vector = asDynamic().sub(a) as p5.Vector


/**
 * Multiplies the vector by a scalar, multiplies the `x`, `y`, and `z` components from a vector, or multiplies
 * the `x`, `y`, and `z` components of two independent vectors. When multiplying a vector by a scalar, the `x`, `y`,
 * and `z` components of the vector are all multiplied by the scalar. When multiplying a vector by a vector,
 * the `x`, `y`, `z` components of both vectors are multiplied by each other
 * (for example, with two vectors `a` and `b`: `a.x * b.x`, `a.y * b.y`, `a.z * b.z`). The static version of this method
 * creates a new <a href="#/p5.Vector">p5.Vector</a> while the non-static version acts on the vector
 * directly. Additionally, you may provide arguments to this function as an array.
 * See the examples for more context.
 *
 * @method mult
 * @param  {Number} n The number to multiply with the vector
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(1, 2, 3);
 * v.mult(2);
 * // v's components are set to [2, 4, 6]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v0 = createVector(1, 2, 3);
 * let v1 = createVector(2, 3, 4);
 * v0.mult(v1); // v0's components are set to [2, 6, 12]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v0 = createVector(1, 2, 3);
 * // Provide arguments as an array
 * let arr = [2, 3, 4];
 * v0.mult(arr); // v0's components are set to [2, 6, 12]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v0 = createVector(1, 2, 3);
 * let v1 = createVector(2, 3, 4);
 * const result = p5.Vector.mult(v0, v1);
 * print(result); // result's components are set to [2, 6, 12]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * // Static method
 * let v1 = createVector(1, 2, 3);
 * let v2 = p5.Vector.mult(v1, 2);
 * // v2 has components [2, 4, 6]
 * print(v2);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(50, 50);
 *   let v1 = createVector(25, -25);
 *   drawArrow(v0, v1, 'red');
 *
 *   let num = map(mouseX, 0, width, -2, 2, true);
 *   let v2 = p5.Vector.mult(v1, num);
 *   drawArrow(v0, v2, 'blue');
 *
 *   noStroke();
 *   text('multiplied by ' + num.toFixed(2), 5, 90);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.mult(x: Double, y: Double, z: Double): p5.Vector = asDynamic().mult(x, y, z) as p5.Vector

inline fun p5.Vector.mult(x: Double, y: Double): p5.Vector = asDynamic().mult(x, y) as p5.Vector

inline fun p5.Vector.mult(x: Double): p5.Vector = asDynamic().mult(x) as p5.Vector

inline fun p5.Vector.mult(v: p5.Vector): p5.Vector = asDynamic().mult(v) as p5.Vector

inline fun p5.Vector.mult(a: Array<Double>): p5.Vector = asDynamic().mult(a) as p5.Vector


/**
 * Divides the vector by a scalar, divides a vector by the `x`, `y`, and `z` arguments, or divides the `x`, `y`, and
 * `z` components of two vectors against each other. When dividing a vector by a scalar, the `x`, `y`,
 * and `z` components of the vector are all divided by the scalar. When dividing a vector by a vector,
 * the `x`, `y`, `z` components of the source vector are treated as the dividend, and the `x`, `y`, `z` components
 * of the argument is treated as the divisor. (For example, with two vectors
 * `a` and `b`: `a.x / b.x`, `a.y / b.y`, `a.z / b.z`.)
 * The static version of this method creates a
 * new <a href="#/p5.Vector">p5.Vector</a> while the non-static version acts on the vector directly.
 * Additionally, you may provide arguments to this method as an array.
 * See the examples for more context.
 *
 * @method div
 * @param  {number}    n The number to divide the vector by
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(6, 4, 2);
 * v.div(2); //v's components are set to [3, 2, 1]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v0 = createVector(9, 4, 2);
 * let v1 = createVector(3, 2, 4);
 * v0.div(v1); // v0's components are set to [3, 2, 0.5]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v0 = createVector(9, 4, 2);
 * // Provide arguments as an array
 * let arr = [3, 2, 4];
 * v0.div(arr); // v0's components are set to [3, 2, 0.5]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v0 = createVector(9, 4, 2);
 * let v1 = createVector(3, 2, 4);
 * let result = p5.Vector.div(v0, v1);
 * print(result); // result's components are set to [3, 2, 0.5]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * // Static method
 * let v1 = createVector(6, 4, 2);
 * let v2 = p5.Vector.div(v1, 2);
 * // v2 has components [3, 2, 1]
 * print(v2);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 100);
 *   let v1 = createVector(50, -50);
 *   drawArrow(v0, v1, 'red');
 *
 *   let num = map(mouseX, 0, width, 10, 0.5, true);
 *   let v2 = p5.Vector.div(v1, num);
 *   drawArrow(v0, v2, 'blue');
 *
 *   noStroke();
 *   text('divided by ' + num.toFixed(2), 10, 90);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.div(x: Double, y: Double, z: Double): p5.Vector = asDynamic().div(x, y, z) as p5.Vector

inline fun p5.Vector.div(x: Double, y: Double): p5.Vector = asDynamic().div(x, y) as p5.Vector

inline fun p5.Vector.div(x: Double): p5.Vector = asDynamic().div(x) as p5.Vector

inline fun p5.Vector.div(v: p5.Vector): p5.Vector = asDynamic().div(v) as p5.Vector

inline fun p5.Vector.div(a: Array<Double>): p5.Vector = asDynamic().div(a) as p5.Vector


/**
 * Calculates the magnitude (length) of the vector and returns the result as
 * a float. (This is simply the equation `sqrt(x*x + y*y + z*z)`.)
 *
 * @method mag
 * @return {Number} The magnitude of the vector
 * @example
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 0);
 *   let v1 = createVector(mouseX, mouseY);
 *   drawArrow(v0, v1, 'black');
 *
 *   noStroke();
 *   text('vector length: ' + v1.mag().toFixed(2), 10, 70, 90, 30);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 * <div class="norender">
 * <code>
 * let v = createVector(20.0, 30.0, 40.0);
 * let m = v.mag();
 * print(m); // Prints "53.85164807134504"
 * </code>
 * </div>
 */
inline fun p5.Vector.mag(): Double = asDynamic().mag() as Double


/**
 * Calculates the squared magnitude of the vector and returns the result
 * as a float. (This is simply the equation `x*x + y*y + z*z`.)
 * Faster if the real length is not required in the
 * case of comparing vectors, etc.
 *
 * @method magSq
 * @return {number} The squared magnitude of the vector
 * @example
 * <div class="norender">
 * <code>
 * // Static method
 * let v1 = createVector(6, 4, 2);
 * print(v1.magSq()); // Prints "56"
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 0);
 *   let v1 = createVector(mouseX, mouseY);
 *   drawArrow(v0, v1, 'black');
 *
 *   noStroke();
 *   text('vector length squared: ' + v1.magSq().toFixed(2), 10, 45, 90, 55);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.magSq(): Double = asDynamic().magSq() as Double


/**
 * Calculates the dot product of two vectors. The version of the method
 * that computes the dot product of two independent vectors is a static
 * method. See the examples for more context.
 *
 * @method dot
 * @param  {Number} [x]   The x component of the vector
 * @param  {Number} [y] The y component of the vector
 * @param  {Number} [z] The z component of the vector
 * @return {Number}       The dot product
 *
 * @example
 * <div class="norender">
 * <code>
 * let v1 = createVector(1, 2, 3);
 * let v2 = createVector(2, 3, 4);
 *
 * print(v1.dot(v2)); // Prints "20"
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * //Static method
 * let v1 = createVector(1, 2, 3);
 * let v2 = createVector(3, 2, 1);
 * print(p5.Vector.dot(v1, v2)); // Prints "10"
 * </code>
 * </div>
 */
inline fun p5.Vector.dot(x: Double, y: Double, z: Double): p5.Vector = asDynamic().dot(x, y, z) as p5.Vector

inline fun p5.Vector.dot(x: Double, y: Double): p5.Vector = asDynamic().dot(x, y) as p5.Vector

inline fun p5.Vector.dot(v: p5.Vector): p5.Vector = asDynamic().dot(v) as p5.Vector


/**
 * Calculates and returns a vector composed of the cross product between
 * two vectors. Both the static and non-static methods return a new <a href="#/p5.Vector">p5.Vector</a>.
 * See the examples for more context.
 *
 * @method cross
 * @param  {p5.Vector} v <a href="#/p5.Vector">p5.Vector</a> to be crossed
 * @return {p5.Vector}   <a href="#/p5.Vector">p5.Vector</a> composed of cross product
 * @example
 * <div class="norender">
 * <code>
 * let v1 = createVector(1, 2, 3);
 * let v2 = createVector(1, 2, 3);
 *
 * let v = v1.cross(v2); // v's components are [0, 0, 0]
 * print(v);
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * // Static method
 * let v1 = createVector(1, 0, 0);
 * let v2 = createVector(0, 1, 0);
 *
 * let crossProduct = p5.Vector.cross(v1, v2);
 * // crossProduct has components [0, 0, 1]
 * print(crossProduct);
 * </code>
 * </div>
 */
inline fun p5.Vector.cross(v: p5.Vector): p5.Vector = asDynamic().cross(v) as p5.Vector


/**
 * Calculates the Euclidean distance between two points (considering a
 * point as a vector object).
 * If you are looking to calculate distance between 2 points see <a href="#/p5/dist">dist()</a>
 *
 * @method dist
 * @param  {p5.Vector} v The x, y, and z coordinates of a <a href="#/p5.Vector">p5.Vector</a>
 * @return {Number}      The distance
 * @example
 * <div class="norender">
 * <code>
 * let v1 = createVector(1, 0, 0);
 * let v2 = createVector(0, 1, 0);
 *
 * let distance = v1.dist(v2); // distance is 1.4142...
 * print(distance);
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * // Static method
 * let v1 = createVector(1, 0, 0);
 * let v2 = createVector(0, 1, 0);
 *
 * let distance = p5.Vector.dist(v1, v2);
 * // distance is 1.4142...
 * print(distance);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 0);
 *
 *   let v1 = createVector(70, 50);
 *   drawArrow(v0, v1, 'red');
 *
 *   let v2 = createVector(mouseX, mouseY);
 *   drawArrow(v0, v2, 'blue');
 *
 *   noStroke();
 *   text('distance between vectors: ' + v2.dist(v1).toFixed(2), 5, 50, 95, 50);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.dist(v: p5.Vector): Double = asDynamic().dist(v) as Double


/**
 * Normalize the vector to length 1 (make it a unit vector).
 *
 * @method normalize
 * @return {p5.Vector} The normalized <a href="#/p5.Vector">p5.Vector</a>
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(10, 20, 2);
 * // v has components [10.0, 20.0, 2.0]
 * v.normalize();
 * // v's components are set to
 * // [0.4454354, 0.8908708, 0.089087084]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * // Static method
 * let v_initial = createVector(10, 20, 2);
 * // v_initial has components [10.0, 20.0, 2.0]
 * let v_normalized = p5.Vector.normalize(v_initial);
 * print(v_normalized);
 * // returns a new vector with components set to
 * // [0.4454354, 0.8908708, 0.089087084]
 * // v_initial remains unchanged
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(50, 50);
 *   let v1 = createVector(mouseX - 50, mouseY - 50);
 *
 *   drawArrow(v0, v1, 'red');
 *   v1.normalize();
 *   drawArrow(v0, v1.mult(35), 'blue');
 *
 *   noFill();
 *   ellipse(50, 50, 35 * 2);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.normalize(): Double = asDynamic().normolize() as Double


/**
 * Limit the magnitude of this vector to the value used for the `max`
 * parameter.
 *
 * @method limit
 * @param  {Number}    max The maximum magnitude for the vector
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(10, 20, 2);
 * // v has components [10.0, 20.0, 2.0]
 * v.limit(5);
 * // v's components are set to
 * // [2.2271771, 4.4543543, 0.4454354]
 * </code>
 * </div>
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(50, 50);
 *   let v1 = createVector(mouseX - 50, mouseY - 50);
 *
 *   drawArrow(v0, v1, 'red');
 *   drawArrow(v0, v1.limit(35), 'blue');
 *
 *   noFill();
 *   ellipse(50, 50, 35 * 2);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.limit(max: Double): p5.Vector = asDynamic().limit(max) as p5.Vector


/**
 * Set the magnitude of this vector to the value used for the `len`
 * parameter.
 *
 * @method setMag
 * @param  {number}    len The new length for this vector
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(3, 4, 0);
 * // v has components [3.0, 4.0, 0.0]
 * v.setMag(10);
 * // v's components are set to [6.0, 8.0, 0.0]
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 0);
 *   let v1 = createVector(50, 50);
 *
 *   drawArrow(v0, v1, 'red');
 *
 *   let length = map(mouseX, 0, width, 0, 141, true);
 *   v1.setMag(length);
 *   drawArrow(v0, v1, 'blue');
 *
 *   noStroke();
 *   text('magnitude set to: ' + length.toFixed(2), 10, 70, 90, 30);
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.setMag(n: Double): p5.Vector = asDynamic().setMag(n) as p5.Vector


/**
 * Calculate the angle of rotation for this vector (only 2D vectors).
 * p5.Vectors created using <a href="#/p5/createVector">createVector()</a>
 * will take the current <a href="#/p5/angleMode">angleMode()</a> into
 * consideration, and give the angle in radians or degree accordingly.
 *
 * @method heading
 * @return {Number} The angle of rotation
 * @example
 * <div class = "norender">
 * <code>
 * function setup() {
 *   let v1 = createVector(30, 50);
 *   print(v1.heading()); // 1.0303768265243125
 *
 *   v1 = createVector(40, 50);
 *   print(v1.heading()); // 0.8960553845713439
 *
 *   v1 = createVector(30, 70);
 *   print(v1.heading()); // 1.1659045405098132
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(50, 50);
 *   let v1 = createVector(mouseX - 50, mouseY - 50);
 *
 *   drawArrow(v0, v1, 'black');
 *
 *   let myHeading = v1.heading();
 *   noStroke();
 *   text(
 *     'vector heading: ' +
 *       myHeading.toFixed(2) +
 *       ' radians or ' +
 *       degrees(myHeading).toFixed(2) +
 *       ' degrees',
 *     10,
 *     50,
 *     90,
 *     50
 *   );
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.heading(): Double = asDynamic().heading() as Double


/**
* Rotate the vector to a specific angle (only 2D vectors); magnitude remains the
* same.
*
* @method setHeading
* @param  {number}    angle The angle of rotation
* @chainable
* @example
* <div class="norender">
* <code>
* let v = createVector(10.0, 20.0);
* // result of v.heading() is 1.1071487177940904
* v.setHeading(Math.PI);
* // result of v.heading() is now 3.141592653589793
* </code>
* </div>
*/

inline fun p5.Vector.setHeading(a: Double): p5.Vector = asDynamic().setHeading(a) as p5.Vector


/**
 * Rotate the vector by an angle (only 2D vectors); magnitude remains the
 * same.
 *
 * @method rotate
 * @param {number} angle The angle of rotation
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(10.0, 20.0);
 * // v has components [10.0, 20.0, 0.0]
 * v.rotate(HALF_PI);
 * // v's components are set to [-20.0, 9.999999, 0.0]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * // static function implementation
 * let v = createVector(10.0, 20.0);
 * // v has components [10.0, 20.0, 0.0]
 * let rotated_v = p5.Vector.rotate(v, HALF_PI);
 * console.log(rotated_v);
 * // rotated_v's components are set to [-20.0, 9.999999, 0.0]
 * console.log(v);
 * // v's components remains the same (i.e, [10.0, 20.0, 0.0])
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let angle = 0;
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(50, 50);
 *   let v1 = createVector(50, 0);
 *
 *   drawArrow(v0, v1.rotate(angle), 'black');
 *   angle += 0.01;
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.rotate(a: Double): p5.Vector = asDynamic().rotate(a) as p5.Vector


/**
 * Calculates and returns the angle between two vectors. This method will take
 * the current <a href="#/p5/angleMode">angleMode</a> into consideration, and
 * give the angle in radians or degree accordingly.
 *
 * @method angleBetween
 * @param  {p5.Vector}    value The x, y, and z components of a <a href="#/p5.Vector">p5.Vector</a>
 * @return {Number}       The angle between (in radians)
 * @example
 * <div class="norender">
 * <code>
 * let v1 = createVector(1, 0, 0);
 * let v2 = createVector(0, 1, 0);
 *
 * let angle = v1.angleBetween(v2);
 * // angle is PI/2
 * print(angle);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *   let v0 = createVector(50, 50);
 *
 *   let v1 = createVector(50, 0);
 *   drawArrow(v0, v1, 'red');
 *
 *   let v2 = createVector(mouseX - 50, mouseY - 50);
 *   drawArrow(v0, v2, 'blue');
 *
 *   let angleBetween = v1.angleBetween(v2);
 *   noStroke();
 *   text(
 *     'angle between: ' +
 *       angleBetween.toFixed(2) +
 *       ' radians or ' +
 *       degrees(angleBetween).toFixed(2) +
 *       ' degrees',
 *     10,
 *     50,
 *     90,
 *     50
 *   );
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */

inline fun p5.Vector.angleBetween(v: p5.Vector): Double = asDynamic().angleBetween(v) as Double


/**
 * Linear interpolate the vector to another vector.
 *
 * @method lerp
 * @param  {Number}    x   The x component
 * @param  {Number}    y   The y component
 * @param  {Number}    z   The z component
 * @param  {Number}    amt The amount of interpolation; some value between 0.0
 *                         (old vector) and 1.0 (new vector). 0.9 is very near
 *                         the new vector. 0.5 is halfway in between.
 * @chainable
 *
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(1, 1, 0);
 *
 * v.lerp(3, 3, 0, 0.5); // v now has components [2,2,0]
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v1 = createVector(0, 0, 0);
 * let v2 = createVector(100, 100, 0);
 *
 * let v3 = p5.Vector.lerp(v1, v2, 0.5);
 * // v3 has components [50,50,0]
 * print(v3);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let step = 0.01;
 * let amount = 0;
 *
 * function draw() {
 *   background(240);
 *   let v0 = createVector(0, 0);
 *
 *   let v1 = createVector(mouseX, mouseY);
 *   drawArrow(v0, v1, 'red');
 *
 *   let v2 = createVector(90, 90);
 *   drawArrow(v0, v2, 'blue');
 *
 *   if (amount > 1 || amount < 0) {
 *     step *= -1;
 *   }
 *   amount += step;
 *   let v3 = p5.Vector.lerp(v1, v2, amount);
 *
 *   drawArrow(v0, v3, 'purple');
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.lerp(x: Double, y: Double, z: Double, amt: Double): p5.Vector = asDynamic().lerp(x, y, z, amt) as p5.Vector

inline fun p5.Vector.lerp(x: Double, y: Double, amt: Double): p5.Vector = asDynamic().lerp(x, y, amt) as p5.Vector

inline fun p5.Vector.lerp(v: p5.Vector, amt: Double): p5.Vector = asDynamic().lerp(v, amt) as p5.Vector


/**
 * Reflect the incoming vector about a normal to a line in 2D, or about a normal to a plane in 3D.
 * This method acts on the vector directly.
 *
 * @method reflect
 * @param  {p5.Vector} surfaceNormal   The <a href="#/p5.Vector">p5.Vector</a> to reflect about; will be normalized by this method.
 * @chainable
 * @example
 * <div class="norender">
 * <code>
 * let v = createVector(4, 6); // incoming vector, this example vector is heading to the right and downward
 * let n = createVector(0, -1); // surface normal to a plane (this example normal points directly upwards)
 * v.reflect(n); // v is reflected about the surface normal n.  v's components are now set to [4, -6]
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(0, 0);
 *   let v1 = createVector(mouseX, mouseY);
 *   drawArrow(v0, v1, 'red');
 *
 *   let n = createVector(0, -30);
 *   drawArrow(v1, n, 'blue');
 *
 *   let r = v1.copy();
 *   r.reflect(n);
 *   drawArrow(v1, r, 'purple');
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.reflect(surfaceNormal: p5.Vector): p5.Vector = asDynamic().reflect(surfaceNormal) as p5.Vector


/**
 * Return a representation of this vector as a float array. This is only
 * for temporary use. If used in any other fashion, the contents should be
 * copied by using the <b>p5.Vector.<a href="#/p5.Vector/copy">copy()</a></b> method to copy into your own
 * array.
 *
 * @method array
 * @return {Number[]} An Array with the 3 values
 * @example
 * <div class = "norender">
 * <code>
 * function setup() {
 *   let v = createVector(20, 30);
 *   print(v.array()); // Prints : Array [20, 30, 0]
 * }
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v = createVector(10.0, 20.0, 30.0);
 * let f = v.array();
 * print(f[0]); // Prints "10.0"
 * print(f[1]); // Prints "20.0"
 * print(f[2]); // Prints "30.0"
 * </code>
 * </div>
 */
inline fun p5.Vector.array(): Array<Double> = asDynamic().array() as Array<Double>


/**
 * Equality check against a <a href="#/p5.Vector">p5.Vector</a>.
 *
 * @method equals
 * @param {Number} [x] The x component of the vector
 * @param {Number} [y] The y component of the vector
 * @param {Number} [z] The z component of the vector
 * @return {Boolean} Whether the vectors are equal
 * @example
 * <div class = "norender">
 * <code>
 * let v1 = createVector(5, 10, 20);
 * let v2 = createVector(5, 10, 20);
 * let v3 = createVector(13, 10, 19);
 *
 * print(v1.equals(v2.x, v2.y, v2.z)); // true
 * print(v1.equals(v3.x, v3.y, v3.z)); // false
 * </code>
 * </div>
 *
 * <div class="norender">
 * <code>
 * let v1 = createVector(10.0, 20.0, 30.0);
 * let v2 = createVector(10.0, 20.0, 30.0);
 * let v3 = createVector(0.0, 0.0, 0.0);
 * print(v1.equals(v2)); // true
 * print(v1.equals(v3)); // false
 * </code>
 * </div>
 */
inline fun p5.Vector.equals(x: Double, y: Double, z: Double): Boolean = asDynamic().equals(x, y, z) as Boolean

inline fun p5.Vector.equals(x: Double, y: Double): Boolean = asDynamic().equals(x, y) as Boolean

inline fun p5.Vector.equals(v: p5.Vector): Boolean = asDynamic().equals(v, undefined, undefined) as Boolean

inline fun p5.Vector.equals(a: Array<Double>): Boolean = asDynamic().equals(a, undefined, undefined) as Boolean


// Static Methods

/**
 * Make a new 2D vector from an angle.
 *
 * @method fromAngle
 * @static
 * @param {Number}     angle The desired angle, in radians (unaffected by <a href="#/p5/angleMode">angleMode</a>)
 * @param {Number}     [length] The length of the new vector (defaults to 1)
 * @return {p5.Vector}       The new <a href="#/p5.Vector">p5.Vector</a> object
 * @example
 * <div>
 * <code>
 * function draw() {
 *   background(200);
 *
 *   // Create a variable, proportional to the mouseX,
 *   // varying from 0-360, to represent an angle in degrees.
 *   let myDegrees = map(mouseX, 0, width, 0, 360);
 *
 *   // Display that variable in an onscreen text.
 *   // (Note the nfc() function to truncate additional decimal places,
 *   // and the "\xB0" character for the degree symbol.)
 *   let readout = 'angle = ' + nfc(myDegrees, 1) + '\xB0';
 *   noStroke();
 *   fill(0);
 *   text(readout, 5, 15);
 *
 *   // Create a p5.Vector using the fromAngle function,
 *   // and extract its x and y components.
 *   let v = p5.Vector.fromAngle(radians(myDegrees), 30);
 *   let vx = v.x;
 *   let vy = v.y;
 *
 *   push();
 *   translate(width / 2, height / 2);
 *   noFill();
 *   stroke(150);
 *   line(0, 0, 30, 0);
 *   stroke(0);
 *   line(0, 0, vx, vy);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.Companion.fromAngle(angle: Double, length: Double? = null): p5.Vector =
    asDynamic().fromAngle(angle, length ?: undefined) as p5.Vector


/**
 * Make a new 3D vector from a pair of ISO spherical angles.
 *
 * @method fromAngles
 * @static
 * @param {Number}     theta    The polar angle, in radians (zero is up)
 * @param {Number}     phi      The azimuthal angle, in radians
 *                               (zero is out of the screen)
 * @param {Number}     [length] The length of the new vector (defaults to 1)
 * @return {p5.Vector}          A new <a href="#/p5.Vector">p5.Vector</a> object
 * @example
 * <div modernizr='webgl'>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   fill(255);
 *   noStroke();
 * }
 * function draw() {
 *   background(255);
 *
 *   let t = millis() / 1000;
 *
 *   // add three point lights
 *   pointLight(color('#f00'), p5.Vector.fromAngles(t * 1.0, t * 1.3, 100));
 *   pointLight(color('#0f0'), p5.Vector.fromAngles(t * 1.1, t * 1.2, 100));
 *   pointLight(color('#00f'), p5.Vector.fromAngles(t * 1.2, t * 1.1, 100));
 *
 *   sphere(35);
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.Companion.fromAngles(theta: Double, phi: Double, length: Double? = null) =
    asDynamic().fromAngles(theta, phi, length ?: undefined) as p5.Vector


/**
 * Make a new 2D unit vector from a random angle.
 *
 * @method random2D
 * @static
 * @return {p5.Vector} A new <a href="#/p5.Vector">p5.Vector</a> object
 * @example
 * <div class="norender">
 * <code>
 * let v = p5.Vector.random2D();
 * // May make v's attributes something like:
 * // [0.61554617, -0.51195765, 0.0] or
 * // [-0.4695841, -0.14366731, 0.0] or
 * // [0.6091097, -0.22805278, 0.0]
 * print(v);
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * function setup() {
 *   frameRate(1);
 * }
 *
 * function draw() {
 *   background(240);
 *
 *   let v0 = createVector(50, 50);
 *   let v1 = p5.Vector.random2D();
 *   drawArrow(v0, v1.mult(50), 'black');
 * }
 *
 * // draw an arrow for a vector at a given base position
 * function drawArrow(base, vec, myColor) {
 *   push();
 *   stroke(myColor);
 *   strokeWeight(3);
 *   fill(myColor);
 *   translate(base.x, base.y);
 *   line(0, 0, vec.x, vec.y);
 *   rotate(vec.heading());
 *   let arrowSize = 7;
 *   translate(vec.mag() - arrowSize, 0);
 *   triangle(0, arrowSize / 2, 0, -arrowSize / 2, arrowSize, 0);
 *   pop();
 * }
 * </code>
 * </div>
 */
inline fun p5.Vector.Companion.random2D(): p5.Vector = asDynamic().random2D() as p5.Vector


/**
 * Make a new random 3D unit vector.
 *
 * @method random3D
 * @static
 * @return {p5.Vector} A new <a href="#/p5.Vector">p5.Vector</a> object
 * @example
 * <div class="norender">
 * <code>
 * let v = p5.Vector.random3D();
 * // May make v's attributes something like:
 * // [0.61554617, -0.51195765, 0.599168] or
 * // [-0.4695841, -0.14366731, -0.8711202] or
 * // [0.6091097, -0.22805278, -0.7595902]
 * print(v);
 * </code>
 * </div>
 */
inline fun p5.Vector.Companion.random3D(): p5.Vector = asDynamic().random3D() as p5.Vector


/**
 * Adds two vectors together and returns a new one.
 *
 * @method add
 * @static
 * @param  {p5.Vector} v1 A <a href="#/p5.Vector">p5.Vector</a> to add
 * @param  {p5.Vector} v2 A <a href="#/p5.Vector">p5.Vector</a> to add
 * @param  {p5.Vector} [target] The vector to receive the result
 * @return {p5.Vector} The resulting <a href="#/p5.Vector">p5.Vector</a>
 */
inline fun p5.Vector.Companion.add(v1: p5.Vector, v2: p5.Vector, target: p5.Vector? = null): p5.Vector =
    asDynamic().add(v1, v2, target ?: undefined) as p5.Vector


/**
 * Returns a vector remainder when it is divided by another vector
 *
 * @method rem
 * @static
 * @param  {p5.Vector} v1
 * @param  {p5.Vector} v2
 * @return {p5.Vector} The resulting <a href="#/p5.Vector">p5.Vector</a>
 */
inline fun p5.Vector.Companion.rem(v1: p5.Vector, v2: p5.Vector): p5.Vector =
    asDynamic().rem(v1, v2) as p5.Vector


/**
 * Subtracts one <a href="#/p5.Vector">p5.Vector</a> from another and returns a new one.  The second
 * vector (`v2`) is subtracted from the first (`v1`), resulting in `v1-v2`.
 *
 * @method sub
 * @static
 * @param  {p5.Vector} v1 A <a href="#/p5.Vector">p5.Vector</a> to subtract from
 * @param  {p5.Vector} v2 A <a href="#/p5.Vector">p5.Vector</a> to subtract
 * @param  {p5.Vector} [target] The vector to receive the result
 * @return {p5.Vector} The resulting <a href="#/p5.Vector">p5.Vector</a>
 */
inline fun p5.Vector.Companion.sub(v1: p5.Vector, v2: p5.Vector, target: p5.Vector? = null): p5.Vector =
    asDynamic().sub(v1, v2, target ?: undefined) as p5.Vector


/**
 * Multiplies a vector by a scalar and returns a new vector.
 *
 * @method mult
 * @static
 * @param  {p5.Vector} [v]
 * @param  {Number}  [n]
 * @param  {p5.Vector} [target] the vector to receive the result
 */
inline fun p5.Vector.Companion.mult(v: p5.Vector, n: Double, target: p5.Vector? = null): p5.Vector =
    asDynamic().mult(v, n, target ?: undefined) as p5.Vector

inline fun p5.Vector.Companion.mult(v0: p5.Vector, v1: p5.Vector, target: p5.Vector? = null): p5.Vector =
    asDynamic().mult(v0, v1, target ?: undefined) as p5.Vector

inline fun p5.Vector.Companion.mult(v: p5.Vector, a: Array<Double>, target: p5.Vector? = null): p5.Vector =
    asDynamic().mult(v, a, target ?: undefined) as p5.Vector


/**
 * Rotates the vector (only 2D vectors) by the given angle; magnitude remains the same. Returns a new vector.
 *
 * @method rotate
 * @static
 * @param  {p5.Vector} [v]
 * @param  {Number} [angle]
 * @param  {p5.Vector} [target] The vector to receive the result
 */
inline fun p5.Vector.Companion.rotate(v: p5.Vector, angle: Double, target: p5.Vector? = null): p5.Vector =
    asDynamic().rotate(v, angle, target ?: undefined) as p5.Vector


/**
 * Divides a vector by a scalar and returns a new vector.
 *
 * @method div
 * @static
 * @param  {p5.Vector} [v]
 * @param  {Number}  [n]
 * @param  {p5.Vector} [target] The vector to receive the result
 */
inline fun p5.Vector.Companion.div(v: p5.Vector, n: Double, target: p5.Vector? = null): p5.Vector =
    asDynamic().div(v, n, target ?: undefined) as p5.Vector

inline fun p5.Vector.Companion.div(v0: p5.Vector, v1: p5.Vector, target: p5.Vector? = null): p5.Vector =
    asDynamic().div(v0, v1, target ?: undefined) as p5.Vector

inline fun p5.Vector.Companion.div(v: p5.Vector, a: Array<Double>, target: p5.Vector? = null): p5.Vector =
    asDynamic().div(v, a, target ?: undefined) as p5.Vector


/**
 * Calculates the dot product of two vectors.
 *
 * @method dot
 * @static
 * @param  {p5.Vector} v1 The first <a href="#/p5.Vector">p5.Vector</a>
 * @param  {p5.Vector} v2 The second <a href="#/p5.Vector">p5.Vector</a>
 * @return {Number}     The dot product
 */
inline fun p5.Vector.Companion.dot(v1: p5.Vector, v2: p5.Vector): p5.Vector =
    asDynamic().dot(v1, v2) as p5.Vector


/**
 * Calculates the cross product of two vectors.
 *
 * @method cross
 * @static
 * @param  {p5.Vector} v1 The first <a href="#/p5.Vector">p5.Vector</a>
 * @param  {p5.Vector} v2 The second <a href="#/p5.Vector">p5.Vector</a>
 * @return {Number}     The cross product
 */
inline fun p5.Vector.Companion.cross(v1: p5.Vector, v2: p5.Vector): p5.Vector =
    asDynamic().cross(v1, v2) as p5.Vector


/**
 * Calculates the Euclidean distance between two points (considering a
 * point as a vector object).
 *
 * @method dist
 * @static
 * @param  {p5.Vector} v1 The first <a href="#/p5.Vector">p5.Vector</a>
 * @param  {p5.Vector} v2 The second <a href="#/p5.Vector">p5.Vector</a>
 * @return {Number}     The distance
 */
inline fun p5.Vector.Companion.dist(v1: p5.Vector, v2: p5.Vector): Double =
    asDynamic().dist(v1, v2) as Double


/**
 * Linear interpolate a vector to another vector and return the result as a
 * new vector.
 *
 * @method lerp
 * @static
 * @param {p5.Vector} v1
 * @param {p5.Vector} v2
 * @param {Number} amt
 * @param {p5.Vector} [target] The vector to receive the result
 * @return {p5.Vector} The lerped value
 */
inline fun p5.Vector.Companion.lerp(v1: p5.Vector, v2: p5.Vector, amt: Double, target: p5.Vector? = null): p5.Vector =
    asDynamic().lerp(v1, v2, amt, target ?: undefined) as p5.Vector


/**
 * Calculates the magnitude (length) of the vector and returns the result as
 * a float (this is simply the equation `sqrt(x*x + y*y + z*z)`.)
 *
 * @method mag
 * @static
 * @param {p5.Vector} [vecT] The vector to return the magnitude of
 * @return {Number} The magnitude of vecT
 */
inline fun p5.Vector.Companion.mag(vecT: p5.Vector): Double = asDynamic().mag(vecT) as Double


/**
 * Normalize the vector to length 1 (make it a unit vector).
 *
 * @method normalize
 * @static
 * @param {p5.Vector} v  The vector to normalize
 * @param {p5.Vector} [target] The vector to receive the result
 * @return {p5.Vector}   The vector v, normalized to a length of 1
 */
inline fun p5.Vector.Companion.normalize(v: p5.Vector, target: p5.Vector? = null) =
    asDynamic().normalize(v, target ?: undefined) as p5.Vector

