@file:Suppress("unused")

package p5.utilities

import p5.core.p5


/**
 * Converts a string to its floating point representation. The contents of a
 * string must resemble a number, or NaN (not a number) will be returned.
 * For example, float("1234.56") evaluates to 1234.56, but float("giraffe")
 * will return NaN.
 *
 * When an array of values is passed in, then an array of floats of the same
 * length is returned.
 *
 * @method float
 * @param {String} [str] float string to parse
 * @return {Number} floating point representation of string
 *
 * @example
 * <div><code>
 *   let str = '20';
 *   let diameter = float(str);
 *   ellipse(width / 2, height / 2, diameter, diameter);
 * </code></div>
 *
 * <div class='norender'><code>
 *   print(float('10.31')); // 10.31
 *   print(float('Infinity')); // Infinity
 *   print(float('-Infinity')); // -Infinity
 * </code></div>
 *
 * @alt
 * 20 by 20 white ellipse in the center of the canvas
 */
inline fun p5.float(str: String): Float = asDynamic().float(str) as Float


/**
 * Converts a boolean, string, or float to its integer representation.
 * When an array of values is passed in, then an int array of the same length
 * is returned.
 *
 * @method int
 * @param {String|Boolean|Number} [n] value to parse
 * @param {Integer} [radix] the radix to convert to (default: 10)
 * @return {Number} integer representation of value
 *
 * @example
 * <div class='norender'><code>
 * print(int('10')); // 10
 * print(int(10.31)); // 10
 * print(int(-10)); // -10
 * print(int(true)); // 1
 * print(int(false)); // 0
 * print(int([false, true, '10.3', 9.8])); // [0, 1, 10, 9]
 * print(int(Infinity)); // Infinity
 * print(int('-Infinity')); // -Infinity
 * </code></div>
 */
inline fun p5.int(n: Number, radix: Int? = undefined): Int = asDynamic().int(n, radix) as Int

inline fun p5.int(n: String, radix: Int? = undefined): Int = asDynamic().int(n, radix) as Int

inline fun p5.int(n: Boolean, radix: Int? = undefined): Int = asDynamic().int(n, radix) as Int

inline fun p5.int(n: Array<Number>, radix: Int? = undefined): Array<Int> = asDynamic().int(n, radix).unsafeCast<Array<Int>>()

inline fun p5.int(n: Array<String>, radix: Int? = undefined): Array<Int> = asDynamic().int(n, radix).unsafeCast<Array<Int>>()

inline fun p5.int(n: Array<Boolean>, radix: Int? = undefined): Array<Int> = asDynamic().int(n, radix).unsafeCast<Array<Int>>()


/**
 * Converts a boolean, string or number to its string representation.
 * When an array of values is passed in, then an array of strings of the same
 * length is returned.
 *
 * @method str
 * @param {String|Boolean|Number|Array} [n] value to parse
 * @return {String} string representation of value
 * @example
 * <div class='norender'><code>
 * print(str('10')); // "10"
 * print(str(10.31)); // "10.31"
 * print(str(-10)); // "-10"
 * print(str(true)); // "true"
 * print(str(false)); // "false"
 * print(str([true, '10.3', 9.8])); // [ "true", "10.3", "9.8" ]
 * </code></div>
 */
inline fun p5.str(n: String): String = asDynamic().str(n) as String

inline fun p5.str(n: Number): String = asDynamic().str(n) as String

inline fun p5.str(n: Boolean): String = asDynamic().str(n) as String

inline fun p5.str(n: Array<String>): Array<String> = asDynamic().str(n).unsafeCast<Array<String>>()

inline fun p5.str(n: Array<Number>): Array<String> = asDynamic().str(n).unsafeCast<Array<String>>()

inline fun p5.str(n: Array<Boolean>): Array<String> = asDynamic().str(n).unsafeCast<Array<String>>()


/**
 * Converts a number or string to its boolean representation.
 * For a number, any non-zero value (positive or negative) evaluates to true,
 * while zero evaluates to false. For a string, the value "true" evaluates to
 * true, while any other value evaluates to false. When an array of number or
 * string values is passed in, then an array of booleans of the same length is
 * returned.
 *
 * @method boolean
 * @param {String|Boolean|Number|Array} [n] value to parse
 * @return {Boolean} boolean representation of value
 * @example
 * <div class='norender'><code>
 * print(boolean(0)); // false
 * print(boolean(1)); // true
 * print(boolean('true')); // true
 * print(boolean('abcd')); // false
 * print(boolean([0, 12, 'true'])); // [false, true, true]
 * </code></div>
 */
inline fun p5.boolean(n: String): Boolean = asDynamic().boolean(n) as Boolean

inline fun p5.boolean(n: Number): Boolean = asDynamic().boolean(n) as Boolean

inline fun p5.boolean(n: Boolean): Boolean = asDynamic().boolean(n) as Boolean

inline fun p5.boolean(n: Array<String>): Array<Boolean> = asDynamic().boolean(n).unsafeCast<Array<Boolean>>()

inline fun p5.boolean(n: Array<Number>): Array<Boolean> = asDynamic().boolean(n).unsafeCast<Array<Boolean>>()

