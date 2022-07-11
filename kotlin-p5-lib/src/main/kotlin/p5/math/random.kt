@file:Suppress("unused")

package p5.math

import p5.core.p5


/**
 * Sets the seed value for <a href="#/p5/random">random()</a>.
 *
 * By default, <a href="#/p5/random">random()</a> produces different results each time the program
 * is run. Set the seed parameter to a constant to return the same
 * pseudo-random numbers each time the software is run.
 *
 * @method randomSeed
 * @param {Number} seed   the seed value
 * @example
 * <div>
 * <code>
 * randomSeed(99);
 * for (let i = 0; i < 100; i++) {
 *   let r = random(0, 255);
 *   stroke(r);
 *   line(i, 0, i, 100);
 * }
 * describe(`many vertical lines drawn in white, black, or grey.`);
 * </code>
 * </div>
 */
inline fun p5.randomSeed(seed: Double) { asDynamic().randomSeed(seed) }

inline fun p5.randomSeed(seed: Float) { asDynamic().randomSeed(seed) }

inline fun p5.randomSeed(seed: Int) { asDynamic().randomSeed(seed) }

inline fun p5.randomSeed(seed: Long) { asDynamic().randomSeed(seed) }


/**
 * Return a random floating-point number.
 *
 * Takes either 0, 1 or 2 arguments.
 *
 * If no argument is given, returns a random number from 0
 * up to (but not including) 1.
 *
 * If one argument is given, and it is a number, returns a random number from 0
 * up to (but not including) the number.
 *
 * If one argument is given, and it is an array, returns a random element from
 * that array.
 *
 * If two arguments are given, returns a random number from the
 * first argument up to (but not including) the second argument.
 *
 * @method random
 * @param  {Number} [min]   the lower bound (inclusive)
 * @param  {Number} [max]   the upper bound (exclusive)
 * @return {Number} the random number
 * @example
 * <div>
 * <code>
 * for (let i = 0; i < 100; i++) {
 *   let r = random(50);
 *   stroke(r * 5);
 *   line(50, i, 50 + r, i);
 * }
 * describe(`100 horizontal lines from center canvas to right.
 *   The size and fill change each time.`);
 * </code>
 * </div>
 * <div>
 * <code>
 * for (let i = 0; i < 100; i++) {
 *   let r = random(-50, 50);
 *   line(50, i, 50 + r, i);
 * }
 * describe(`100 horizontal lines from center of canvas.
 *   The height & side change each render.`);
 * </code>
 * </div>
 * <div>
 * <code>
 * // Get a random element from an array using the random(Array) syntax
 * let words = ['apple', 'bear', 'cat', 'dog'];
 * let word = random(words); // select random word
 * text(word, 10, 50); // draw the word
 * describe(`word displayed at random. Either apple, bear, cat, or dog.`);
 * </code>
 * </div>
 */
inline fun p5.random(min: Double, max: Double): Double = asDynamic().random(min, max) as Double

inline fun p5.random(max: Double): Double = asDynamic().random(max) as Double

inline fun p5.random(arr: Array<Double>): Double = asDynamic().random(arr) as Double

inline fun p5.random(min: Float, max: Float): Float = asDynamic().random(min, max) as Float

inline fun p5.random(max: Float): Float = asDynamic().random(max) as Float

inline fun p5.random(arr: Array<Float>): Float = asDynamic().random(arr) as Float

inline fun p5.random(min: Int, max: Int): Double = asDynamic().random(min, max) as Double

inline fun p5.random(max: Int): Double = asDynamic().random(max) as Double

inline fun p5.random(arr: Array<Int>): Int = asDynamic().random(arr) as Int

inline fun p5.random(min: Long, max: Long): Double = asDynamic().random(min, max) as Double

inline fun p5.random(max: Long): Double = asDynamic().random(max) as Double

inline fun p5.random(arr: Array<Long>): Long = asDynamic().random(arr) as Long

inline fun p5.random(): Double = asDynamic().random() as Double


/**
 * Returns a random number fitting a Gaussian, or
 * normal, distribution. There is theoretically no minimum or maximum
 * value that <a href="#/p5/randomGaussian">randomGaussian()</a> might return. Rather, there is
 * just a very low probability that values far from the mean will be
 * returned; and a higher probability that numbers near the mean will
 * be returned.
 *
 * Takes either 0, 1 or 2 arguments.<br>
 * If no args, the mean is 0 and the standard deviation is 1.<br>
 * If one arg, that arg is the mean and the standard deviation is 1.<br>
 * If two args, the first arg is the mean and the second is the standard deviation.
 *
 * @method randomGaussian
 * @param  {Number} [mean]  the mean
 * @param  {Number} [sd]    the standard deviation
 * @return {Number} the random number
 * @example
 * <div>
 * <code>
 * for (let y = 0; y < 100; y++) {
 *   let x = randomGaussian(50, 15);
 *   line(50, y, x, y);
 * }
 * describe(`100 horizontal lines from center of canvas.
 *   The height & side change each render.`);
 * </code>
 * </div>
 * <div>
 * <code>
 * let distribution = new Array(360);
 *
 * function setup() {
 *   createCanvas(100, 100);
 *   for (let i = 0; i < distribution.length; i++) {
 *     distribution[i] = floor(randomGaussian(0, 15));
 *   }
 * }
 *
 * function draw() {
 *   background(204);
 *
 *   translate(width / 2, width / 2);
 *
 *   for (let i = 0; i < distribution.length; i++) {
 *     rotate(TWO_PI / distribution.length);
 *     stroke(0);
 *     let dist = abs(distribution[i]);
 *     line(0, 0, dist, 0);
 *   }
 *
 *   describe(`black lines radiate from center of canvas.
 *     The size changes each render.`);
 * }
 * </code>
 * </div>
 */
inline fun p5.randomGaussian(mean: Double? = undefined, sd: Double? = undefined): Double =
    asDynamic().randomGaussian(mean, sd) as Double

inline fun p5.randomGaussian(mean: Float? = undefined, sd: Float? = undefined): Double =
    asDynamic().randomGaussian(mean, sd) as Double

inline fun p5.randomGaussian(mean: Int? = undefined, sd: Int? = undefined): Double =
    asDynamic().randomGaussian(mean, sd) as Double

inline fun p5.randomGaussian(mean: Long? = undefined, sd: Long? = undefined): Double =
    asDynamic().randomGaussian(mean, sd) as Double
