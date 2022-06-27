@file:Suppress("unused")

package p5.color

import p5.core.p5

/**
 * This method returns the color formatted as a string. This can be useful
 * for debugging, or for using p5.js with other libraries.
 *
 * @method toString
 * @param {String} [format] How the color string will be formatted.
 * Leaving this empty formats the string as rgba(r, g, b, a).
 * '#rgb' '#rgba' '#rrggbb' and '#rrggbbaa' format as hexadecimal color codes.
 * 'rgb' 'hsb' and 'hsl' return the color formatted in the specified color mode.
 * 'rgba' 'hsba' and 'hsla' are the same as above but with alpha channels.
 * 'rgb%' 'hsb%' 'hsl%' 'rgba%' 'hsba%' and 'hsla%' format as percentages.
 * @return {String} the formatted string
 *
 * @example
 * <div>
 * <code>
 * createCanvas(200, 100);
 * let myColor;
 * stroke(255);
 * myColor = color(100, 100, 250);
 * fill(myColor);
 * rotate(HALF_PI);
 * text(myColor.toString(), 0, -5);
 * text(myColor.toString('#rrggbb'), 0, -30);
 * text(myColor.toString('rgba%'), 0, -55);
 * describe('A canvas with 3 text representation of their color.');
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let myColor = color(100, 130, 250);
 * text(myColor.toString('#rrggbb'), 25, 25);
 * </code>
 * </div>
 */
inline fun p5.Color.toString(format: String): String = asDynamic().toString(format) as String

/**
 * The setRed method sets the red component of a color.
 * The range depends on your color mode, in the default RGB mode it's between 0 and 255.
 * @method setRed
 * @param {Number} red the new red value
 * @example
 * <div>
 * <code>
 * let backgroundColor;
 *
 * function setup() {
 *   backgroundColor = color(100, 50, 150);
 * }
 *
 * function draw() {
 *   backgroundColor.setRed(128 + 128 * sin(millis() / 1000));
 *   background(backgroundColor);
 *   describe('canvas with gradually changing background color');
 * }
 * </code>
 * </div>
 */
inline fun p5.Color.setRed(new_red: Int) { asDynamic().setRed(new_red) }

/**
 * The setGreen method sets the green component of a color.
 * The range depends on your color mode, in the default RGB mode it's between 0 and 255.
 * @method setGreen
 * @param {Number} green the new green value
 * @example
 * <div>
 * <code>
 * let backgroundColor = color(100, 50, 150);
 * function draw() {
 *   backgroundColor.setGreen(128 + 128 * sin(millis() / 1000));
 *   background(backgroundColor);
 *   describe('canvas with gradually changing background color');
 * }
 * </code>
 * </div>
 *
 **/
inline fun p5.Color.setGreen(new_green: Int) { asDynamic().setGreen(new_green) }


/**
 * The setBlue method sets the blue component of a color.
 * The range depends on your color mode, in the default RGB mode it's between 0 and 255.
 * @method setBlue
 * @param {Number} blue the new blue value
 * @example
 * <div>
 * <code>
 * let backgroundColor = color(100, 50, 150);
 * function draw() {
 *   backgroundColor.setBlue(128 + 128 * sin(millis() / 1000));
 *   background(backgroundColor);
 *   describe('canvas with gradually changing background color');
 * }
 * </code>
 * </div>
 *
 **/
inline fun p5.Color.setBlue(new_blue: Int) { asDynamic().setBlue(new_blue) }


/**
 * The setAlpha method sets the transparency (alpha) value of a color.
 * The range depends on your color mode, in the default RGB mode it's between 0 and 255.
 * @method setAlpha
 * @param {Number} alpha the new alpha value
 * @example
 * <div>
 * <code>
 * function draw() {
 *   clear();
 *   background(200);
 *   squareColor = color(100, 50, 100);
 *   squareColor.setAlpha(128 + 128 * sin(millis() / 1000));
 *   fill(squareColor);
 *   rect(13, 13, width - 26, height - 26);
 *   describe('a square with gradually changing opacity on a gray background');
 * }
 * </code>
 * </div>
 **/
inline fun p5.Color.setAlpha(new_alpha: Int) { asDynamic().setAlpha(new_alpha) }
