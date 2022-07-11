/**
 * @file This module defines the p5 methods for the p5 Dictionary classes.
 * The classes StringDict and NumberDict are for storing and working
 * with key-value pairs.
 */

@file:Suppress("unused")

package p5.data

import p5.core.p5


/**
 *
 * Creates a new instance of p5.StringDict using the key-value pair
 * or the object you provide.
 *
 * @method createStringDict
 * @for p5
 * @param {String} [key]
 * @param {String} [value]
 * @return {p5.StringDict}
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createStringDict('p5', 'js');
 *   print(myDictionary.hasKey('p5')); // logs true to console
 *
 *   let anotherDictionary = createStringDict({ happy: 'coding' });
 *   print(anotherDictionary.hasKey('happy')); // logs true to console
 * }
 * </code></div>
 */
inline fun p5.createStringDict(key: String, value: String): p5.NumberDict =
    asDynamic().createStringDict(key, value) as p5.NumberDict

inline fun p5.createStringDict(dict: dynamic): p5.NumberDict =
    asDynamic().createStringDict(dict) as p5.NumberDict


/**
 *
 * Creates a new instance of <a href="#/p5.NumberDict">p5.NumberDict</a> using the key-value pair
 * or object you provide.
 *
 * @method createNumberDict
 * @for p5
 * @param {Number} [key]
 * @param {Number} [value]
 * @return {p5.NumberDict}
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict(100, 42);
 *   print(myDictionary.hasKey(100)); // logs true to console
 *
 *   let anotherDictionary = createNumberDict({ 200: 84 });
 *   print(anotherDictionary.hasKey(200)); // logs true to console
 * }
 * </code></div>
 */
inline fun p5.createNumberDict(key: Number, value: Number): p5.NumberDict =
    asDynamic().createNumberDict(key, value) as p5.NumberDict

inline fun p5.createNumberDict(dict: dynamic): p5.NumberDict =
    asDynamic().createNumberDict(dict) as p5.NumberDict


/**
 * Returns the number of key-value pairs currently stored in the Dictionary.
 *
 * @method size
 * @return {Integer} the number of key-value pairs in the Dictionary
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict(1, 10);
 *   myDictionary.create(2, 20);
 *   myDictionary.create(3, 30);
 *   print(myDictionary.size()); // logs 3 to the console
 * }
 * </code></div>
 */
inline fun <T> p5.TypedDict<T>.size(): Int = asDynamic().size() as Int


/**
 * Returns true if the given key exists in the Dictionary,
 * otherwise returns false.
 *
 * @method hasKey
 * @param {Number|String} [key] key that you want to look up
 * @return {Boolean} whether that key exists in Dictionary
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createStringDict('p5', 'js');
 *   print(myDictionary.hasKey('p5')); // logs true to console
 * }
 * </code></div>
 */
inline fun <T> p5.TypedDict<T>.hasKey(key: T): Boolean = asDynamic().hasKey(key) as Boolean


/**
 * Returns the value stored at the given key.
 *
 * @method get
 * @param {Number|String} [key] the key you want to access
 * @return {Number|String} the value stored at that key
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createStringDict('p5', 'js');
 *   let myValue = myDictionary.get('p5');
 *   print(myValue === 'js'); // logs true to console
 * }
 * </code></div>
 */
inline fun <T> p5.TypedDict<T>.get(key: T): T = asDynamic().get(key) as T


/**
 * Updates the value associated with the given key in case it already exists
 * in the Dictionary. Otherwise, a new key-value pair is added.
 *
 * @method set
 * @param {Number|String} [key]
 * @param {Number|String} [value]
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createStringDict('p5', 'js');
 *   myDictionary.set('p5', 'JS');
 *   myDictionary.print(); // logs "key: p5 - value: JS" to console
 * }
 * </code></div>
 */
inline fun <T> p5.TypedDict<T>.set(key: T, value: T) { asDynamic().set(key, value) }


/**
 * Creates a new key-value pair in the Dictionary.
 *
 * @method create
 * @param {Number|String} [key]
 * @param {Number|String} [value]
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createStringDict('p5', 'js');
 *   myDictionary.create('happy', 'coding');
 *   myDictionary.print();
 *   // above logs "key: p5 - value: js, key: happy - value: coding" to console
 * }
 * </code></div>
 */
inline fun <T> p5.TypedDict<T>.create(key: T, value: T) { asDynamic().create(key, value) }


/**
 * Removes all previously stored key-value pairs from the Dictionary.
 *
 * @method clear
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createStringDict('p5', 'js');
 *   print(myDictionary.hasKey('p5')); // prints 'true'
 *   myDictionary.clear();
 *   print(myDictionary.hasKey('p5')); // prints 'false'
 * }
 * </code>
 * </div>
 */
inline fun <T> p5.TypedDict<T>.clear() { asDynamic().clear() }


/**
 * Removes the key-value pair stored at the given key from the Dictionary.
 *
 * @method remove
 * @param {Number|String} [key] key for the pair to remove
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createStringDict('p5', 'js');
 *   myDictionary.create('happy', 'coding');
 *   myDictionary.print();
 *   // above logs "key: p5 - value: js, key: happy - value: coding" to console
 *   myDictionary.remove('p5');
 *   myDictionary.print();
 *   // above logs "key: happy value: coding" to console
 * }
 * </code></div>
 */
inline fun <T> p5.TypedDict<T>.remove(key: T) { asDynamic().remove(key) }


/**
 * Logs the set of items currently stored in the Dictionary to the console.
 *
 * @method print
 *
 * @example
 * <div class="norender">
 * <code>
 * function setup() {
 *   let myDictionary = createStringDict('p5', 'js');
 *   myDictionary.create('happy', 'coding');
 *   myDictionary.print();
 *   // above logs "key: p5 - value: js, key: happy - value: coding" to console
 * }
 * </code>
 * </div>
 */
