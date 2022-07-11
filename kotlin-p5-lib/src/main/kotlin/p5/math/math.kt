@file:Suppress("unused")

package p5.math

import p5.core.p5

/**
 * Creates a new <a href="#/p5.Vector">p5.Vector</a> (the datatype for storing vectors). This provides a
 * two or three-dimensional vector, specifically a Euclidean (also known as
 * geometric) vector. A vector is an entity that has both magnitude and
 * direction.
 *
 * @method createVector
 * @param {Number} [x] x component of the vector
 * @param {Number} [y] y component of the vector
 * @param {Number} [z] z component of the vector
 * @return {p5.Vector}
 * @example
 * <div><code>
 * let v1;
 * function setup() {
 *   createCanvas(100, 100);
 *   stroke(255, 0, 255);
 *   v1 = createVector(width / 2, height / 2);
 * }
 *
 * function draw() {
 *   background(255);
 *   line(v1.x, v1.y, mouseX, mouseY);
 *   describe(`draws a line from center of canvas to mouse pointer position.`);
 * }
 * </code></div>
 */
inline fun p5.createVector(x: Double, y: Double, z: Double): p5.Vector = asDynamic().createVector(x, y, z) as p5.Vector

inline fun p5.createVector(x: Double, y: Double): p5.Vector = asDynamic().createVector(x, y) as p5.Vector
