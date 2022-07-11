/**
 * @file This module defines the p5 methods for working with local storage
 */

@file:Suppress("unused")

package p5.data

import p5.core.p5


/**
 *
 * Stores a value in local storage under the key name.
 * Local storage is saved in the browser and persists
 * between browsing sessions and page reloads.
 * The key can be the name of the variable but doesn't
 * have to be. To retrieve stored items
 * see <a href="#/p5/getItem">getItem</a>.
 *
 * Sensitive data such as passwords or personal information
 * should not be stored in local storage.
 *
 * @method storeItem
 * @for p5
 * @param {String} key
 * @param {String|Number|Object|Boolean|p5.Color|p5.Vector} value
 *
 * @example
 * <div><code>
 * // Type to change the letter in the
 * // center of the canvas.
 * // If you reload the page, it will
 * // still display the last key you entered
 *
 * let myText;
 *
 * function setup() {
 *   createCanvas(100, 100);
 *   myText = getItem('myText');
 *   if (myText === null) {
 *     myText = '';
 *   }
 *   describe(`When you type the key name is displayed as black text on white background.
 *   If you reload the page, the last letter typed is still displaying.`);
 * }
 *
 * function draw() {
 *   textSize(40);
 *   background(255);
 *   text(myText, width / 2, height / 2);
 * }
 *
 * function keyPressed() {
 *   myText = key;
 *   storeItem('myText', myText);
 * }
 * </code></div>
 */
inline fun p5.storeItem(key: String, value: String) { asDynamic().storeItem(key, value) }

inline fun p5.storeDouble(key: String, value: Double) { asDynamic().storeItem(key, value) }

inline fun p5.storeFloat(key: String, value: Float) { asDynamic().storeItem(key, value) }

inline fun p5.storeInt(key: String, value: Int) { asDynamic().storeItem(key, value) }

inline fun p5.storeLong(key: String, value: Long) { asDynamic().storeItem(key, value) }

inline fun p5.storeBoolean(key: String, value: Boolean) { asDynamic().storeItem(key, value) }

inline fun p5.storeJsObject(key: String, value: dynamic) { asDynamic().storeItem(key, value) }

inline fun p5.storeP5Color(key: String, value: p5.Color) { asDynamic().storeItem(key, value) }

inline fun p5.storeP5vector(key: String, value: p5.Vector) { asDynamic().storeItem(key, value) }


/**
 *
 * Returns the value of an item that was stored in local storage
 * using storeItem()
 *
 * @method getItem
 * @for p5
 * @param {String} key name that you wish to use to store in local storage
 * @return {Number|Object|String|Boolean|p5.Color|p5.Vector} Value of stored item
 *
 * @example
 * <div><code>
 * // Click the mouse to change
 * // the color of the background
 * // Once you have changed the color
 * // it will stay changed even when you
 * // reload the page.
 *
 * let myColor;
 *
 * function setup() {
 *   createCanvas(100, 100);
 *   myColor = getItem('myColor');
 * }
 *
 * function draw() {
 *   if (myColor !== null) {
 *     background(myColor);
 *   }
 *   describe(`If you click, the canvas changes to a random color.·
 *     If you reload the page, the canvas is still the color it was when the
 *     page was previously loaded.`);
 * }
 *
 * function mousePressed() {
 *   myColor = color(random(255), random(255), random(255));
 *   storeItem('myColor', myColor);
 * }
 * </code></div>
 */
inline fun p5.getItem(key: String): String? = asDynamic().getItem(key) as String?

inline fun p5.getDouble(key: String): Double? = asDynamic().getItem(key) as Double?

inline fun p5.getFloat(key: String): Float? = asDynamic().getItem(key) as Float?

inline fun p5.getInt(key: String): Int? = asDynamic().getItem(key) as Int?

inline fun p5.getLong(key: String): Long? = asDynamic().getItem(key) as Long?

inline fun p5.getBoolean(key: String): Boolean? = asDynamic().getItem(key) as Boolean?

inline fun p5.getJsObject(key: String): dynamic = asDynamic().getItem(key)

inline fun p5.getP5Color(key: String): p5.Color? = asDynamic().getItem(key) as p5.Color?

inline fun p5.getP5Vector(key: String): p5.Vector? = asDynamic().getItem(key) as p5.Vector?


/**
 *
 * Clears all local storage items set with storeItem()
 * for the current domain.
 *
 * @method clearStorage
 * @for p5
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myNum = 10;
 *   let myBool = false;
 *   storeItem('myNum', myNum);
 *   storeItem('myBool', myBool);
 *   print(getItem('myNum')); // logs 10 to the console
 *   print(getItem('myBool')); // logs false to the console
 *   clearStorage();
 *   print(getItem('myNum')); // logs null to the console
 *   print(getItem('myBool')); // logs null to the console
 * }
 * </code></div>
 */
inline fun p5.clearStorage() { asDynamic().clearStorage() }


/**
 *
 * Removes an item that was stored with storeItem()
 *
 * @method removeItem
 * @param {String} key
 * @for p5
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myVar = 10;
 *   storeItem('myVar', myVar);
 *   print(getItem('myVar')); // logs 10 to the console
 *   removeItem('myVar');
 *   print(getItem('myVar')); // logs null to the console
 * }
 * </code></div>
 */
inline fun p5.removeItem(key: String) { asDynamic().removeItem(key) }
