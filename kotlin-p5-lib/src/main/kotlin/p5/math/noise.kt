/**
 * @file  http://mrl.nyu.edu/~perlin/noise/
 * Adapting from PApplet.java
 * which was adapted from toxi
 * which was adapted from the german demo group farbrausch
 * as used in their demo "art": http://www.farb-rausch.de/fr010src.zip
 *
 * someday we might consider using "improved noise"
 * http://mrl.nyu.edu/~perlin/paper445.pdf
 * See: https://github.com/shiffman/The-Nature-of-Code-Examples-p5.js/blob/main/introduction/Noise1D/noise.js
 */

@file:Suppress("unused")

package p5.math

import p5.core.p5


/**
 * Returns the Perlin noise value at specified coordinates. Perlin noise is
 * a random sequence generator producing a more naturally ordered, harmonic
 * succession of numbers compared to the standard <a href="#/p5/random">random()</a> function.
 * It was invented by Ken Perlin in the 1980s and been used since in
 * graphical applications to produce procedural textures, natural motion,
 * shapes, terrains etc.<br /><br /> The main difference to the
 * <a href="#/p5/random">random()</a> function is that Perlin noise is defined in an infinite
 * n-dimensional space where each pair of coordinates corresponds to a
 * fixed semi-random value (fixed only for the lifespan of the program; see
 * the <a href="#/p5/noiseSeed">noiseSeed()</a> function). p5.js can compute 1D, 2D and 3D noise,
 * depending on the number of coordinates given. The resulting value will
 * always be between 0.0 and 1.0. The noise value can be animated by moving
 * through the noise space as demonstrated in the example above. The 2nd
 * and 3rd dimensions can also be interpreted as time.<br /><br />The actual
 * noise is structured similar to an audio signal, in respect to the
 * function's use of frequencies. Similar to the concept of harmonics in
 * physics, Perlin noise is computed over several octaves which are added
 * together for the final result. <br /><br />Another way to adjust the
 * character of the resulting sequence is the scale of the input
 * coordinates. As the function works within an infinite space the value of
 * the coordinates doesn't matter as such, only the distance between
 * successive coordinates does (e.g. when using <a href="#/p5/noise">noise()</a> within a
 * loop). As a general rule the smaller the difference between coordinates,
 * the smoother the resulting noise sequence will be. Steps of 0.005-0.03
 * work best for most applications, but this will differ depending on use.
 *
 * @method noise
 * @param  {Number} [x] x-coordinate in noise space
 * @param  {Number} [y] y-coordinate in noise space
 * @param  {Number} [z] z-coordinate in noise space
 * @return {Number}     Perlin noise value (between 0 and 1) at specified
 *                      coordinates
 * @example
 * <div>
 * <code>
 * let xoff = 0.0;
 *
 * function draw() {
 *   background(204);
 *   xoff = xoff + 0.01;
 *   let n = noise(xoff) * width;
 *   line(n, 0, n, height);
 *   describe(`vertical line moves left to right with updating
 *     noise values.`);
 * }
 * </code>
 * </div>
 * <div>
 * <code>let noiseScale=0.02;
 *
 * function draw() {
 *   background(0);
 *   for (let x=0; x < width; x++) {
 *     let noiseVal = noise((mouseX+x)*noiseScale, mouseY*noiseScale);
 *     stroke(noiseVal*255);
 *     line(x, mouseY+noiseVal*80, x, height);
 *   }
 *   describe(`horizontal wave pattern effected by mouse x-position
 *     & updating noise values.`);
 * }
 * </code>
 * </div>
 */
inline fun p5.noise(x: Double, y: Double? = undefined, z: Double? = undefined): Double = asDynamic().noise(x, y, z) as Double


/**
 * Adjusts the character and level of detail produced by the Perlin noise
 * function. Similar to harmonics in physics, noise is computed over
 * several octaves. Lower octaves contribute more to the output signal and
 * as such define the overall intensity of the noise, whereas higher octaves
 * create finer-grained details in the noise sequence.
 *
 * By default, noise is computed over 4 octaves with each octave contributing
 * exactly half as much as its predecessor, starting at 50% strength for the 1st
 * octave. This falloff amount can be changed by adding a function
 * parameter. E.g. a falloff factor of 0.75 means each octave will now have
 * 75% impact (25% less) of the previous lower octave. Any value between
 * 0.0 and 1.0 is valid, however, note that values greater than 0.5 might
 * result in greater than 1.0 values returned by <a href="#/p5/noise">noise()</a>.
 *
 * By changing these parameters, the signal created by the <a href="#/p5/noise">noise()</a>
 * function can be adapted to fit very specific needs and characteristics.
 *
 * @method noiseDetail
 * @param {Number} [lod] number of octaves to be used by the noise
 * @param {Number} [falloff] falloff factor for each octave
 * @example
 * <div>
 * <code>
 * let noiseVal;
 * let noiseScale = 0.02;
 *
 * function setup() {
 *   createCanvas(100, 100);
 * }
 *
 * function draw() {
 *   background(0);
 *   for (let y = 0; y < height; y++) {
 *     for (let x = 0; x < width / 2; x++) {
 *       noiseDetail(2, 0.2);
 *       noiseVal = noise((mouseX + x) * noiseScale, (mouseY + y) * noiseScale);
 *       stroke(noiseVal * 255);
 *       point(x, y);
 *       noiseDetail(8, 0.65);
 *       noiseVal = noise(
 *         (mouseX + x + width / 2) * noiseScale,
 *         (mouseY + y) * noiseScale
 *       );
 *       stroke(noiseVal * 255);
 *       point(x + width / 2, y);
 *     }
 *   }
 *   describe(`2 vertical grey smokey patterns affected by
 *     mouse x-position and noise.`);
 * }
 * </code>
 * </div>
 */
inline fun p5.noiseDetail(lod: Int, falloff: Double) { asDynamic().noiseDetail(lod, falloff) }

inline fun p5.noiseDetail(lod: Int, falloff: Float) { asDynamic().noiseDetail(lod, falloff) }

inline fun p5.noiseDetail(lod: Int, falloff: Int) { asDynamic().noiseDetail(lod, falloff) }

inline fun p5.noiseDetail(lod: Int, falloff: Long) { asDynamic().noiseDetail(lod, falloff) }


/**
 * Sets the seed value for <a href="#/p5/noise">noise()</a>. By default,
 * <a href="#/p5/noise">noise()</a> produces different results each time
 * the program is run. Set the `seed` parameter to a constant to return
 * the same pseudo-random numbers each time the software is run.
 *
 * @method noiseSeed
 * @param {Number} [seed] the seed value
 * @example
 * <div>
 * <code>let xoff = 0.0;
 *
 * function setup() {
 *   noiseSeed(99);
 *   stroke(0, 10);
 * }
 *
 * function draw() {
 *   xoff = xoff + .01;
 *   let n = noise(xoff) * width;
 *   line(n, 0, n, height);
 *   describe(`vertical grey lines drawing in pattern affected by noise.`);
 * }
 * </code>
 * </div>
 */
inline fun p5.noiseSeed(seed: Double) { asDynamic().noiseSeed(seed) }

inline fun p5.noiseSeed(seed: Float) { asDynamic().noiseSeed(seed) }

inline fun p5.noiseSeed(seed: Int) { asDynamic().noiseSeed(seed) }

inline fun p5.noiseSeed(seed: Long) { asDynamic().noiseSeed(seed) }
