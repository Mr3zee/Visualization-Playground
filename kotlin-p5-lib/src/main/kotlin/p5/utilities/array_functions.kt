@file:Suppress("unused")

package p5.utilities

import p5.core.p5

/**
 * Randomizes the order of the elements of an array. Implements
 * <a href='http://Bost.Ocks.org/mike/shuffle/' target=_blank>
 * Fisher-Yates Shuffle Algorithm</a>.
 *
 * @method shuffle
 * @param  {Array} [arr] Array to shuffle
 * @param  {Boolean} [inPlace] modify passed array
 * @return {Array} shuffled Array
 * @example
 * <div><code>
 * function setup() {
 *   let regularArr = ['ABC', 'def', createVector(), TAU, Math.E];
 *   print(regularArr);
 *   shuffle(regularArr, true); // force modifications to passed array
 *   print(regularArr);
 *
 *   // By default shuffle() returns a shuffled cloned array:
 *   let newArr = shuffle(regularArr);
 *   print(regularArr);
 *   print(newArr);
 * }
 * </code></div>
 */
inline fun <T> p5.shuffle(arr: Array<T>, inPlace: Boolean? = undefined): Array<T> =
    asDynamic().shuffle(arr, inPlace).unsafeCast<Array<T>>()

inline fun <T> p5.shuffle(arr: List<T>, inPlace: Boolean? = undefined): List<T> =
    asDynamic().shuffle(arr, inPlace).unsafeCast<List<T>>()