inline fun p5.boolean(n: Array<Boolean>): Array<Boolean> = asDynamic().boolean(n).unsafeCast<Array<Boolean>>()


/**
 * Converts a number, string representation of a number, or boolean to its byte
 * representation. A byte can be only a whole number between -128 and 127, so
 * when a value outside this range is converted, it wraps around to the
 * corresponding byte representation. When an array of number, string or boolean
 * values is passed in, then an array of bytes the same length is returned.
 *
 * @method byte
 * @param {String|Boolean|Number} [n] value to parse
 * @return {Number} byte representation of value
 *
 * @example
 * <div class='norender'><code>
 * print(byte(127)); // 127
 * print(byte(128)); // -128
 * print(byte(23.4)); // 23
 * print(byte('23.4')); // 23
 * print(byte('hello')); // NaN
 * print(byte(true)); // 1
 * print(byte([0, 255, '100'])); // [0, -1, 100]
 * </code></div>
 */
inline fun p5.byte(n: String): Byte = asDynamic().byte(n) as Byte

inline fun p5.byte(n: Number): Byte = asDynamic().byte(n) as Byte

inline fun p5.byte(n: Boolean): Byte = asDynamic().byte(n) as Byte

inline fun p5.byte(n: Array<String>): Array<Byte> = asDynamic().byte(n).unsafeCast<Array<Byte>>()

inline fun p5.byte(n: Array<Number>): Array<Byte> = asDynamic().byte(n).unsafeCast<Array<Byte>>()

inline fun p5.byte(n: Array<Boolean>): Array<Byte> = asDynamic().byte(n).unsafeCast<Array<Byte>>()


/**
 * Converts a number or string to its corresponding single-character
 * string representation. If a string parameter is provided, it is first
 * parsed as an integer and then translated into a single-character string.
 * When an array of number or string values is passed in, then an array of
 * single-character strings of the same length is returned.
 *
 * @method char
 * @param {String|Number} [n] value to parse
 * @return {String} string representation of value
 *
 * @example
 * <div class='norender'><code>
 * print(char(65)); // "A"
 * print(char('65')); // "A"
 * print(char([65, 66, 67])); // [ "A", "B", "C" ]
 * print(join(char([65, 66, 67]), '')); // "ABC"
 * </code></div>
 */
inline fun p5.char(n: String): String = asDynamic().char(n) as String

inline fun p5.char(n: Number): String = asDynamic().char(n) as String

inline fun p5.char(n: Array<String>): Array<String> = asDynamic().char(n).unsafeCast<Array<String>>()

inline fun p5.char(n: Array<Number>): Array<String> = asDynamic().char(n).unsafeCast<Array<String>>()


/**
 * Converts a single-character string to its corresponding integer
 * representation. When an array of single-character string values is passed
 * in, then an array of integers of the same length is returned.
 *
 * @method unchar
 * @param {String} [n] value to parse
 * @return {Number} integer representation of value
 *
 * @example
 * <div class='norender'><code>
 * print(unchar('A')); // 65
 * print(unchar(['A', 'B', 'C'])); // [ 65, 66, 67 ]
 * print(unchar(split('ABC', ''))); // [ 65, 66, 67 ]
 * </code></div>
 */
inline fun p5.unchar(n: Char): Int = asDynamic().unchar(n) as Int

inline fun p5.unchar(n: Array<Char>): Array<Int> = asDynamic().unchar(n).unsafeCast<Array<Int>>()


/**
 * Converts a number to a string in its equivalent hexadecimal notation. If a
 * second parameter is passed, it is used to set the number of characters to
 * generate in the hexadecimal notation. When an array is passed in, an
 * array of strings in hexadecimal notation of the same length is returned.
 *
 * @method hex
 * @param {Number} [n] value to parse
 * @param {Number} [digits]
 * @return {String} hexadecimal string representation of value
 *
 * @example
 * <div class='norender'><code>
 * print(hex(255)); // "000000FF"
 * print(hex(255, 6)); // "0000FF"
 * print(hex([0, 127, 255], 6)); // [ "000000", "00007F", "0000FF" ]
 * print(Infinity); // "FFFFFFFF"
 * print(-Infinity); // "00000000"
 * </code></div>
 */
inline fun p5.hex(n: Int, digits: Int? = undefined): String = asDynamic().hex(n, digits) as String

inline fun p5.hex(n: Array<Int>, digits: Int? = undefined): Array<String> = asDynamic().hex(n, digits).unsafeCast<Array<String>>()


/**
 * Converts a string representation of a hexadecimal number to its equivalent
 * integer value. When an array of strings in hexadecimal notation is passed
 * in, an array of integers of the same length is returned.
 *
 * @method unhex
 * @param {String} [n] value to parse
 * @return {Number} integer representation of hexadecimal value
 *
 * @example
 * <div class='norender'><code>
 * print(unhex('A')); // 10
 * print(unhex('FF')); // 255
 * print(unhex(['FF', 'AA', '00'])); // [ 255, 170, 0 ]
 * </code></div>
 */
inline fun p5.unhex(n: String): Int = asDynamic().unhex(n) as Int

inline fun p5.unhex(n: Array<String>): Array<Int> = asDynamic().unhex(n).unsafeCast<Array<Int>>()