inline fun <T> p5.TypedDict<T>.print() { asDynamic().print() }


/**
 * Converts the Dictionary into a CSV file for local download.
 *
 * @method saveTable
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100);
 *   background(200);
 *   text('click here to save', 10, 10, 70, 80);
 * }
 *
 * function mousePressed() {
 *   if (mouseX > 0 && mouseX < width && mouseY > 0 && mouseY < height) {
 *     createStringDict({
 *       john: 1940,
 *       paul: 1942,
 *       george: 1943,
 *       ringo: 1940
 *     }).saveTable('beatles');
 *   }
 * }
 * </code>
 * </div>
 */
inline fun <T> p5.TypedDict<T>.saveTable(filename: String) { asDynamic().saveTable(filename) }


/**
 * Converts the Dictionary into a JSON file for local download.
 *
 * @method saveJSON
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100);
 *   background(200);
 *   text('click here to save', 10, 10, 70, 80);
 * }
 *
 * function mousePressed() {
 *   if (mouseX > 0 && mouseX < width && mouseY > 0 && mouseY < height) {
 *     createStringDict({
 *       john: 1940,
 *       paul: 1942,
 *       george: 1943,
 *       ringo: 1940
 *     }).saveJSON('beatles');
 *   }
 * }
 * </code>
 * </div>
 */
inline fun <T> p5.TypedDict<T>.saveJSON(filename: String, opt: Boolean? = undefined) { asDynamic().saveJson(filename, opt) }


/**
 * Add the given number to the value currently stored at the given key.
 * The sum then replaces the value previously stored in the Dictionary.
 *
 * @method add
 * @param {Number} [key] for the value you wish to add to
 * @param {Number} [amount] to add to the value
 * @example
 * <div class='norender'>
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict(2, 5);
 *   myDictionary.add(2, 2);
 *   print(myDictionary.get(2)); // logs 7 to console.
 * }
 * </code></div>
 *
 */
inline fun p5.NumberDict.add(key: Number, amount: Number) { asDynamic().add(key, amount) }


/**
 * Subtract the given number from the value currently stored at the given key.
 * The difference then replaces the value previously stored in the Dictionary.
 *
 * @method sub
 * @param {Number} [key] for the value you wish to subtract from
 * @param {Number} [amount] to subtract from the value
 * @example
 * <div class='norender'>
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict(2, 5);
 *   myDictionary.sub(2, 2);
 *   print(myDictionary.get(2)); // logs 3 to console.
 * }
 * </code></div>
 *
 */
inline fun p5.NumberDict.sub(key: Number, amount: Number) { asDynamic().sub(key, amount) }


/**
 * Multiply the given number with the value currently stored at the given key.
 * The product then replaces the value previously stored in the Dictionary.
 *
 * @method mult
 * @param {Number} [key] for value you wish to multiply
 * @param {Number} [amount] to multiply the value by
 * @example
 * <div class='norender'>
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict(2, 4);
 *   myDictionary.mult(2, 2);
 *   print(myDictionary.get(2)); // logs 8 to console.
 * }
 * </code></div>
 *
 */
inline fun p5.NumberDict.mult(key: Number, amount: Number) { asDynamic().mult(key, amount) }


/**
 * Divide the given number with the value currently stored at the given key.
 * The quotient then replaces the value previously stored in the Dictionary.
 *
 * @method div
 * @param {Number} [key] for value you wish to divide
 * @param {Number} [amount] to divide the value by
 * @example
 * <div class='norender'>
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict(2, 8);
 *   myDictionary.div(2, 2);
 *   print(myDictionary.get(2)); // logs 4 to console.
 * }
 * </code></div>
 *
 */
inline fun p5.NumberDict.div(key: Number, amount: Number) { asDynamic().div(key, amount) }


/**
 * Return the lowest number currently stored in the Dictionary.
 *
 * @method minValue
 * @return {Number}
 * @example
 * <div class='norender'>
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict({ 2: -10, 4: 0.65, 1.2: 3 });
 *   let lowestValue = myDictionary.minValue(); // value is -10
 *   print(lowestValue);
 * }
 * </code></div>
 */
inline fun p5.NumberDict.minValue(): Number = asDynamic().minValue() as Number


/**
 * Return the highest number currently stored in the Dictionary.
 *
 * @method maxValue
 * @return {Number}
 * @example
 * <div class='norender'>
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict({ 2: -10, 4: 0.65, 1.2: 3 });
 *   let highestValue = myDictionary.maxValue(); // value is 3
 *   print(highestValue);
 * }
 * </code></div>
 */
inline fun p5.NumberDict.maxValue(): Number = asDynamic().maxValue() as Number


/**
 * Return the lowest key currently used in the Dictionary.
 *
 * @method minKey
 * @return {Number}
 * @example
 * <div class='norender'>
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict({ 2: 4, 4: 6, 1.2: 3 });
 *   let lowestKey = myDictionary.minKey(); // value is 1.2
 *   print(lowestKey);
 * }
 * </code></div>
 */
inline fun p5.NumberDict.minKey(): Number = asDynamic().minKey() as Number


/**
 * Return the highest key currently used in the Dictionary.
 *
 * @method maxKey
 * @return {Number}
 * @example
 * <div class='norender'>
 * <code>
 * function setup() {
 *   let myDictionary = createNumberDict({ 2: 4, 4: 6, 1.2: 3 });
 *   let highestKey = myDictionary.maxKey(); // value is 4
 *   print(highestKey);
 * }
 * </code></div>
 */
inline fun p5.NumberDict.maxKey(): Int = asDynamic().maxKey() as Int
