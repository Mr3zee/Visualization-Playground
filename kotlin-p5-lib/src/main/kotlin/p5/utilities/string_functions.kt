@file:Suppress("unused")

package p5.utilities

import p5.core.p5


/**
 * Combines an array of Strings into one String, each separated by the
 * character(s) used for the separator parameter. To join arrays of ints or
 * floats, it's necessary to first convert them to Strings using <a href="#/p5/nf">nf()</a> or
 * nfs().
 *
 * @method join
 * @param  {Array} [list] array of Strings to be joined
 * @param  {String} [separator] String to be placed between each item
 * @return {String} joined String
 * @example
 * <div>
 * <code>
 *   let array = ['Hello', 'world!'];
 *   let separator = ' ';
 *   let message = join(array, separator);
 *   text(message, 5, 50);
 * </code>
 * </div>
 *
 * @alt
 * "hello world!" displayed middle left of canvas.
 */
inline fun p5.join(list: Array<String>, separator: String): String = asDynamic().join(list, separator) as String


/**
 * This function is used to apply a regular expression to a piece of text,
 * and return matching groups (elements found inside parentheses) as a
 * String array. If there are no matches, a null value will be returned.
 * If no groups are specified in the regular expression, but the sequence
 * matches, an array of length 1 (with the matched text as the first element
 * of the array) will be returned.
 *
 * To use the function, first check to see if the result is null. If the
 * result is null, then the sequence did not match at all. If the sequence
 * did match, an array is returned.
 *
 * If there are groups (specified by sets of parentheses) in the regular
 * expression, then the contents of each will be returned in the array.
 * Element [0] of a regular expression match returns the entire matching
 * string, and the match groups start at element [1] (the first group is [1],
 * the second [2], and so on).
 *
 * @method match
 * @param  {String} [str] the String to be searched
 * @param  {String} [reg] the regexp to be used for matching
 * @return {String[]} Array of Strings found
 * @example
 * <div>
 * <code>
 *   let string = 'Hello p5js*!';
 *   let regexp = 'p5js\\*';
 *   let m = match(string, regexp);
 *   text(m, 5, 50);
 * </code>
 * </div>
 *
 * @alt
 * "p5js*" displayed middle left of canvas.
 */
inline fun p5.match(str: String, reg: String): Array<String>? = asDynamic().match(str, reg).unsafeCast<Array<String>?>()


/**
 * This function is used to apply a regular expression to a piece of text,
 * and return a list of matching groups (elements found inside parentheses)
 * as a two-dimensional String array. If there are no matches, a null value
 * will be returned. If no groups are specified in the regular expression,
 * but the sequence matches, a two-dimensional array is still returned, but
 * the second dimension is only of length one.
 *
 * To use the function, first check to see if the result is null. If the
 * result is null, then the sequence did not match at all. If the sequence
 * did match, a 2D array is returned.
 *
 * If there are groups (specified by sets of parentheses) in the regular
 * expression, then the contents of each will be returned in the array.
 * Assuming a loop with counter variable i, element [i][0] of a regular
 * expression match returns the entire matching string, and the match groups
 * start at element [i][1] (the first group is [i][1], the second [i][2],
 * and so on).
 *
 * @method matchAll
 * @param  {String} [str] the String to be searched
 * @param  {String} [reg] the regexp to be used for matching
 * @return {String[]} 2d Array of Strings found
 * @example
 * <div class="norender">
 * <code>
 *   let string = 'Hello p5js*! Hello world!';
 *   let regexp = 'Hello';
 *   matchAll(string, regexp);
 * </code>
 * </div>
 */
inline fun p5.matchAll(str: String, reg: String): Array<Array<String>>? =
    asDynamic().matchAll(str, reg).unsafeCast<Array<Array<String>>?>()


/**
 * Utility function for formatting numbers into strings. There are two
 * versions: one for formatting floats, and one for formatting ints.
 *
 * The values for the digits, left, and right parameters should always
 * be positive integers.
 *
 * (NOTE): Be cautious when using left and right parameters as it prepends numbers of 0's if the parameter
 * is greater than the current length of the number.
 *
 * For example if number is 123.2 and left parameter passed is 4 which is greater than length of 123
 * (integer part) i.e 3 than result will be 0123.2. Same case for right parameter i.e. if right is 3 than
 * the result will be 123.200.
 *
 * @method nf
 * @param {Number|String} [n] the Number to format
 * @param {Integer} [left] number of digits to the left of the decimal point
 * @param {Integer} [right] number of digits to the right of the decimal point
 * @return {String} formatted String
 *
 * @example
 * <div>
 * <code>
 * function setup() {
 *   background(200);
 *   let num1 = 321;
 *   let num2 = -1321;
 *
 *   noStroke();
 *   fill(0);
 *   textSize(16);
 *
 *   text(nf(num1, 4, 2), 10, 30);
 *   text(nf(num2, 4, 2), 10, 80);
 *   // Draw dividing line
 *   stroke(120);
 *   line(0, 50, width, 50);
 * }
 * </code>
 * </div>
 *
 * @alt
 * "0321.00" middle top, -1321.00" middle bottom canvas
 */
