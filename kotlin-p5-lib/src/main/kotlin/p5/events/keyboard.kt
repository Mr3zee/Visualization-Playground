@file:Suppress("unused")

package p5.events

import p5.core.p5


/**
 * The boolean system variable <a href="#/p5/keyIsPressed">keyIsPressed</a> is true if any key is pressed
 * and false if no keys are pressed.
 *
 * @property {Boolean} keyIsPressed
 * @readOnly
 * @example
 * <div>
 * <code>
 * function draw() {
 *   if (keyIsPressed === true) {
 *     fill(0);
 *   } else {
 *     fill(255);
 *   }
 *   rect(25, 25, 50, 50);
 *   describe('50-by-50 white rect that turns black on keypress.');
 * }
 * </code>
 * </div>
 */
inline val p5.isKeyPressed: Boolean get() = asDynamic().isKeyPressed as Boolean

inline val p5.keyIsPressed: Boolean get() = asDynamic().keyIsPressed as Boolean


/**
 * The system variable key always contains the value of the most recent
 * key on the keyboard that was typed. To get the proper capitalization, it
 * is best to use it within <a href="#/p5/keyTyped">keyTyped()</a>. For non-ASCII keys, use the <a href="#/p5/keyCode">keyCode</a>
 * variable.
 *
 * @property {String} key
 * @readOnly
 * @example
 * <div><code>
 * // Click any key to display it!
 * // (Not Guaranteed to be Case Sensitive)
 * function setup() {
 *   fill(245, 123, 158);
 *   textSize(50);
 * }
 *
 * function draw() {
 *   background(200);
 *   text(key, 33, 65); // Display last key pressed.
 *   describe('canvas displays any key value that is pressed in pink font.');
 * }
 * </code></div>
 */
inline val p5.key: String get() = asDynamic().key as String


/**
 * The variable keyCode is used to detect special keys such as BACKSPACE,
 * DELETE, ENTER, RETURN, TAB, ESCAPE, SHIFT, CONTROL, OPTION, ALT, UP_ARROW,
 * DOWN_ARROW, LEFT_ARROW, RIGHT_ARROW.
 * You can also check for custom keys by looking up the keyCode of any key
 * on a site like this: <a href="http://keycode.info/">keycode.info</a>.
 *
 * @property {Integer} keyCode
 * @readOnly
 * @example
 * <div><code>
 * let fillVal = 126;
 * function draw() {
 *   fill(fillVal);
 *   rect(25, 25, 50, 50);
 *   describe(`Grey rect center. turns white when up arrow pressed and black when down.
 *     Display key pressed and its keyCode in a yellow box.`);
 * }
 *
 * function keyPressed() {
 *   if (keyCode === UP_ARROW) {
 *     fillVal = 255;
 *   } else if (keyCode === DOWN_ARROW) {
 *     fillVal = 0;
 *   }
 * }
 * </code></div>
 * <div><code>
 * function draw() {}
 * function keyPressed() {
 *   background('yellow');
 *   text(`${key} ${keyCode}`, 10, 40);
 *   print(key, ' ', keyCode);
 * }
 * </code></div>
 */
inline val p5.keyCode: Int get() = asDynamic().keyCode as Int


/**
 * The <a href="#/p5/keyIsDown">keyIsDown()</a> function checks if the key is currently down, i.e. pressed.
 * It can be used if you have an object that moves, and you want several keys
 * to be able to affect its behaviour simultaneously, such as moving a
 * sprite diagonally. You can put in any number representing the keyCode of
 * the key, or use any of the variable <a href="#/p5/keyCode">keyCode</a> names listed
 * <a href="http://p5js.org/reference/#p5/keyCode">here</a>.
 *
 * @method keyIsDown
 * @param {Number} [code] The key to check for.
 * @return {Boolean} whether key is down or not
 * @example
 * <div><code>
 * let x = 100;
 * let y = 100;
 *
 * function setup() {
 *   createCanvas(512, 512);
 *   fill(255, 0, 0);
 * }
 *
 * function draw() {
 *   if (keyIsDown(LEFT_ARROW)) {
 *     x -= 5;
 *   }
 *
 *   if (keyIsDown(RIGHT_ARROW)) {
 *     x += 5;
 *   }
 *
 *   if (keyIsDown(UP_ARROW)) {
 *     y -= 5;
 *   }
 *
 *   if (keyIsDown(DOWN_ARROW)) {
 *     y += 5;
 *   }
 *
 *   clear();
 *   ellipse(x, y, 50, 50);
 *   describe(`50-by-50 red ellipse moves left, right, up, and
 *     down with arrow presses.`);
 * }
 * </code></div>
 *
 * <div><code>
 * let diameter = 50;
 *
 * function setup() {
 *   createCanvas(512, 512);
 * }
 *
 * function draw() {
 *   // 107 and 187 are keyCodes for "+"
 *   if (keyIsDown(107) || keyIsDown(187)) {
 *     diameter += 1;
 *   }
 *
 *   // 109 and 189 are keyCodes for "-"
 *   if (keyIsDown(109) || keyIsDown(189)) {
 *     diameter -= 1;
 *   }
 *
 *   clear();
 *   fill(255, 0, 0);
 *   ellipse(50, 50, diameter, diameter);
 *   describe(`50-by-50 red ellipse gets bigger or smaller when
 *     + or - are pressed.`);
 * }
 * </code></div>
 */
inline fun p5.keyIsDown(code: Int): Boolean = asDynamic().keyIsDown(code) as Boolean