inline fun p5.nf(n: Number, left: Int, right: Int): String =
    asDynamic().nf(n, left, right).unsafeCast<String>()

inline fun p5.nf(n: Array<Number>, left: Int, right: Int): Array<String> =
    asDynamic().nfp(n, left, right).unsafeCast<Array<String>>()


/**
 * Utility function for formatting numbers into strings and placing
 * appropriate commas to mark units of 1000. There are two versions: one
 * for formatting ints, and one for formatting an array of ints. The value
 * for the right parameter should always be a positive integer.
 *
 * @method nfc
 * @param  {Number} [n] the Number to format
 * @param  {Integer} [right] number of digits to the right of the decimal point
 * @return {String} formatted String
 *
 * @example
 * <div>
 * <code>
 * function setup() {
 *   background(200);
 *   let num = 11253106.115;
 *   let numArr = [1, 1, 2];
 *
 *   noStroke();
 *   fill(0);
 *   textSize(12);
 *
 *   // Draw formatted numbers
 *   text(nfc(num, 4), 10, 30);
 *   text(nfc(numArr, 2), 10, 80);
 *
 *   // Draw dividing line
 *   stroke(120);
 *   line(0, 50, width, 50);
 * }
 * </code>
 * </div>
 *
 * @alt
 * "11,253,106.115" top middle and "1.00,1.00,2.00" displayed bottom mid
 */
inline fun p5.nfc(n: Number, right: Int): String =
    asDynamic().nfc(n, right).unsafeCast<String>()

inline fun p5.nfc(n: Array<Number>, right: Int): Array<String> =
    asDynamic().nfc(n, right).unsafeCast<Array<String>>()


/**
 * Utility function for formatting numbers into strings. Similar to <a href="#/p5/nf">nf()</a> but
 * puts a "+" in front of positive numbers and a "-" in front of negative
 * numbers. There are two versions: one for formatting floats, and one for
 * formatting ints. The values for left, and right parameters
 * should always be positive integers.
 *
 * @method nfp
 * @param {Number} [n] the Number to format
 * @param {Integer} [left] number of digits to the left of the decimal point
 * @param {Integer} [right] number of digits to the right of the decimal point
 * @return {String} formatted String
 *
 * @example
 * <div>
 * <code>
 * function setup() {
 *   background(200);
 *   let num1 = 11253106.115;
 *   let num2 = -11253106.115;
 *
 *   noStroke();
 *   fill(0);
 *   textSize(12);
 *
 *   // Draw formatted numbers
 *   text(nfp(num1, 4, 2), 10, 30);
 *   text(nfp(num2, 4, 2), 10, 80);
 *
 *   // Draw dividing line
 *   stroke(120);
 *   line(0, 50, width, 50);
 * }
 * </code>
 * </div>
 *
 * @alt
 * "+11253106.11" top middle and "-11253106.11" displayed bottom middle
 */
inline fun p5.nfp(n: Number, left: Int, right: Int): String =
    asDynamic().nfp(n, left, right).unsafeCast<String>()

inline fun p5.nfp(n: Array<Number>, left: Int, right: Int): Array<String> =
    asDynamic().nfp(n, left, right).unsafeCast<Array<String>>()


/**
 * Utility function for formatting numbers into strings. Similar to <a href="#/p5/nf">nf()</a> but
 * puts an additional "_" (space) in front of positive numbers just in case to align it with negative
 * numbers which includes "-" (minus) sign.
 *
 * The main use case of nfs() can be seen when one wants to align the digits (place values) of a non-negative
 * number with some negative number (See the example to get a clear picture).
 * There are two versions: one for formatting float, and one for formatting int.
 *
 * The values for the digits, left, and right parameters should always be positive integers.
 *
 * (IMP): The result on the canvas basically the expected alignment can vary based on the typeface you are using.
 *
 * (NOTE): Be cautious when using left and right parameters as it prepends numbers of 0's if the parameter
 * is greater than the current length of the number.
 *
 * For example if number is 123.2 and left parameter passed is 4 which is greater than length of 123
 * (integer part) i.e 3 than result will be 0123.2. Same case for right parameter i.e. if right is 3 than
 * the result will be 123.200.
 *
 * @method nfs
 * @param {Number} [n] the Number to format
 * @param {Integer} [left] number of digits to the left of the decimal point
 * @param {Integer} [right] number of digits to the right of the decimal point
 * @return {String} formatted String
 *
 * @example
 * <div>
 * <code>
 * function setup() {
 *   background(200);
 *   let num1 = 321;
 *   let num2 = -1321;
 *
 *   noStroke();
 *   fill(0);
 *   textSize(16);
 *
 *   // nfs() aligns num1 (positive number) with num2 (negative number) by
 *   // adding a blank space in front of the num1 (positive number)
 *   // [left = 4] in num1 add one 0 in front, to align the digits with num2
 *   // [right = 2] in num1 and num2 adds two 0's after both numbers
 *   // To see the differences check the example of nf() too.
 *   text(nfs(num1, 4, 2), 10, 30);
 *   text(nfs(num2, 4, 2), 10, 80);
 *   // Draw dividing line
 *   stroke(120);
 *   line(0, 50, width, 50);
 * }
 * </code>
 * </div>
 *
 * @alt
 * "0321.00" top middle and "-1321.00" displayed bottom middle
 */
inline fun p5.nfs(n: Number, left: Int, right: Int): String =
    asDynamic().nfs(n, left, right).unsafeCast<String>()

inline fun p5.nfs(n: Array<Number>, left: Int, right: Int): Array<String> =
    asDynamic().nfs(n, left, right).unsafeCast<Array<String>>()


/**
 * The <a href="#/p5/split">split()</a> function maps to String.split(), it breaks a String into
 * pieces using a character or string as the delimiter. The delim parameter
 * specifies the character or characters that mark the boundaries between
 * each piece. A String[] array is returned that contains each of the pieces.
 *
 * The <a href="#/p5/splitTokens">splitTokens()</a> function works in a similar fashion, except that it
 * splits using a range of characters instead of a specific character or
 * sequence.
 *
 * @method split
 * @param  {String} [value] the String to be split
 * @param  {String} [delim] the String used to separate the data
 * @return {String[]}  Array of Strings
 * @example
 * <div>
 * <code>
 * let names = 'Pat,Xio,Alex';
 * let splitString = split(names, ',');
 * text(splitString[0], 5, 30);
 * text(splitString[1], 5, 50);
 * text(splitString[2], 5, 70);
 * </code>
 * </div>
 *
 * @alt
 * "pat" top left, "Xio" mid left and "Alex" displayed bottom left
 */
inline fun p5.split(value: String, delim: String? = undefined): Array<String> =
    asDynamic().split(value, delim).unsafeCast<Array<String>>()

inline fun p5.split(value: String, delim: Char): Array<String> =
    asDynamic().split(value, delim).unsafeCast<Array<String>>()


/**
 * The <a href="#/p5/splitTokens">splitTokens()</a> function splits a String at one or many character
 * delimiters or "tokens." The delim parameter specifies the character or
 * characters to be used as a boundary.
 *
 * If no delim characters are specified, any whitespace character is used to
 * split. Whitespace characters include tab (\t), line feed (\n), carriage
 * return (\r), form feed (\f), and space.
 *
 * @method splitTokens
 * @param  {String} [value] the String to be split
 * @param  {String} [delims] list of individual Strings that will be used as separators
 * @return {String[]} Array of Strings
 * @example
 * <div class = "norender">
 * <code>
 * function setup() {
 *   let myStr = 'Mango, Banana, Lime';
 *   let myStrArr = splitTokens(myStr, ',');
 *
 *   print(myStrArr); // prints : ["Mango"," Banana"," Lime"]
 * }
 * </code>
 * </div>
 */
inline fun p5.splitTokens(value: String, delims: Array<String>): Array<String> =
    asDynamic().splitTokens(value, delims).unsafeCast<Array<String>>()

inline fun p5.splitTokens(value: String): Array<String> =
    asDynamic().splitTokens(value).unsafeCast<Array<String>>()


/**
 * Removes whitespace characters from the beginning and end of a String. In
 * addition to standard whitespace characters such as space, carriage return,
 * and tab, this function also removes the Unicode "nbsp" character.
 *
 * @method trim
 * @param  {String} [str] a String to be trimmed
 * @return {String} a trimmed String
 *
 * @example
 * <div>
 * <code>
 * let string = trim('  No new lines\n   ');
 * text(string + ' here', 2, 50);
 * </code>
 * </div>
 *
 * @alt
 * "No new lines here" displayed center canvas
 */
inline fun p5.trim(str: String): String = asDynamic().trim(str) as String

inline fun p5.trim(str: Array<String>): Array<String> = asDynamic().trim(str) as Array<String>
